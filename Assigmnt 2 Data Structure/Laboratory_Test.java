package DataStructure;

public class Laboratory_Test extends MidicalService {
    int Labservic;

    Laboratory_Test(String serviceId,String serviceName,int basecost,int labservic){
        super(serviceId,serviceName,basecost);
        this.Labservic=labservic;
    }

    @Override
    int Totalcost() {
        return basecost+Labservic;
    }
}
