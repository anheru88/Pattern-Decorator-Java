/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFiles;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import strategyPattern.Student;
import java.util.ArrayList;

/**
 *
 * @author anheru
 */
public class JsonWriteFilesStrategy implements IWriteFilesStrategy {

    public void write(ArrayList<Student> S) {

        Gson gson = new Gson();
       
        try {
            FileWriter file = new FileWriter("students.json");
            file.write("{ 'students' : ");
            file.write(gson.toJson(S));
            file.write("}");
            file.flush();
            file.close();
            System.out.println("File Created Sussefully");
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
