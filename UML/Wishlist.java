package UML;

import java.util.List;

public class Wishlist {
    private int wishlistID;
    private int userID;
    private List<String> items;

    public Wishlist() {
        // Default constructor
    }

    // Getter and Setter methods

    public int getWishlistID() {
        return wishlistID;
    }

    public void setWishlistID(int wishlistID) {
        this.wishlistID = wishlistID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

}
