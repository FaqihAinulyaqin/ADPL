package UML;

public class Social {
    private int idPesan;
    private int idPengirim;
    private int idPenerima;
    private String kontenPesan;
    private String penerima;

    public Social() {
        // Default constructor
    }

    // Getter and Setter methods

    public int getIdPesan() {
        return idPesan;
    }

    public void setIdPesan(int idPesan) {
        this.idPesan = idPesan;
    }

    public int getIdPengirim() {
        return idPengirim;
    }

    public void setIdPengirim(int idPengirim) {
        this.idPengirim = idPengirim;
    }

    public int getIdPenerima() {
        return idPenerima;
    }

    public void setIdPenerima(int idPenerima) {
        this.idPenerima = idPenerima;
    }
}
