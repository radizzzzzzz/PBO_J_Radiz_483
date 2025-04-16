import java.util.Scanner;

public class TUGAS_PBO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Admin admin = new Admin("pak admin", "radiz936", "admin483", "password483");
        Mahasiswa mahasiswa = new Mahasiswa("syauqi iwan faradiz", "202410370110483");

        System.out.println("pilih login : ");
        System.out.println("1. admin");
        System.out.println("2. mahasiswa");
        System.out.print("masukkan pilihan : ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if(pilihan == 1){
            System.out.print("masukkan username: ");
            String user = scanner.nextLine();
            System.out.print("masukkan password: ");
            String pass = scanner.nextLine();

            if(admin.login(user, pass)){
                admin.displayinfo();
            }else{
                System.out.println("login gagal, username atau password salah");
            }
        }else if(pilihan == 2){
            System.out.print("masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("masukkan NIM: ");
            String nim = scanner.nextLine();

            if(mahasiswa.login(nama, nim)){
                mahasiswa.displayinfo();
            }else{
                System.out.println("login gagal, nama atau nim salah");
            }
        }else{
            System.out.println("pilihan tidak valid");
        }
        scanner.close();
    }
} 

