package perpustakaan;

public abstract class buku {
    protected String judul;
    protected String penulis;

    public buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public abstract void displayInfo();
}