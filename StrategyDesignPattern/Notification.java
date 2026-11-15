package StrategyDesignPattern;

public abstract class Notification {
    EncryptionStrategy encryptionStrategy;
    CompressionStrategy compressionStrategy;
    public Notification(EncryptionStrategy encryptionStrategy,CompressionStrategy compressionStrategy){
        this.compressionStrategy = compressionStrategy;
        this.encryptionStrategy = encryptionStrategy;
    }
    abstract void send();

    void encrypt(){
        encryptionStrategy.encrypt();
    }
    void compress(){
        compressionStrategy.compress();
    }
}
