package DecoratorDesignPattern;

public class MargheritaPizza implements Pizza{
    public String getDescription(){
        return "MargheritaPizza";
    }
    public int getCost(){
        return 200;
    }
}
