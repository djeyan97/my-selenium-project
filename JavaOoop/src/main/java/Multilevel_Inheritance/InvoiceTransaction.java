package Multilevel_Inheritance;

public class InvoiceTransaction extends PaymentTransaction{
    String invoiceNumber;

    public InvoiceTransaction(double amount, String connectionId, String invoiceNumber) {
        super(amount, connectionId);
        this.invoiceNumber = invoiceNumber;
    }

    public void generatePdf(){
        System.out.println("PDF Generated for Invoice Number: #" + invoiceNumber);
    }

    @Override
    public void processTransaction() {
        System.out.println("The Transaction is being processed for : Rs." + amount + " with ConnectionID :" + connectionId);
    }

    public static void main(String[] args) {

        InvoiceTransaction invoice = new InvoiceTransaction(45000,"AZURE-CONN-0078","INV002");
        invoice.logTransaction();
        invoice.commitTransaction();
        invoice.validateAmount();
        invoice.processTransaction();
        invoice.generatePdf();
    }


}
