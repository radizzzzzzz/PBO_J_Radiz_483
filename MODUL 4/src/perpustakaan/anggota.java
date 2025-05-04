package perpustakaan;

public class anggota implements peminjaman {
    private final String nama;
    private final String idAnggota;

    public anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    public void pinjamBuku(String judul) {
        System.out.println(nama + " meminjam buku berjudul: " + judul);
    }

    public void pinjamBuku(String judul, int durasi) {
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari.\n");
    }

    public void kembalikanBuku(String judul) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judul);
    }

    public void displayInfo() {
        System.out.println("Anggota: " + nama + " ID: " + idAnggota + "");
    }
}