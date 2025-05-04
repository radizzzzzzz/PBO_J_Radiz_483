class Hewan{
    String nama;
    String jenis;
    String suara;

    Hewan(String nama, String jenis, String suara){
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    String info(){
        return "nama: " + nama +  "\njenis: " + jenis + "\nsuara: " + suara;
    }
}

public class codelab1 {
    public static void main(String[]args){
        Hewan hewan1 = new Hewan("kucing", "mamalia", "miaww");
        Hewan hewan2 = new Hewan("anjing", "mamalia", "gugug");

        System.out.println(hewan1.info());
        System.out.println();
        System.out.println(hewan2.info());
    }

}