package lab2;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Account {
    private static StoredFiles accounts = new StoredFiles("accounts.json");
    private String username;
    private Integer password;
    private String email;
    private boolean loggedIn;

    public Account(String username, Integer password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Khi có thì nhập vào, ko thì trả về giá trị null, false
    public Account()
    {
        this.username = null;
        this.loggedIn = false;
        this.password = null;
        this.loggedIn = false;
    }

    private void setAccount(String username, Integer password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
        //tk luôn bật 
        this.loggedIn = true;
    }

    public void logout()
    {
        this.loggedIn = false;
        this.username = null;
        this.password = null;
        this.email = null;
        System.out.println("[LOGGED_OUT] You have been logged out");
    }
 
    public void login(String username, Integer password)
    {
        int index = -1;
        JsonArray tempMemory = accounts.getAll();
        index = accounts.search("UN", username);
        if(username.equals(this.username))
        {
            //bạn đã đăng nhập rồi
            System.out.println("[ALREADY LOGGED IN] You have already logged in.");
        }
        else if(this.username != null && !this.username.equals(username))
        {
            //bạn cần đăng xuất trước khi đăng nhập khác
            System.out.println("[INVALID MULTIPE LOGINS] You need to logout first to try another login.");
        }
        else if(index != -1)
        {
            JsonObject jsonObject = tempMemory.get(index).getAsJsonObject();
            int passwordAcc = jsonObject.get("ps").getAsInt();
            if(passwordAcc == password)
            {
                String email = jsonObject.get("email").getAsString();
                //update value data to account
                setAccount(username, password, email);
                System.out.println("[LOGGEBD IN] You are logged in.");
            }
            else
            {
                //mật khẩu không chính xác
                System.out.println("[WRONG PASSWORD] The password you enterd is incorrect.");
            }
        }
        else 
        {
            System.out.println("[NOT REGISTERD] You have to register first.");
        }
    }

    public static List<Object> accountValid(String username, String email)
    {
        List<Object> list = new ArrayList<>();
        int index = 0;
        index = accounts.search("Accounts.json", username);
        if(index != -1)
        {
            list.add(false);
            list.add("[USERNAME EXISTS] An user with that username already exists.");
            return list;
        }
        index = accounts.search("email", email);
        if(index != -1)
        {
            list.add(false);
            list.add("[EMAIL EXISTS] An mail that email already exists.");
            return list;
        }
        if(index == -1)
        {
            list.add(true);
            //mot tk da duoc tao
            list.add("[ACCOUNT_CREATED] An account has been created.");
        }
        return list;
    }

    //hanh vi cua object
    public static void createAccount(String username, Integer password, String email)
    {
        List<Object> listCheck;
        listCheck = accountValid(username, email);
        if(!(boolean) listCheck.get(0))
        {
            System.out.println(listCheck.get(1));
        }
        else
        {
            accounts.update(username, password, email);
            accounts.write();
            System.out.println(listCheck.get(1));
        }
    }

    public boolean checkLoggedIn() {
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
