package Hospital;
import javax.naming.Name;

public class Bukaan {
    String Name;
    int feenum;

    Bukaan(String name,int Feenum){
        this.Name=name;
        this.feenum=Feenum;
    }
    public void Display(){
        System.out.println("Bukaanka Magacisa:"+Name);
        System.out.println("Lcgta Numbarka:"+feenum);

    }
}
class Bukaansocod extends Bukaan{
   double Labcharges;

   Bukaansocod(String name,int feenum, double labcharges){
       super(name,feenum);
       this.Labcharges=labcharges;

   }
   public double CalculateBill(){
       return Labcharges+feenum;
   }


}

class BukaanJiif extends Bukaan{
    double Roomcharges;
    int NumbrOfDays;

     BukaanJiif(String name,int feenum,double roomcharges,int numbrOfDays) {
         super(name, feenum);
         this.Roomcharges = roomcharges;
         this.NumbrOfDays = numbrOfDays;

     }
   public double CalculateBill(){
         return (Roomcharges*NumbrOfDays)+feenum;
   }

    }


