public class DataPembeli {
    // Attributes
    private String usernamePembeli;
    private String passwordPembeli;

    // Constructor
    public DataPembeli(String usernamePembeli, String passwordPembeli) {
        this.usernamePembeli = usernamePembeli;
        this.passwordPembeli = passwordPembeli;
    }

    // Getter methods
    public String getUsernamePembeli() {
        return usernamePembeli;
    }

    public String getPasswordPembeli() {
        return passwordPembeli;
    }
}

