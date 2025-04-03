package users;

public class UserProfile {
    private User user;
    private String address;

    public UserProfile(User user, String address) {
        this.user = user;
        this.address = address;
    }

    public void displayProfile() {
        System.out.println("User: " + user.getName() + ", Address: " + address);
    }
}
