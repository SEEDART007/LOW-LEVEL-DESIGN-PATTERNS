package AdapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        new PaymentClient(new UPIAdapter(new UPIGateway())).makePayment();
    }
}
