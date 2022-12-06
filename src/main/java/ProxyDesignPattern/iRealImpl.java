package ProxyDesignPattern;

public class iRealImpl implements iReal{

    @Override
    public void process() {
        System.out.println("Do some real work");
    }
}
