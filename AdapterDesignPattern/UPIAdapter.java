package AdapterDesignPattern;

public class UPIAdapter implements PaymentService{
    UPIGateway upiGateway;
    public UPIAdapter(UPIGateway upiGateway){
        this.upiGateway = upiGateway;
    }
    public String pay(int amount,int cid){
        int res = upiGateway.doPayment(Double.valueOf(amount),cid);
        if(res==1){
            return "SUCCESS";
        }
        return "FAILED";
    }
}
