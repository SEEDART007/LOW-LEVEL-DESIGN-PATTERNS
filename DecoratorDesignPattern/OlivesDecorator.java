package DecoratorDesignPattern;

public class OlivesDecorator extends PizzaDecorator{
    public String getDescription(){
        return pizza.getDescription() + " Olives";
    }

    public OlivesDecorator(Pizza pizza) {
        super(pizza);
    }

    public int getCost(){
        return pizza.getCost()+100;
    }
}
