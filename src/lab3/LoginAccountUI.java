package lab3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoginAccountUI {
    private static Scanner sc = new Scanner(System.in);

    private LoginAccountController loginAccountController;
    private Actions command;

    public LoginAccountUI(LoginAccountController loginAccountController)
    {
        this.loginAccountController = loginAccountController;
        this.command = null;
    }

    public String handleCommands(String rep)
    {
        //toUpperCase: in hoa
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if(this.command.equals(Actions.LO))
        {
            return "Logging out ...";
        }
        else if(this.command.equals((Actions.LI)))
        {
            return "Enter a username, password";
        }
        else 
        {
            return "Unkown command.";
        }
    }

    public void handleInputs()
    {
        if(this.command.equals(Actions.LI))
        {
            List<Object> list = loginInputs();
            this.loginAccountController.login(list.get(0).toString(), (int)list.get(1));
        }
        else if(this.command.equals(Actions.LO))
        {
            this.loginAccountController.logout();
        }
    }

    public List<Object> loginInputs()
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


}
