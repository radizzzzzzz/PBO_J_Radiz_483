import java.util.Scanner;

public class TUGAS_PBO {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

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

            String validuser = "admin483";
            String validpass = "password483";

            if(user.equals(validuser) && pass.equals(validpass)){
                System.out.println("login berhasil");
            }else{
                System.out.println("login gagal, username atau password salah");
            }
        }else if(pilihan == 2){
            System.out.print("masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("masukkan NIM: ");
            String password = scanner.nextLine();

            String validnama = "syauqi iwan faradiz";
            String validpassword = "202410370110483";

            if(nama.equals(validnama) && password.equals(validpassword)){
                System.out.println("login mahasiswa berhasil");
                System.out.println("nama :" + validnama);
                System.out.println("NIM: " +validpassword);
            }else{
                System.out.println("login gagal, username atau NIM salah");
            }
        }else{
            System.out.println("pilihan tidak valid");
        }
        scanner.close();
    }
} 

