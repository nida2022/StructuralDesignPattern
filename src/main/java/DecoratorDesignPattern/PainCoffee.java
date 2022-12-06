package DecoratorDesignPattern;

public class PainCoffee implements ICoffee{
    @Override
    public String getIngredients() {
        return "Plain coffee";
    }

    @Override
    public int getCost() {
        return 10;
    }
}
