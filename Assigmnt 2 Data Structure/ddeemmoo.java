package DataStructure;

public class ddeemmoo {
    static void main() {

      MidicalService obj=new Consultation("123.","Consultation.",10,15);
      obj.Totalcost();
      obj.disblayServicinfo();
        System.out.println(" ");
      MidicalService obj1=new Laboratory_Test("133.","Laboratory Test.",10,20);
      obj1.Totalcost();
      obj1.disblayServicinfo();
        System.out.println(" ");
      MidicalService obj2=new UlraSound("143.","Ultra Sound.",10,30);
      obj2.Totalcost();
      obj2.disblayServicinfo();
        System.out.println("========================");
        double total=0;

        total+= obj.Totalcost()+ obj1.Totalcost()+ obj2.Totalcost();
        System.out.println("Total Hospital Bill: $"+total);

    }
}
