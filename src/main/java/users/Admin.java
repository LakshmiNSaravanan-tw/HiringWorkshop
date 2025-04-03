package users;

public class Admin extends User {

    private String adminPassword;
    private String otpCode = "123456"; // Simulated OTP

    public Admin(String name, String email, String adminPassword) {
        super(name, email,adminPassword);
        this.adminPassword = adminPassword;
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is an Admin.");
    }

    @Override
    public boolean authenticateUser(String password) {
        return this.adminPassword.equals(password) && verifyOTP();
    }

    private boolean verifyOTP() {
        // Simulated OTP verification
        System.out.println("Verifying OTP...");
        return otpCode.equals("123456");
    }
    
}
