package users;

public class Vendor extends User{
    
    private String password;

    public Vendor(String name, String email, String password) {
        super(name, email,password);
        this.password = password;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Vendor.");
    }

    @Override
    public boolean authenticateUser(String password) {
        return this.password.equals(password);
    }

}
