package Heirarichal_Inheritance;

public class Payment {

    double amount;
    String reference;

    public Payment(double amount, String reference) {
        this.amount = amount;
        this.reference = reference;
    }

    public void validatePayment() {
        if (amount > 0) {
            System.out.println("Payment Amount: Rs." + amount + " is valid");
        } else  {
            System.out.println("Invalid Payment");
        }

    }

    public void processPayment(){
        System.out.println("Processing Payment with generic reference: " + reference);
    }


}
