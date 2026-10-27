package DataStructure;

import javax.xml.transform.Source;
import java.util.Scanner;

public class Universty_Exam_Registration_invalid extends Exception {
    Universty_Exam_Registration_invalid(String message){
        super(message);
    }
}
class StudentRegist{
    String StudId;
    String StudName;
    int Age;
    double Mark;
    int subject;

    StudentRegist(String studId,String studName,int age,double mark,int subject){
        this.StudId=studId;
        this.StudName=studName;
        this.Age=age;
        this.Mark=mark;
        this.subject=subject;

    }

    void Validate()throws Universty_Exam_Registration_invalid{
        if (StudId.isEmpty() || StudId==null){
            throw new Universty_Exam_Registration_invalid("Student Id Cannot Be Empty.");
        }
        if (Mark<0 || Mark>100){
            throw new Universty_Exam_Registration_invalid("Exam Mark Must Be Between 0 And 100");
        }
        if (subject<1 || subject>5){
            throw new Universty_Exam_Registration_invalid("Subjects Must Be Between 1-5 only");
        }
    }
        void Disblay (){
            System.out.println("Registration Successful");
            System.out.println("Student Id :"+StudId);
            System.out.println("Student Name:"+StudName);
            System.out.println("Student Age :"+Age);
            System.out.println("Student Mark:"+Mark);
            System.out.println("Number Of Subjects:"+subject);
        }
        void Registr(){
        try {
            Validate();
            Disblay();

        }catch (Universty_Exam_Registration_invalid e){
            System.out.println("Registration Failed");
            System.out.println("Error:"+e.getMessage());
        }finally {
            System.out.println("Registration Attempt Completed.\n");
        }
    }
    }









