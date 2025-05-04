// Superclass: KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = Math.max(kesehatan, 0); // Mencegah nilai negatif
    }

    // Method serang (akan di-override di subclass)
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + "!");
    }
}

// Subclass: Pahlawan
class Pahlawan extends KarakterGame {

    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan); // Memanggil constructor superclass
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Subclass: Musuh
class Musuh extends KarakterGame {

    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan); // Memanggil constructor superclass
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

// Kelas Utama: Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Kesehatan awal Brimstone: " + brimstone.getKesehatan());
        System.out.println("Kesehatan awal Viper: " + viper.getKesehatan());

        // Simulasi pertarungan
        brimstone.serang(viper);
        viper.serang(brimstone);
        brimstone.serang(viper);
        viper.serang(brimstone);
    }
}