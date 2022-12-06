package AdapterDesignPattern;

public class RazorPay {


     String payViaCC(String cn, String cvv, String expDate){

         String transID = cn+cvv;

         return transID;
     }

     String PaymentStatus(String transID){

         return "success";
     }


}
