package UML;
public class Login {
    private String DataPembeli, DataPenjual;
    
    private String GetDataPembeli() {
        return this.DataPembeli;
    }

    private String GetDataPenjual() {
        return this.DataPenjual;
    }

    public Boolean VerifyLogin() {
        return Pembeli.password == this.GetDataPembeli() || Penjual.password == this.GetDataPenjual() ;
    } 
}