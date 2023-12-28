package UML;

import java.util.Date;

public class Checkout {
    private int id;
    private int sellerID;
    private int customerID;
    private int productID;
    private float totalAmount;
    private Date orderDate;
    private String address;
    private Date deliveryDate;
    private String deliveryStatus;

    // Constructors
    public Checkout(int id, int sellerID, int customerID, int productID, float totalAmount, Date orderDate,
                    String address, Date deliveryDate, String deliveryStatus) {
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

    // Getter and Setter methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSellerID() {
        return sellerID;
    }

    public void setSellerID(int sellerID) {
        this.sellerID = sellerID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
