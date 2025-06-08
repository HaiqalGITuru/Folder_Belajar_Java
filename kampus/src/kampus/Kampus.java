package kampus;


public abstract class Kampus {
    protected String nama;
    
    public Kampus(String nama) {
        this.nama = nama;
    }
    public abstract void infoKampus();
}
