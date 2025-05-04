package perpustakaan;

public class nonfiksi extends buku {
    private final String bidang;

    public nonfiksi(String judul, String penulis, String bidang) {
        super(judul, penulis);
        this.bidang = bidang;
    }

    @Override
    public void displayInfo() {
        System.out.println("\nBuku Non-Fiksi: " + judul + " oleh " + penulis + " (Bidang: " + bidang + ")");
    }
}