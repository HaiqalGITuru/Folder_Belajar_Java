package mahasiswa4a;

public class MainProgram {
    public static void main(String[] args) {
        // Menggunakan nama class yang benar: Mahasiswa4A
        Mahasiswa4A mhs1 = new Mahasiswa4A("Muhammad Haiqal Ramadhan", "2310010164", "Teknik Informatika");
        Mahasiswa4A mhs2 = new Mahasiswa4A("Upin", "12345678", "Teknik Mesin");
        Mahasiswa4A mhs3 = new Mahasiswa4A("Mail", "87654321", "Ekonomi");

        mhs1.tampilkanData();
        mhs2.tampilkanData();
        mhs3.tampilkanData();
    }
}
