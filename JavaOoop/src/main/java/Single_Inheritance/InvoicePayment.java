package Single_Inheritance;

public class InvoicePayment extends Payment{
    String invoiceNumber;

    public InvoicePayment(double amount, String invoiceNumber) {
        super(amount);
        this.invoiceNumber = invoiceNumber;

    }

    public void appliedDiscount() {
        double discountAmount = amount * 0.9;
        System.out.println("Original Amount: Rs." + amount + " & Amount after applied discount: Rs." + discountAmount);

    }

    @Override
    public void processPayment() {
        System.out.println("SingleInheritanceExample.Payment is being processed for the Invoice Number: #" + invoiceNumber);

    }

    public static void main(String[] args) {

        InvoicePayment invoice = new InvoicePayment(5000, "INV001");
        invoice.processPayment();
        invoice.validatePayment();
        invoice.appliedDiscount();

    }




}
