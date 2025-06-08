package siswasmk;

public class SiswaSMK {
    private String nama;
    private String jurusan;
    private int tingkat;
    
    //Konstruktor
    public SiswaSMK(String nama, String jurusan, int tingkat) {
        this.nama = nama;
        this.jurusan = jurusan;
        this.tingkat = tingkat;
    }
    
    //Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }
    public void setTingkat(int tingkat){
        this.tingkat = tingkat;
    }
    
    //Accessor (Getter)
    public String getNama(){
        return nama;
    }
    public String getJurusan(){
        return jurusan;
    }
    public int getTingkat(){
        return tingkat;
    }
    
    public void tampilkanData() {
        System.out.println("=================================================");
        System.out.println("Nama : " + getNama());
        System.out.println("Jurusan : " + getJurusan());
        System.out.println("Tingkat : " + getTingkat());
        System.out.println("=================================================");
    }
}
