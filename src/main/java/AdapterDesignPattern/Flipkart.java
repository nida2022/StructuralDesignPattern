package AdapterDesignPattern;

import java.util.Date;

public class Flipkart {

    IpaymentGateway pg;

    Flipkart(IpaymentGateway pg ){
        this.pg= pg;
    }

    public void makePaymentViaCC(int cv, int cvv, Date dt) {

        String s = pg.payViaCC(cv,cvv,dt);

        while(!pg.getPaymentStatus(s).equals(PaymentStatus.SUCCESS)){
            System.out.println("waiting");
        }
        System.out.println("Payment Done");
    }



}
