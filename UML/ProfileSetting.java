package UML;

import java.util.List;

public class ProfileSetting {
    private int userID;
    private String nama;
    private String email;
    private String telepon;
    private String alamat;
    private List<String> pesanan;
    private String language;

    public ProfileSetting() {
        // Default constructor
    }

    // Getter and Setter methods

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<String> getPesanan() {
        return pesanan;
    }

    public void setPesanan(List<String> pesanan) {
        this.pesanan = pesanan;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    // Add other methods as needed
}
