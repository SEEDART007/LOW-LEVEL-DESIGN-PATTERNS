package StrategyDesignPattern;

public class ZIP implements CompressionStrategy{
    public void compress(){
        System.out.println("ZIP Compression");
    }
}
