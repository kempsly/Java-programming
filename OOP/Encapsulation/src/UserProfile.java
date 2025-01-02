public class UserProfile {

    private String username;
    private String password;
    private String email;

    // Constructor to initialize a new user profile
    public UserProfile(String username, String password, String email){
        this.username = username;
        setPassword(password);
        setEmail(email);
    }
    //get

    public String getUsername() {
        return username;
    }

    // setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
