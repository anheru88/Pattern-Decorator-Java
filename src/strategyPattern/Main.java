/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyPattern;

import WriteFiles.JsonWriteFilesStrategy;
import strategyPattern.StudentManager;
import WriteFiles.XmlWriteFilesStrategy;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anheru
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> S = new ArrayList();
        Scanner Scan = new Scanner(System.in);
        String n, dato;
        int num;

        System.out.println("Pleace digit the number of students to save.");
        n = Scan.nextLine();
        num = parseInt(n);

        for (int i = 0; i < num; i++) {
            Student s = new Student();
            System.out.println("Please set the name of the student # " + (i + 1));
            dato = Scan.nextLine();
            s.setName(dato);
            System.out.println("Please set the code of the student # " + (i + 1));
            dato = Scan.nextLine();
            s.setCode(dato);
            System.out.println("Please set the age of the student # " + (i + 1));
            dato = Scan.nextLine();
            s.setAge(parseInt(dato));
            do {
                System.out.println("Please set the sex of the student # " + (i + 1) + "like so");
                System.out.println("(M) Masculine, (F) Femenine");
                dato = Scan.nextLine();
            } while (dato == "M" || dato == "F");
            s.setSex(dato);
            System.out.println("Please set the address of the student # " + (i + 1));
            dato = Scan.nextLine();
            s.setAddress(dato);
            S.add(s);
        }

        StudentManager manager = new StudentManager(new XmlWriteFilesStrategy());
        manager.WriteFile(S);
    }

}
