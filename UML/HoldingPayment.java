package UML;

public class HoldingPayment {
    private String IDPembeli;
    private String IDPenjual;
    private String PaymentID;
    private int TotalPayment;

    public HoldingPayment(){
        // Default constructor
    }

    // Getter and Setter methods

    public String getIDPembeli() {
        return IDPembeli;
    }

    public void setIDPembeli(String buyerID) {
        this.IDPembeli = IDPembeli;
    }

    public String getIDPenjual() {
        return IDPenjual;
    }

    public void setIDPenjual(String sellerID) {
        this.IDPenjual = IDPenjual;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public void setPaymentID(String paymentID) {
        this.PaymentID = PaymentID;
    }

    public int getTotalPayment() {
        return TotalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.TotalPayment = TotalPayment;
    }
}
