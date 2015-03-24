/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFiles;

import strategyPattern.Student;
import java.util.ArrayList;

/**
 *
 * @author anheru
 */
public interface IWriteFilesStrategy {

    public void write(ArrayList<Student> S);

}
