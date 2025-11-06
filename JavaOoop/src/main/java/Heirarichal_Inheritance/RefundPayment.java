package Heirarichal_Inheritance;

public class RefundPayment extends Payment {
    String customerId;

    public RefundPayment(double amount, String reference, String customerId){
        super(amount, reference);
        this.customerId = customerId;
    }

    public void notifyCustomer() {
        System.out.println("Refund Notification sent to the Customer ID: " + customerId);
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Refund Amount of Rs." + amount + " is processed for the Customer ID: " + customerId);
    }
}
