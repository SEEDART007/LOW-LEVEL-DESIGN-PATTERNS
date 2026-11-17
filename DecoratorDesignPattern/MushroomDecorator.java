package DecoratorDesignPattern;

public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription(){
        return pizza.getDescription() + " Mushroom";
    }
    public int getCost(){
        return pizza.getCost()+150;
    }
}
