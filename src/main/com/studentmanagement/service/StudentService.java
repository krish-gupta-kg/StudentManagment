package main.com.studentmanagement.service;

import main.com.studentmanagement.model.*;
import main.com.studentmanagement.util.FileUtil;

import main.com.studentmanagement.model.Graduate;
import main.com.studentmanagement.model.Student;
import main.com.studentmanagement.model.Undergraduate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.Serializable;

public class StudentService {
    private List<Student> students;
    
    public StudentService (){
        this.students = new ArrayList<>();
    }

    public void addStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Student Type(1. UG, 2. Grad): ");
        int type = sc.nextInt();
        sc.nextLine();

   
        if (type ==1) {
            Undergraduate student;
            student = new Undergraduate(id,name,course);
            students.add(student);

        } else {
            Graduate student;

            student = new Graduate(id,name,course);
            students.add(student);

        }
        System.out.println("Students added");

    }
    public void displayStudents(){
        if(students.isEmpty()) {
            System.out.println("No students");
        } else {
            for (Student student : students) {
                System.out.println("ID: " + student.getID() + ", Name: " + student.getName() + ", Course: " + student.getCourse() + ", Type: " + student.getStudentType());
            }
        }

    }
    public void saveStudents() {
        main.com.studentmanagement.util.FileUtil.writeToFile(students, "students.txt");

    }
    public void loadStudents() {
        students = main.com.studentmanagement.util.FileUtil.readFromFile("students.txt");
        
    }
    
}
