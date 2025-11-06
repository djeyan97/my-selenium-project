package Multilevel_Inheritance;

public class DataBaseTransaction {

    String connectionId;

    public DataBaseTransaction(String connectionId) {
        this.connectionId = connectionId;
    }

    public void logTransaction() {
        System.out.println("Logged to DB: Connection " + connectionId);
    }

    public void commitTransaction() {
        System.out.println("Transaction Committed");
    }

}
