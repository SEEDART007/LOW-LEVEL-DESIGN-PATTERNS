package StrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Notification email = new Email(new AESEncryption(),new ZIP());
        email.encrypt();
        email.compress();
        email.send();
        Notification sms = new Sms(new AESEncryption(), new GZIP());
        sms.encrypt();
        sms.compress();
        Notification push = new Push(new RSAEncryption(), new GZIP());
        push.encrypt();
        push.compress();


    }
}
