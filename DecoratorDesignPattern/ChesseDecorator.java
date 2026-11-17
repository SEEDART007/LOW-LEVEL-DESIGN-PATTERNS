package DecoratorDesignPattern;

public class ChesseDecorator extends PizzaDecorator{
    public String getDescription(){
        return pizza.getDescription() + " Cheese";
    }

    public ChesseDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getCost(){
        return pizza.getCost()+50;
    }
}
