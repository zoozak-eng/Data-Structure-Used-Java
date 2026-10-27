package DataStructure;

import static DataStructure.TutionSystem.ProcessPayment;

public class Systemsobj {
    static void main(String[] args){
      StudentSystem[] obj=new StudentSystem[6];
        obj[0]=new UndergraduateStudent("JU001","Zamzam Abdi",300,18);
        obj[1]=new MasterStudent("JU003","FATIMA HASAN",500,800);
        obj[2]=new DiplomaStudent("JU005","MOHAMED OMAR",240,6);
        obj[3]=new UndergraduateStudent("JU106","AHMAD ALI",350,9);
        obj[4]=new MasterStudent("JU189","Muna Ahmaed",900,100);
        obj[5]=new DiplomaStudent("JU121","Aisha Ahmad",100,5);

        System.out.println("-------Students------");

        for (StudentSystem o:obj){
            System.out.println(" ");
            o.Disblay();
            System.out.println(" ");
        }

        System.out.println("---PAYMENT PROCESSING");
        ProcessPayment(obj[0],100);

        System.out.println("---INVALID PAYMENT---");
        ProcessPayment(obj[2],1000 );

        double total=0,totalpaid=0,totalBlance=0;
        for (StudentSystem o:obj){

            total+=o.CalculateTuitionFee();
            totalpaid+=o.AmuntPaid;
            totalBlance+=o.getbalance();
        }
        System.out.println("---FINANCIAL SUMMARY---");
        System.out.println("Total Tution: $"+total);
        System.out.println("Total Payments: $"+totalpaid);
        System.out.println("Total Blance: $"+totalBlance);


        }
    }

