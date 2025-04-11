public class Mahasiswa {
    private final String nama = "syauqi iwan faradiz";
    private final String nim = "202410370110483";

    public boolean login(String inputnama, String inputnim){
        return inputnama.equalsIgnoreCase(nama)&&inputnim.equals(nim);
    }
    public void tampilkaninfo(){
        System.out.println("login mahasiswa berhasil");
        System.out.println("nama : "+nama);
        System.out.println("NIM : "+nim);
    }
}
