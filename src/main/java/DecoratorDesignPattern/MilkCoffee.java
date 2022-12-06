package DecoratorDesignPattern;

public class MilkCoffee implements ICoffee{

    ICoffee c ;
    MilkCoffee(ICoffee c){
        this.c= c;
    }
    @Override
    public String getIngredients() {
        return c.getIngredients()+" Milk";
    }

    @Override
    public int getCost() {
        return c.getCost()+2;
    }
}
