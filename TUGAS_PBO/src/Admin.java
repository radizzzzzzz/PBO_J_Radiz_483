public class Admin extends User {
    private final String username;
    private final String password;

    public Admin(String nama, String nim, String username, String password){
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login(String inputuser, String inputpass){
        return inputuser.equals(username)&&inputpass.equals(password);
    }
    @Override
    public void displayinfo(){
        System.out.println("login admin berhasil");
        System.out.println("nama : " + getNama());
        System.out.println("NIM : " +getNim());
    }

}
