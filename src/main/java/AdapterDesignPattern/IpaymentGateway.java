package AdapterDesignPattern;

import java.util.Date;

public interface IpaymentGateway {

    public String payViaCC(int cv, int cvv, Date dt);
    public PaymentStatus getPaymentStatus(String id);


}
