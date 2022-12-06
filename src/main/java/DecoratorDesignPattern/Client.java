package DecoratorDesignPattern;

public class Client {

    public static void main(String[] args) {

        ICoffee c =  new MilkCoffee(new WithSugar(new PainCoffee()));





        System.out.println(c.getIngredients() +" "+ c.getCost());
    }
}
