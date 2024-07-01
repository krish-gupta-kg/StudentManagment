package main.com.studentmanagement.util;

import main.com.studentmanagement.model.*;
import main.com.studentmanagement.model.Student;
import java.io.Serializable;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class FileUtil {

    public static void writeToFile(List<Student> students, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(students);
            System.out.println("Students saved to file succesfully");

        } catch (IOException e){
            e.printStackTrace();

        }

    }
    public static List<Student> readFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            students = (List<Student>) ois.readObject();
            System.out.println("Students loaded from file Succesfully");
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();

        }
        return students;
    }
    
}
