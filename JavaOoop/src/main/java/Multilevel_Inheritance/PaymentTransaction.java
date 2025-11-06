package Multilevel_Inheritance;

public class PaymentTransaction extends DataBaseTransaction{
    double amount;

    public PaymentTransaction(double amount, String connectionId) {
        super(connectionId);
        this.amount = amount;
    }

    public void validateAmount() {
        System.out.println("Amount is valid for : Rs." + amount);
    }

    public void processTransaction() {
        System.out.println("Processing Transaction : Rs." + amount + " for connectionId: " + connectionId);
    }

}
