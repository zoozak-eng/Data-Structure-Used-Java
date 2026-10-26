package DataStructure;

import javax.swing.*;

public class EmployeeSalaryMangmentSystem { //supclass
    //Data Fildes
    int id;
    String Name;
    String Department;
    double Salary;
    String Cetogrey;


    EmployeeSalaryMangmentSystem(int id,String name,String department,double salary,String Cetogry){//constractur
        //identfiyar the data fildes and the parameters
        this.id=id;
        this.Name=name;
        this.Department=department;
        this.Salary=salary;
        this.Cetogrey=Cetogry;
    }

    public double CalculateSalary() {//Method For Calculating The Salary
     return Salary;
    }


    public void Disblay (){ //Method For Disblay Information
        System.out.println("Employe ID:"+id);
        System.out.println("Employe Name:"+Name);
        System.out.println("Department:"+Department);
        System.out.println("Category:"+Cetogrey);
        System.out.println("Salary Monthly:"+CalculateSalary());
    }

}

