public class DataOrder {
    // Attributes
    private String id;
    private String sellerID;
    private String customerID;
    private String productID;
    private double totalAmount;
    private String orderDate;
    private String address;
    private String deliveryDate;
    private String deliveryStatus;

    // Constructor
    public DataOrder(String id, String sellerID, String customerID, String productID,
                     double totalAmount, String orderDate, String address,
                     String deliveryDate, String deliveryStatus) {
        this.id = id;
        this.sellerID = sellerID;
        this.customerID = customerID;
        this.productID = productID;
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.address = address;
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
    }

    // Method
    public String getOrderID() {
        return id;
    }

    // Getter methods (optional)
    public String getSellerID() {
        return sellerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getProductID() {
        return productID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getAddress() {
        return address;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }
}
