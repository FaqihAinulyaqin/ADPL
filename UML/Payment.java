public class Payment {
    // Attributes
    private String id;
    private String orderID;
    private boolean paid;
    private double total;
    private String details;

    // Constructor
    public Payment(String id, String orderID, double total, String details) {
        this.id = id;
        this.orderID = orderID;
        this.total = total;
        this.details = details;
        this.paid = false; // Set default value to false
    }

    // Methods
    public void sendOTP() {
        // Implement sendOTP functionality
    }

    public boolean confirmTransaction(String enteredOTP) {
        // Implement OTP verification and transaction confirmation
        return true; // Placeholder, actual implementation will vary
    }

    public String getPaymentDetails() {
        // Implement logic to retrieve payment details
        return details;
    }

    public void makeTransaction() {
        // Implement logic to process the transaction
        paid = true;
    }

    public static Payment createDataPayment(String id, String orderID, double total, String details) {
        // Factory method to create a Payment object
        return new Payment(id, orderID, total, details);
    }

    // Getter methods (optional)
    public String getId() {
        return id;
    }

    public String getOrderID() {
        return orderID;
    }

    public boolean isPaid() {
        return paid;
    }

    public double getTotal() {
        return total;
    }

    public String getDetails() {
        return details;
    }
}

