package UML;

import java.util.List;

public class HalamanProduk {
    private List<DataProduk> dataProduk;
    private List<Wishlist> wishlist;
    private String search;
    private String checkout;
    private Social social;

    public HalamanProduk() {
        // Default constructor
    }

    // Getter and Setter methods

    public List<DataProduk> getDataProduk() {
        return dataProduk;
    }

    public void setDataProduk(List<DataProduk> dataProduk) {
        this.dataProduk = dataProduk;
    }

    public List<Wishlist> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Wishlist> wishlist) {
        this.wishlist = wishlist;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public Social getSocial() {
        return social;
    }

    public void setSocial(Social social) {
        this.social = social;
    }

    // Add other methods as needed
}
