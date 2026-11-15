package StrategyDesignPattern;

public class Push extends Notification{
    public Push(EncryptionStrategy encryptionStrategy,CompressionStrategy compressionStrategy){
        super(encryptionStrategy,compressionStrategy);
    }
    public void send(){
        System.out.println("SENDING PUSH NOTIFICATION");
    }
}
