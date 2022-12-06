package AdapterDesignPattern;

import java.util.Date;

public class PaymentGatewayAdapter implements IpaymentGateway{

    RazorPay r = new RazorPay() ;


    String trans = null;
    @Override
    public String payViaCC(int cc , int cvv, Date dt) {


        String card = String.valueOf(cc);
        String cvvN = String.valueOf(cvv);
        String dat = String.valueOf(dt);


         trans =  r.payViaCC(card,cvvN,dat);

        return trans;
    }

    @Override
    public PaymentStatus getPaymentStatus(String id) {

        if(r.PaymentStatus(trans).equals("success"))
            return PaymentStatus.SUCCESS;
        return PaymentStatus.FAIL;
    }
}
