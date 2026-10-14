package Hospital;

public class Disblay {
    static void main() {
        //Bukaansocod Objects
        Bukaansocod B1=new Bukaansocod("Ahmad Ali Farah",7,67.7);
        System.out.println("Patient Name:"+B1.Name);
        System.out.println("Consulation Fee:$"+B1.feenum);
        System.out.println("Laab Charges:"+B1.Labcharges);
        System.out.println("Total Of The Charges Is:$"+B1.CalculateBill());
        System.out.println(" ");

        Bukaansocod B2=new Bukaansocod("Farhiya Ousamn Abdi",7,80);
        System.out.println("Patient Name:"+B2.Name);
        System.out.println("Consulation Fee:$"+B2.feenum);
        System.out.println("Laab Charges:"+B2.Labcharges);
        System.out.println("Total Of The Charges Is:$"+B2.CalculateBill());
        System.out.println(" ");

        Bukaansocod B3=new Bukaansocod("Ali Yusuf Abdi",6,90);
        System.out.println("Patient Name:"+B3.Name);
        System.out.println("Consulation Fee:$"+B3.feenum);
        System.out.println("Laab Charges:"+B3.Labcharges);
        System.out.println("Total Of The Charges Is:$"+B3.CalculateBill());
        System.out.println(" ");

        Bukaansocod B4=new Bukaansocod("Xawa Ahmad Khasim",7,87.5);
        System.out.println("Patient Name:"+B4.Name);
        System.out.println("Consulation Fee:$"+B4.feenum);
        System.out.println("Laab Charges:"+B4.Labcharges);
        System.out.println("Total Of The Charges Is:$"+B4.CalculateBill());
        System.out.println(" ");

        System.out.println(" ");
        //Bukaanjiif Objects
        BukaanJiif P1=new BukaanJiif("Amino Adam Ali",10,50,6);
        System.out.println("Patient Name:"+P1.Name);
        System.out.println("Consulation Fee: $"+P1.feenum);
        System.out.println("The Day Of Inpatient:"+P1.NumbrOfDays);
        System.out.println("Rooms All Is Vip Only And The Charges Is: $ "+P1.Roomcharges);
        System.out.println("Total Of The Charges Is: $"+P1.CalculateBill());
        System.out.println(" ");

        BukaanJiif P2=new BukaanJiif("Abdi Warsame Ahmad",10,50,4);
        System.out.println("Patient Name:"+P2.Name);
        System.out.println("Consulation Fee:$"+P2.feenum);
        System.out.println("The Day Of Inpatient:"+P2.NumbrOfDays);
        System.out.println("Rooms All Is Vip Only And The Charges Is: $ "+P2.Roomcharges);
        System.out.println("Total Of The Charges Is: $"+P2.CalculateBill());
        System.out.println(" ");

        BukaanJiif P3=new BukaanJiif("Shamsa Abdi Mohamed",10,50,10);
        System.out.println("Patient Name:"+P3.Name);
        System.out.println("Consulation Fee:$"+P3.feenum);
        System.out.println("The Day Of Inpatient:"+P3.NumbrOfDays);
        System.out.println("Rooms All Is Vip Only And The Charges Is: $ "+P3.Roomcharges);
        System.out.println("Total Of The Charges Is: $"+P3.CalculateBill());
        System.out.println(" ");

        BukaanJiif P4=new BukaanJiif("Cumar Ahmad Jaama",10,50,9);
        System.out.println("Patient Name:"+P4.Name);
        System.out.println("Consulation Fee:$"+P4.feenum);
        System.out.println("The Day Of Inpatient:"+P4.NumbrOfDays);
        System.out.println("Rooms All Is Vip Only And The Charges Is: $ "+P4.Roomcharges);
        System.out.println("Total Of The Charges Is: $"+P4.CalculateBill());




    }

}
