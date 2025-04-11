public class Admin {

    public boolean login(String inputuser, String inputpass){
        String username = "admin483";
        String password = "password483";
        return inputuser.equals(username)&&inputpass.equals(password);
    }
}
