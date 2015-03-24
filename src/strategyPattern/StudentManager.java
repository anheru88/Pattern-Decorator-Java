/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import strategyPattern.Student;
import WriteFiles.IWriteFilesStrategy;
import java.util.ArrayList;

/**
 *
 * @author anheru
 */
public class StudentManager {
    private IWriteFilesStrategy WriteFileStrategy;

    public StudentManager(IWriteFilesStrategy strategy) {
        this.WriteFileStrategy = strategy;
    }
    
    public void WriteFile(ArrayList<Student> S)
    {
        this.WriteFileStrategy.write(S);
    }
    
    
}
