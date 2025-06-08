package siswasmk;

public class AplikasiSMK {
    public static void main(String[] args){
        SiswaSMK siswa1 = new SiswaSMK("Haiqal", "Teknik Komputer Jaringan", 12);
        siswa1.tampilkanData();
        
        SiswaSMK siswa2 = new SiswaSMK("Dheo", "Teknik Komputer Jaringan", 11);
        siswa2.tampilkanData();
        
        SiswaSMK siswa3 = new SiswaSMK("Arif", "Teknik Komputer Jaringan", 12);
        siswa3.tampilkanData();
        
       siswa3.setNama("Khairil");
       siswa3.setJurusan("Public Speaking");
       siswa3.setTingkat(11);
        System.out.println("Setelah Data Diubah : ");
        siswa3.tampilkanData();
    }
}
