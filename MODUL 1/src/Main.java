import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama anda: ");
        String nama = scanner.nextLine();
        System.out.print("masukkan jenis kelamin(P/L): ");
        char jenis = scanner.nextLine().charAt(0);
        System.out.print("masukkan tahun lahir: ");
        int tahun = scanner.nextInt();

        String jeniskelaminString;
        if (jenis == 'P' ||jenis == 'p'){
            jeniskelaminString = "perempuan";
        }else if (jenis == 'L' || jenis == 'l'){
            jeniskelaminString = "laki-laki";
        }else{
            jeniskelaminString = "jenis kelamin tidak valid";
        }

        int tahunsekarang = LocalDate.now().getYear();
        int umur = tahunsekarang - tahun;

        System.out.println("mama: "+nama);
        System.out.println("jenis: "+jeniskelaminString);
        System.out.println("tahun: "+umur);

        scanner.close();
    }
}