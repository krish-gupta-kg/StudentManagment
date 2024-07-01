package main.com.studentmanagement.model;
import java.io.Serializable;

public class Graduate extends Student{
    public Graduate(String id, String name, String course) {
        super(id,name,course);
    }
    public String getStudentType(){
        return "Graduate";
    }
    
}
