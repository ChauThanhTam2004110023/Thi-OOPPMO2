package lab;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Account {
    private static StoredFiles accounts = new StoredFiles("Accounts.json");
    private String username;
    private Integer password;
    private String email;
    private boolean loggedIn;

    // Khi có thì nhập vào, ko thì trả về giá trị null, false
    public Account()
    {
        this.username = null;
        this.loggedIn = false;
        this.password = null;
        this.email = null;
    }

    public Account(String username, Integer password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public boolean checkLoggedIn()
    {
        return loggedIn;
    }
    
    //check
    public void login(String username, Integer password)
    {
        JsonArray tempMemory = accounts.getAll();
        int index = -1;
        index = accounts.search("UN", username);
        if(username.equals(this.username))
        {
            //bạn đã đăng nhập rồi
            System.out.println("[ALREADY LOGGER IN] you have already logged in.");
        }
        else if(this.username != null && !this.username.equals(username))
        {
            //bạn cần đăng xuất trước khi đăng nhập khác
            System.out.println("[INVALID MULTIPE LOGINS] you need to logout first to try another login.");
        }
        else if(index != -1)
        {
            JsonObject jsonObject = tempMemory.get(index).getAsJsonObject();
            int passwordAcc = jsonObject.get("ps").getAsInt();
            if(passwordAcc == password)
            {
                String email = jsonObject.get("email").getAsString();
                //update value data to account (cập nhật giá trị dữ liệu để tích lũy)
                setAccount(username, password, email);
                System.out.println("[LOGGEBD IN] you are logged in.");
            }
            else 
            {
                // mật khẩu ko chính xác
                System.out.println("[WRONG PASSWORD] The password you enterd is incorrect !!!");
            }
        }
        
        else 
        {
            System.out.println("[]NOT REGISTERD] you have to register first.");
        }
    }

    private void setAccount(String username, Integer password, String email)
    {
        this.username = username;
        this.password = password;
        this.email = email;
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

    // hanh vi cua object
    public static void createAccount(String username, Integer password, String email)
    {
        //so do tuan tu - sequence
        //check valid username, email =>??? class method: accountValid
        List<Object> listCheck;
        listCheck = accountValid(username, email);
        if(!(boolean)listCheck.get(0))
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

    public static List<Object> accountValid(String username, String email) {
        List<Object> list = new ArrayList<>();
        int index = 0;
        index = accounts.search("un", username);
        if(index != -1)
        {
            // valie = false
            list.add(false); //0
            //Người dùng có tên người dùng đó đã tồn tại
            list.add("[USERNAME EXISTS] An user with that username already exists.");
            return list;
        }
        index = accounts.search("email", email);
        if(index != -1)
        {
            // valid
            list.add(false);
            list.add("[EMAIL EXISTS] A mail with that email already exists.");
            return list;
        }
        if(index == -1)
        {
            // valie = true
            list.add(true);
            //một tài khoản đâ được tạo
            list.add("[ACCOUNT_CREATED] An account has been created.");
        }
        return list;
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
