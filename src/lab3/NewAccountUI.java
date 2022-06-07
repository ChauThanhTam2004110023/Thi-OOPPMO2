package lab3;

import java.util.Scanner;

public class NewAccountUI {
    private static Scanner sc = new Scanner(System.in);
    private Actions command;
    private NewAccountController newAccountController;

    public NewAccountUI(NewAccountController newAccountController)
    {
        this.command = null;
        this.newAccountController = newAccountController;
    }

    //CA LI LI LO
    public String handleCommands(String rep)
    {
        String cmd = rep.toUpperCase();
        this.command = Actions.valueOf(cmd);
        if(this.command.equals(Actions.CA))
        {
            return "Enter a username, a password, a email";
        }
        else
        {
            return "unkown command.";
        }
    }

    public void handleInputs()
    {
        if(this.command.equals(Actions.CA))
        {
            Account account = createAccountInputs();
            newAccountController.createAccount(account.getUsername(), account.getPassword(), account.getEmail());
        }
    }

    private static Account createAccountInputs() {
        System.out.println("ESERNAME: ");
        String username = sc.nextLine();
        System.out.println("PASSWORD: ");
        Integer password = sc.nextInt();
        sc.nextLine();
        System.out.println("EMAIL: ");
        String email = sc.nextLine();
        return new Account(username, password, email);
    }
}
