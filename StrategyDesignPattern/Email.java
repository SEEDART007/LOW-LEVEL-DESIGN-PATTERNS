package StrategyDesignPattern;

public class Email extends Notification{
    public Email(EncryptionStrategy encryptionStrategy,CompressionStrategy compressionStrategy){
        super(encryptionStrategy,compressionStrategy);
    }
    public void send(){
        System.out.println("SENDING EMAIL");
    }
}
