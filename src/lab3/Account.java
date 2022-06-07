package lab3;

public class Account {
    private static StoredFiles accounts = new StoredFiles("Accounts.json");

    private String username;
    private Integer password;
    private String email;
    private boolean loggedIn;

    public Account()
    {
        this.username = null;
        this.loggedIn = false;
        this.email = null;
        this.password = null;
    }

    public Account(String username, Integer password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        //this.loggedIn = loggedIn;
    }

    public void logout()
    {
        this.loggedIn = false;
        this.username = null;
        this.password = null;
        this.password = null;
        System.out.println("[LOGGED_OUT] You have been logged out");
    }



    public void setAccount(String username, Integer password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loggedIn = true;
    }

   public static StoredFiles getAccounts()
   {
       return accounts;
   }

   public boolean checkLoggedIn()
   {
       return loggedIn;
   }
    public String getUsername() {
        return username;
    }
    public Integer getPassword() {
        return password;
    }
    public String getEmail() {
        return email;
    }

   
}
