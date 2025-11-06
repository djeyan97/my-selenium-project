package Single_Inheritance;

public class Payment {

    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("SingleInheritanceExample.Payment is being processed for Rs: ");
    }

    public void validatePayment() {
        if (amount > 0) {
            System.out.println("Amount is valid for Rs: " + amount);
        } else {
            System.out.println("Invalid amount: " + "Retry SingleInheritanceExample.Payment");
        }

        }

        public double getAmount() {
        return amount;
        }


}
