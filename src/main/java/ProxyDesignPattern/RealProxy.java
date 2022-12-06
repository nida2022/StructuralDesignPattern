package ProxyDesignPattern;

public class RealProxy implements iReal{

    iRealImpl obj ;
    @Override
    public void process() {
        if(obj == null) {
            obj = new iRealImpl();
            System.out.println("Object Created");
        }
        System.out.println("Proxy doing work");
        obj.process();


    }
}
