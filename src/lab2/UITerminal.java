package lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UITerminal {
    private static Scanner sc = new Scanner(System.in);
    private Account accObject;
    private String prompt;
    private Actions command;

    public UITerminal(Account accObject)
    {
        this.accObject = accObject;
        this.prompt = null;
        this.command = null;
    }

    public void displayOptions()
    {
        System.out.println("-------------CRS MENU-------------");
        //CHECK
        if(!accObject.checkLoggedIn())
        {
            this.prompt = "Enter one of the commands in the bracket: \n" +
            "[CA] create Account \n"+
            "[LI] Login";
        }
        else
        {
            //dang nhapts
            this.prompt = "[LOGGED IN AS" +accObject.getUsername();
            //dang xuat
            //nhap cac lenh trong day ngoac
            System.out.println("Enter on of the commands in brackets: \n" +
            "[LO] Logout ");
        }
    }

    public String getPrompt()
    {
        return prompt;
    }

    public void handleInputs()
    {
        if(this.command.equals(Actions.CA))
        {
            Account account = creaAccountInput();
            Account.createAccount(account.getUsername(), account.getPassword(), account.getEmail());
        }
        else if(this.command.equals(Actions.LI))
        {
            List<Object> list = loginInput();
            accObject.login(list.get(0).toString(), (int)list.get(1));
        }
        else if(this.command.equals(Actions.LO))
        {
            accObject.logout();
        }
    }
    public List<Object> loginInput()
    {
        List<Object> list = new ArrayList<>();
        System.out.println("USERNAME: ");
        String username = sc.nextLine();
        System.out.println("PASSWORD: ");
        Integer password = sc.nextInt();
        sc.nextLine();
        list.add(username);
        list.add(password);
        return list;
    }

    public static Account creaAccountInput()
    {
        System.out.println("USERNAME: ");
        String username = sc.nextLine();
        System.out.println("PASSWORD: ");
        Integer password = sc.nextInt();
        sc.nextLine();
        System.out.println("EMAIL: ");
        String email = sc.nextLine();
        return new Account(username, password, email);
    }

    // CA LI LO LI
    public String handleComands(String rep)
    {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if(this.command.equals(Actions.CA))
        {
            return "Enter a username, a password, a email";
        }
        else if(this.command.equals(Actions.LO))
        {
            return "Logging out......";
        }
        else if(this.command.equals(Actions.LI))
        {
            return "Enter a username, a password";
        }
        else 
        {
            return "Unkown command.";
        }
    }
}
