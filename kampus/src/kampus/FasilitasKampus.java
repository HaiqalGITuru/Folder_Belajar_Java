package kampus;

public class FasilitasKampus extends GedungKampus {
    private int jumlahRuang;
    private String[] daftarFasilitas;
    
    public FasilitasKampus(String namaGedung, int jumlahLantai, int jumlahRuang, String[] daftarFasilitas) {
        super(namaGedung, jumlahLantai);
        this.jumlahRuang = jumlahRuang;
        this.daftarFasilitas = daftarFasilitas;
    }
    
    public int getJumlahRuang() {
        return jumlahRuang;
    }
    
    public void setJumlahRuang(int jumlahRuang) {
        this.jumlahRuang = jumlahRuang;
    }
    
    public String[] getDaftarFasilitas() {
        return daftarFasilitas;
    }
    
    public void setDaftarFasilitas(String[] daftarFasilitas) {
        this.daftarFasilitas = daftarFasilitas;
    }
    
    public void infoKampus(){
        System.out.println("Informasi Gedung Kampus");
        tampilkanGedung();
        System.out.println("Jumlah Ruang: " + jumlahRuang);
        System.out.println("Fasilitas: ");
        for (String f : daftarFasilitas) {
            System.out.println(f + " ");
        }
        
       System.out.println("\n--------------------------------");
    }
    }

