import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menampilkan pilihan login
        System.out.println("pilih login:");
        System.out.println("1. admin");
        System.out.println("2. mahasiswa");
        System.out.print("masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        // Mengecek pilihan login
        if (pilihan == 1) {
            System.out.print("masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("masukkan password: ");
            String password = scanner.nextLine();

            // Cek apakah username dan password sesuai dengan yang valid
            if (username.equals("admin483") && password.equals("password483")) {
                System.out.println("login admin berhasil!");
            } else {
                System.out.println("login gagal! username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("masukkan NIM: ");
            String nim = scanner.nextLine();

            // Cek apakah nama dan NIM sesuai dengan yang valid
            if (nama.equals("syauqi iwan faradiz") && nim.equals("202410370110483")) {
                System.out.println("login mahasiswa berhasil!");
                System.out.println("nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("pilihan tidak valid.");
        }

        scanner.close();
    }
}