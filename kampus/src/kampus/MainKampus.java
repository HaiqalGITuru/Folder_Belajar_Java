package kampus;

public class MainKampus {
    public static void main(String[] args) {
        String[] fasilitas1 = {"Ruang Kelas, Laboratorium, Perpustakaan, Musholla."};
        FasilitasKampus gedungA = new FasilitasKampus("Gedung A", 4, 20, fasilitas1);
        gedungA.infoKampus();
    }
}
