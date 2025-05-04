package app;

import perpustakaan.*;

public class main {
    public static void main (String[] args) {
        buku buku1 = new nonfiksi("Madilog", "Tan Malaka", "Sejarah & Ilmu Pengetahuan");
        buku buku2 = new fiksi("Hainuwele: Sang Putri Kelapa", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        anggota anggota1 = new anggota("radiz ganteng", "2j483");
        anggota anggota2 = new anggota("fathan ahmd", "2j493\n");

        anggota1.displayInfo();
        anggota2.displayInfo();

        anggota1.pinjamBuku("Madilog");
        anggota2.pinjamBuku("Hainuwele: Sang Putri Kelapa", 7);

        anggota1.kembalikanBuku("Madilog");
        anggota2.kembalikanBuku("Hainuwele: Sang Putri Kelapa");
    }
}