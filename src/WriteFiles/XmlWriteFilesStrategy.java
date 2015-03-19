/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFiles;

import Patron_Strategy.Student;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author anheru
 */
public class XmlWriteFilesStrategy implements IWriteFilesStrategy {

    @Override
    public void Write(ArrayList<Student> S) {
        String name = "XmlStudents";
        if (S.isEmpty()) {
            System.out.println("ERROR Empty Arraylist of Students");
        } else {
            try {
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
                DocumentBuilder builder = factory.newDocumentBuilder();
                DOMImplementation implementation = builder.getDOMImplementation();
                Document doc = implementation.createDocument(null, name, null);
                doc.setXmlVersion("1.0");


                Element rootElement = doc.createElement("Students");
                

                for (Student s : S) {
                    //Student Node
                    Element itemNode = doc.createElement("student");
                    rootElement.appendChild(itemNode);

//                    //Name Node
//                    Element nameNode = doc.createElement("name");
//                    Text nodeNameValue = doc.createTextNode(s.getName());
//                    nameNode.appendChild(nodeNameValue);
//
//                    //Code Node
//                    Element codeNode = doc.createElement("code");
//                    Text nodeCodeValue = doc.createTextNode(s.getCode());
//                    codeNode.appendChild(nodeCodeValue);
//                    
//                    //Age Node
//                    Element ageNode = doc.createElement("age");
//                    Text nodeAgeValue = doc.createTextNode(s.getAge());
//                    ageNode.appendChild(nodeAgeValue);
//                    
//                    //Sex Node
//                    
//                    //Address Node
//                    
//                    //append keyNode and valueNode to itemNode
//                    itemNode.appendChild(nameNode);
//                    itemNode.appendChild(codeNode);
//                    //append itemNode to raiz
//                    rootElement.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
                }
                
                Source source = new DOMSource(doc);
                
                // Set the path as save.
                
                Result result = new StreamResult(new java.io.File("/Files/"+name+".xml")); //nombre del archivo
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.transform(source, result);
            } catch (Exception e) {
                System.out.println("Ups Somethings is Wrong: " + e.getMessage());
            }

        }
    }

}
