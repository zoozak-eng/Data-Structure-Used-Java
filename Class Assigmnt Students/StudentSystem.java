package DataStructure;
class InvalidPayment extends Exception {
    InvalidPayment(String message) {
        super(message);
    }
}

public abstract class  StudentSystem {
    String StudID;
    String Name;
    String ProgramName;
    double AmuntPaid;

    StudentSystem(String studID,String name,String programName,double amuntPaid){
        this.StudID=studID;
        this.Name=name;
        this.ProgramName=programName;
        this.AmuntPaid=amuntPaid;
    }


    abstract double CalculateTuitionFee();

    double getbalance(){
       return CalculateTuitionFee() - AmuntPaid;
    }

    void MakePayment(double amount)throws InvalidPayment{
        if (amount<=0){
            throw new InvalidPayment("Payment must more then zero");
        }
        if (AmuntPaid > getbalance()){
            throw new InvalidPayment("Payment Exceed Outstanding");
        }
        AmuntPaid+=amount;
    }
  public void Disblay(){
        System.out.println("Student Id:"+StudID);
        System.out.println("Name:"+Name);
        System.out.println("Program Name:"+ProgramName);
        System.out.println("AmuntPaid: $"+AmuntPaid);
        System.out.println("Tution: $"+CalculateTuitionFee());
      System.out.println("Blance: $"+getbalance());
    }
}
 class UndergraduateStudent extends StudentSystem{
    int CreditHours;
    UndergraduateStudent(String studID,String name,double amuntPaid,int creditHours){
        super(studID,name,"Undergraduate",amuntPaid);
        if (creditHours <= 0){
            throw new IllegalArgumentException("Can not be negative");
        }
        this.CreditHours=creditHours;
    }
    @Override
    double CalculateTuitionFee() {
      return CreditHours*25;
    }
 }
class MasterStudent extends StudentSystem{
    int Semsterfee;

    MasterStudent(String studID,String name,double amuntPaid,int semsterfee){
        super(studID,name,"Master",amuntPaid);
        if (semsterfee <= 0){
            throw new IllegalArgumentException("Can nt be negative");
        }
        this.Semsterfee=semsterfee;

    }
     @Override
    double CalculateTuitionFee() {
        return Semsterfee+100;
    }
}
class DiplomaStudent extends StudentSystem{
    int NumOfCours;

    DiplomaStudent(String studID,String name,double amuntPaid,int numOfCours){
        super(studID,name,"Diploma",amuntPaid);
        if (numOfCours<=0){
            throw new IllegalArgumentException("NUMBER OF COURSES CAN NOT BE NEGATIVE");
        }
        this.NumOfCours=numOfCours;
    }

    @Override
  double CalculateTuitionFee() {
        return NumOfCours*40;
    }
    }
     class TutionSystem{
    static void ProcessPayment(StudentSystem s,double amount){
        System.out.println("Student Id:"+s.StudID);
        System.out.println("Payment Amount: $"+amount);
        try {
            s.MakePayment(amount);
            System.out.println("Payment Successful");
            System.out.println("Udate Blance: $"+s.getbalance());
        }catch (InvalidPayment e){
            System.out.println("Payment Faild");
            System.out.println("Error:"+e.getMessage());
        }
        finally {
            System.out.println("Transction Compleatid");
        }
    }
    }














