package users;

public class Customer extends User {
    private String password;

    public Customer(String name, String email, String password) {
        super(name, email);
        this.password = password;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Customer.");
    }

    @Override
    public boolean authenticateUser(String password) {
        return this.password.equals(password);
    }
    
}
