package StrategyDesignPattern;

public class RSAEncryption implements EncryptionStrategy{
    public void encrypt(){
        System.out.println("RSA Encryption");
    }
}
