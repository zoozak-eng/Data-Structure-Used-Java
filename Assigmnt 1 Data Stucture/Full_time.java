package DataStructure;

public class Full_time extends EmployeeSalaryMangmentSystem {

        double allwoence;

        Full_time(int id,String name,String department,double salary,String Cetogry,double allwoence){
            super(id,name,department,salary,Cetogry);
            this.allwoence=allwoence;
        }

        @Override   //We Used Override To rebits the method
        public double CalculateSalary() {
            return super.CalculateSalary()+allwoence;
        }

    }


