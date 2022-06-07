package lab2;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Account accObject = new Account();
        UITerminal uiTerminal = new UITerminal(accObject);
        System.out.println("Welcome to the university online registraction system");
        while(true)
        {
            Thread.sleep(1000);
            uiTerminal.displayOptions();
            System.out.println(uiTerminal.getPrompt());
            String rep = sc.nextLine();
            String cmd = uiTerminal.handleComands(rep);
            if(cmd != null && ! cmd.equals("Unkown command."));
            {
                System.out.println(cmd);
                uiTerminal.handleInputs();
            }
        }
    }
}
