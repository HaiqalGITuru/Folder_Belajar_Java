package kampus;

public class GedungKampus {
    private String namaGedung;
    private int jumlahLantai;
    
    public GedungKampus(String namaGedung, int jumlahLantai) {
        this.namaGedung = namaGedung;
        this.jumlahLantai = jumlahLantai;
    }
    
    public String getNamaGedung() {
        return namaGedung;
    }
    
    public void setNamaGedung(String namaGedung) {
        this.namaGedung = namaGedung;
    }
    
    public int getJumlahLantai() {
        return jumlahLantai;
    }
    
    public void setJumlahLantai() {
        this.jumlahLantai = jumlahLantai;
    }
     public void tampilkanGedung() {
         System.out.println("Gedung: " + namaGedung);
         System.out.println("Jumlah Lantai:" + jumlahLantai );
     }
}
