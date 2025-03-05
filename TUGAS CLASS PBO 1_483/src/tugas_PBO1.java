import java.util.Scanner;

public class tugas_PBO1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("pilih login :");
        System.out.println("1. admin");
        System.out.println("2. mahasiswa");
        System.out.print("masukkan pilihan :");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if(pilihan == 1){
            System.out.print("masukkan username : ");
            String user = scanner.nextLine();
            System.out.print("masukkan password : ");
            String pass = scanner.nextLine();

            String validuser="admin483";
            String validpass="password483";

            if(user.equals(validuser) && pass.equals(validpass)){
                System.out.println("login berhasil");
            }else{
                System.out.println("logil gagal, username atau password salah");
            }
        }else if(pilihan == 2){
            System.out.print("masukkan username : ");
            String nama = scanner.nextLine();
            System.out.print("masukkan password : ");
            int password = scanner.nextInt();

            String validnama= "syauqi iwan faradiz";

            if(nama.equals(validnama) && password == 483){
                System.out.print("login berhsil");
            }else{
                System.out.print("login gagal");
            }
        }else{
            System.out.print("pilihan tidak valid ");
        }
      scanner.close();
    }
}


