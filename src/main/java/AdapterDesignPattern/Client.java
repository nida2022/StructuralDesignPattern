package AdapterDesignPattern;

import java.util.Date;

public class Client {

    public static void main(String[] args) {
        IpaymentGateway p = new PaymentGatewayAdapter();

        Flipkart fk  = new Flipkart(p);
        fk.makePaymentViaCC(1,2,new Date());
    }
}
