/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFiles;

import java.io.File;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import strategyPattern.Student;

/**
 *
 * @author anheru
 */
public class XmlWriteFilesStrategy implements IWriteFilesStrategy {

    public void write(ArrayList<Student> S) {
        String name = "students";
        if (S.isEmpty()) {
            System.out.println("ERROR Empty Arraylist of Students");
        } else {
            try {

                DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

                // root elements
                Document doc = docBuilder.newDocument();
                Element rootElement = doc.createElement("Students");
                doc.appendChild(rootElement);

                for (Student s : S) {
                    Element student = doc.createElement("student");
                    rootElement.appendChild(student);

                    Element studentName = doc.createElement("name");
                    studentName.appendChild(doc.createTextNode(s.getName()));
                    student.appendChild(studentName);
                    
                    Element studentCode = doc.createElement("code");
                    studentCode.appendChild(doc.createTextNode(s.getCode()));
                    student.appendChild(studentCode);
                    
                    Element studentAge = doc.createElement("age");
                    studentAge.appendChild(doc.createTextNode("" + s.getAge()));
                    student.appendChild(studentAge);
                    
                    Element studentSex = doc.createElement("gender");
                    studentSex.appendChild(doc.createTextNode(s.getSex()));
                    student.appendChild(studentSex);
                    
                    Element studentAddress = doc.createElement("Address");
                    studentAddress.appendChild(doc.createTextNode(s.getAddress()));
                    student.appendChild(studentAddress);
                }

                // write the content into xml file
                TransformerFactory transformerFactory = TransformerFactory.newInstance();
                Transformer transformer = transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File("XmlStudents.xml"));

		// Output to console for testing
                // StreamResult result = new StreamResult(System.out);
                transformer.transform(source, result);

                System.out.println("File saved!");

            } catch (ParserConfigurationException pce) {
                pce.printStackTrace();
            } catch (TransformerException tfe) {
                tfe.printStackTrace();
            }

        }
    }
}
