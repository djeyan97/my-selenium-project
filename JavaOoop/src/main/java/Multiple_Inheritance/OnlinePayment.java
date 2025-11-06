package Multiple_Inheritance;

interface OnlinePayment {
    void processOnlinePayment(double amount);
}

interface OfflinePayment{
    void processOfflinePayment(double amount);
}

    class StorePayment implements OnlinePayment, OfflinePayment{
    String billNumber;
    double amount;



    public StorePayment(double amount, String billNumber){
        this.billNumber = billNumber;
        this.amount = amount;
    }


    @Override
    public void processOnlinePayment(double amount) {
        System.out.println("Online Payment of: Rs." + amount + " for Bill Number: " + billNumber + " is being processed via Payment Gateway - RazorPay");
    }

    @Override
    public void processOfflinePayment(double amount){
        System.out.println("Offline Payment of: Rs." + amount + " for Bill Number: " + billNumber + " is being processed at Store via POS - PineLab");
    }

        public static void main(String[] args) {


        OnlinePayment online = new StorePayment(5000, "#6787465");
        OfflinePayment offline = new StorePayment(5000, "#1078565");

        online.processOnlinePayment(4999);
        offline.processOfflinePayment(1450);

        }




}