package lab;

public class Account {
    private String username;
    private int password;
    private String email;
    private boolean loggedin;
    public Account(String username, int password, String email, boolean loggedin) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loggedin = loggedin;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Account: user: " +username+ " password: " +password+ " email: " +email; 
    }
}
