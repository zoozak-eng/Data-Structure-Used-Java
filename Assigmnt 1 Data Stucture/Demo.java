package DataStructure;

public class Demo {
    static void main() {
        //polymorphism part
        EmployeeSalaryMangmentSystem[] employees=new EmployeeSalaryMangmentSystem[4];
        employees[0]=new EmployeeSalaryMangmentSystem(110,"Zamzam Abdulaziz","MULTUMEDIA",4000,"PART-TIME");
        employees[1]=new Full_time(120,"Shukri Abdulahi","Computer Application",3000,"PART-TIME",30.5);
        employees[2]=new Part_Time(130,"Samira Axmed","CYPERSCURITY",5000,"FULL TIME",80,20);
        employees[3]=new Managers(140,"Zamzam Hassan","Manager",6000,"All Time",90);

        System.out.println("=====Emplyes Salary Properts");

        for (EmployeeSalaryMangmentSystem e:employees){
            System.out.println("");
            e.Disblay();

        }
    }
}
