package Heirarichal_Inheritance;

public class InvoicePayment extends Payment {
    String invoiceId;

    public InvoicePayment(double amount, String reference, String invoiceId) {
        super(amount, reference);
        this.invoiceId = invoiceId;
    }

    public void generatePdf(){
        System.out.println("PDF Generated for the Invoice Number: " + invoiceId);
    }

    public void sendEmail(){
        System.out.println("Invoice E-mail sent for Invoice Number: " + invoiceId);
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Payment is being processed for : Rs." + amount + " for the Invoice: " + invoiceId);
    }

}

