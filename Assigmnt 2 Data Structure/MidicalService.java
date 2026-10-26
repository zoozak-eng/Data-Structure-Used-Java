package DataStructure;

public abstract class MidicalService {
    String ServiceId;
    String ServiceName;
    int basecost;

    MidicalService(String serviceId,String serviceName,int basecost){
        this.ServiceId=serviceId;
        this.ServiceName=serviceName;
        this.basecost=basecost;
    }
     abstract int Totalcost();

    void disblayServicinfo(){
        System.out.println("===Hospital Billing System===");
        System.out.println("Service ID :"+ServiceId);
        System.out.println("Service Name :"+ServiceName);
        System.out.println("Total Cost :$"+Totalcost());
    }
}

