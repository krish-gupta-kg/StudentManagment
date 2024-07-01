package main.com.studentmanagement.model;
import java.io.Serializable;

public abstract class Student {
    protected String id;
    protected String name;
    protected String course;

    public Student(String id, String name, String course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    
    public String getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getCourse(){
        return course;
    }
    public abstract String getStudentType();

}
