package users;

public abstract class User {
    protected String name;
    protected String email;
    private String password;
    

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.setPassword(password); // Using setter to ensure controlled access
    }

    public abstract void displayRole(); // Abstract method for role-specific behavior
    public abstract boolean authenticateUser(String password); 

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if (password.length() >= 6) {  // Basic validation
            this.password = password;
        } else {
            System.out.println("Password must be at least 6 characters long.");
        }
    }
}
