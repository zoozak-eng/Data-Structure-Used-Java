package DataStructure;

public class Part_Time extends EmployeeSalaryMangmentSystem {
        int HouresWOrkly;
        int HourlyRate;

        Part_Time(int id,String name,String department,double salary,String Cetogry,int houres,int rate){
            super(id,name,department,salary,Cetogry);
            this.HouresWOrkly=houres;
            this.HourlyRate=rate;

        }

    @Override
    public double CalculateSalary() {
        return HouresWOrkly*HourlyRate;
    }
}


