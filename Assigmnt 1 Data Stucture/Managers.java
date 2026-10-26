package DataStructure;

public class Managers extends EmployeeSalaryMangmentSystem {

    double bouns;

    Managers(int id,String name,String department,double salary,String Cetogry,double bouns){
        super(id,name,department,salary,Cetogry);
        this.bouns=bouns;

    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary()+bouns;
    }
}
