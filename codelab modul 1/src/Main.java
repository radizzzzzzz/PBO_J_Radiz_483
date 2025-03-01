import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukkan nama anda: ");
        String nama = scanner.nextLine();
        System.out.print("masukkan jenis kelamin(P/L): ");
        char jenis = scanner.nextLine().charAt(0);
        System.out.print("masukkan tahun lahir: ");
        int tahun = scanner.nextInt();

        String jeniskelaminString;
        if (jenis == 'L' ||  jenis == 'l') {
            jeniskelaminString = "Laki-laki";
        } else if (jenis == 'P' || jenis == 'p') {
            jeniskelaminString = "Perempuan";
        } else {
            jeniskelaminString = "Jenis kelamin tidak valid";
        }

        int tahunsekarang = LocalDate.now().getYear();
        int umur = tahunsekarang - tahun;

        System.out.print("\nData Diri: \n");
        System.out.println("nama:"+nama);
        System.out.println("jenis:"+jeniskelaminString);
        System.out.println("umur:"+umur+"tahun");

        scanner.close();
    }
}