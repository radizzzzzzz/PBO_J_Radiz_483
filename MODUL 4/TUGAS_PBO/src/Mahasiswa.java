public class Mahasiswa extends User {
    public Mahasiswa(String nama, String nim){
        super(nama, nim);
    }
    public boolean login(String inputnama, String inputnim){
        return inputnama.equalsIgnoreCase(getNama())&&inputnim.equals(getNim());
    }
    public void tampilkaninfo(){
        System.out.println("login mahasiswa berhasil");
        System.out.println("nama : "+getNama());
        System.out.println("NIM : "+getNim());
    }
}
