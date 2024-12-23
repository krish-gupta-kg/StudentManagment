package main.com.studentmanagement ;
import java.util.Scanner;

import main.com.studentmanagement.service.StudentService;
import java.io.Serializable;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        
        while(true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display all students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    studentService.addStudent(sc);
                    break;
                case 2:
                    studentService.displayStudents();
                    break;
                case 3:
                    System.exit(0);
                default:
                System.out.println("Invalid Input");


            }
        }
        
    }

}
