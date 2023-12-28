package UML;

public class HoldingOrder {
    private String IDPembeli;
    private String IDPenjual;
    private String OrderID;
    private int OrderDate;

    public HoldingOrder(){
        // Default constructor
    }

    // Getter and Setter methods

    public String getIDPembeli() {
        return IDPembeli;
    }

    public void setIDPembeli(String IDPembeli) {
        this.IDPembeli = IDPembeli;
    }

    public String getIDPenjual() {
        return IDPenjual;
    }

    public void setIDPenjual(String IDPenjual) {
        this.IDPenjual = IDPenjual;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.orderID = OrderID;
    }

    public int getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(int OrderDate) {
        this.OrderDate = OrderDate;
    }
}
