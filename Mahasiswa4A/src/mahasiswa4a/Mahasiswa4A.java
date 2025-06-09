package mahasiswa4a;

public class Mahasiswa4A {
    String nama;
    String nim;
    String jurusan;
    
    public Mahasiswa4A(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;   
    }
    public void tampilkanData(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusani: " + jurusan);
        System.out.println("----------------------------");
    }
}
