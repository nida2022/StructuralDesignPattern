package ProxyDesignPattern;

public class Main {
    public static void main(String[] args) {

        iReal proxy = new RealProxy();
        proxy.process();
        proxy.process();
    }
}
