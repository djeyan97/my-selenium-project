package Heirarichal_Inheritance;

public class ProcessPayment{
    public static void main(String[] args) {
        InvoicePayment invoicePay = new InvoicePayment(25000,"REF-INV-003","INV-003");
        SalaryPayment salaryPay = new SalaryPayment(47000,"REF-SAL-DEC","EMP-19493");
        RefundPayment refundPay = new RefundPayment(10000,"REF-ref-900","CUS-789");

        invoicePay.validatePayment();
        invoicePay.generatePdf();
        invoicePay.sendEmail();
        invoicePay.processPayment();

        System.out.println("---------------------------------------------------");

        salaryPay.validatePayment();
        salaryPay.generatePaySlip();
        salaryPay.processPayment();

        System.out.println("---------------------------------------------------");

        refundPay.validatePayment();
        refundPay.notifyCustomer();
        refundPay.processPayment();

}
}