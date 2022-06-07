package lab3;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Account account = new Account();
        NewAccountController newAccountController = new NewAccountController(account);
        NewAccountUI newAccountUI = new NewAccountUI(newAccountController);
        
        LoginAccountController loginAccountController = new LoginAccountController(account);
        LoginAccountUI loginAccountUI = new LoginAccountUI(loginAccountController); 
        System.out.println("Welcome to the Cinema Reservation System!!\n (To exit type 'exit') \n");

        while(true)
        {
            Thread.sleep(1000);
            displayOptions(newAccountController);
            String prompt = getPrompt(newAccountController);
            System.out.println(prompt);
            //chọn
            String rep = sc.nextLine();
            
            String resCMD;
            if(rep.toUpperCase().equals(Actions.CA.toString()))
            {
                resCMD = newAccountUI.handleCommands(rep);
                System.out.println(resCMD);
                if(resCMD != null && !resCMD.equals("Unkown command."))
                {
                    newAccountUI.handleInputs();
                }
            }
            else if(rep.toUpperCase().equals(Actions.LI.toString()) || rep.toUpperCase().equals(Actions.LO.toString()))
            {
                resCMD = loginAccountUI.handleCommands(rep);
                if(resCMD != null && !resCMD.equals("Unkown commanđ."))
                {
                    loginAccountUI.handleInputs();
                }
            }
        }
    }

    public static void displayOptions(NewAccountController newAccountController) 
    {
        System.out.println("------------------CRS MENU------------------");
        String str = " ";
        if(!newAccountController.getAccount().checkLoggedIn())
        {
            str = "Enter one of the command in the breackets: \n " +
            "[CA] Create Account\n" +
            "[LI] Login";
            System.out.println(str);
        }
        else
        {
            System.out.println("Enter on of the command in brackets: \n" +
            "[LO] Logout");
        }
    }

    public static String getPrompt(NewAccountController newAccountController)
    {
        if(!newAccountController.getAccount().checkLoggedIn())
        {
            return " ";
        }
        return "LOGGED IN AS " + newAccountController.getAccount().getUsername();
    }
}
