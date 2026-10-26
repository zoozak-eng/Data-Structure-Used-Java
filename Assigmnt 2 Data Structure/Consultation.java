package DataStructure;

public class Consultation  extends MidicalService{
    int DrMoney;

    Consultation(String serviceId,String serviceName,int basecost,int drMoney){
        super(serviceId,serviceName,basecost);
        this.DrMoney=drMoney;
    }

    @Override
    int Totalcost() {
        return basecost+DrMoney;
    }
}

