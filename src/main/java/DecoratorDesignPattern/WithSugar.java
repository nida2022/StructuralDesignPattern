package DecoratorDesignPattern;

public class WithSugar implements ICoffee{

    ICoffee p ;

    WithSugar(ICoffee p ){
        this.p = p;
    }
    @Override
    public String getIngredients() {
        return p.getIngredients()+ " Sugar";
    }

    @Override
    public int getCost() {
        return p.getCost() +1;
    }
}
