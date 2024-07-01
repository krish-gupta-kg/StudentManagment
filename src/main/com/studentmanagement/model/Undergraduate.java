package main.com.studentmanagement.model;
import java.io.Serializable;

public class Undergraduate extends Student {
    public Undergraduate(String id, String name, String course){
        super(id, name, course);

    }
    public String getStudentType(){
        return"Undergraduate";
    }
    
}
