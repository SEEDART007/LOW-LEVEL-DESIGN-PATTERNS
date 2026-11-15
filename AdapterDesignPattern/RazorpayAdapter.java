package AdapterDesignPattern;

import java.util.Objects;

public class RazorpayAdapter implements PaymentService{
    RazorpayGateway razorpayGateway;

    public RazorpayAdapter(RazorpayGateway razorpayGateway){
        this.razorpayGateway = razorpayGateway;
    }
    public String pay(int amount , int customerId){
       boolean result = razorpayGateway.performTransaction(Double.valueOf(amount),Double.valueOf(customerId));
       if(result){
           return "SUCCESS";
       }
       return "FAILED";
    }
}
