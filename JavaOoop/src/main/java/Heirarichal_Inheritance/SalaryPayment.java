package Heirarichal_Inheritance;

public class SalaryPayment extends Payment {
    String employeeId;

    public SalaryPayment(double amount, String reference, String employeeId) {
        super(amount,reference);
        this.employeeId = employeeId;
    }

     public void generatePaySlip(){
        System.out.println("PaySlip Generated to the Employee ID: " + employeeId);
     }

     @Override
     public void processPayment(){
         super.processPayment();
         System.out.println("Salary Amount of Rs." + amount + " has been credited to the Employee ID: " + employeeId);
     }




}
