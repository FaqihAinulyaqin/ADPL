package UML;

import java.util.List;

public class Login {
    private List<Pembeli> dataPembeli;
    private List<Penjual> dataPenjual;
    private List<Admin> adminData;

    public Login() {
        // Default constructor
    }

    // Getter and Setter methods

    public List<Pembeli> getDataPembeli() {
        return dataPembeli;
    }

    public void setDataPembeli(List<Pembeli> dataPembeli) {
        this.dataPembeli = dataPembeli;
    }

    public List<Penjual> getDataPenjual() {
        return dataPenjual;
    }

    public void setDataPenjual(List<Penjual> dataPenjual) {
        this.dataPenjual = dataPenjual;
    }

    public List<Admin> getAdminData() {
        return adminData;
    }

    public void setAdminData(List<Admin> adminData) {
        this.adminData = adminData;
    }

    // Add other methods as needed
}