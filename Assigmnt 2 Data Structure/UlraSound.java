package DataStructure;

public class UlraSound extends MidicalService{
    int UltraCost;

    UlraSound(String serviceId,String serviceName,int basecost,int ultraCost){
        super(serviceId,serviceName,basecost);
        this.UltraCost=ultraCost;
    }

    @Override
    int Totalcost() {
        return basecost+UltraCost;
    }
}
