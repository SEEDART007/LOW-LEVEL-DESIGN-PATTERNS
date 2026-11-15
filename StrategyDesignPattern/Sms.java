package StrategyDesignPattern;

public class Sms extends Notification{
    public Sms(EncryptionStrategy encryptionStrategy,CompressionStrategy compressionStrategy){
        super(encryptionStrategy,compressionStrategy);
    }
    public void send(){
        System.out.println("SMS NOTIFICATION");
    }
}
