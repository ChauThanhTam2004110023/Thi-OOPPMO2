package lab;

import java.util.Scanner;

public class BootStrap {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        Account accObject = new Account();
        UTTerminal uiTerminal = new UTTerminal(accObject);

        //Chào mừng bạn đến với hệ thống đặc chỗ rạp chiếu phim
        System.out.println("Welcome to the Cinema Reservation system!\n (to exit type 'exit') \n ");
        while(true)
        {
            Thread.sleep(1000);
            uiTerminal.displayOptions();
            System.out.println(uiTerminal.getPrompt());
            //choon
            //command
            String rep = sc.nextLine();
            String cmd = uiTerminal.handleCommands(rep);
            if(cmd != null && ! cmd.equals("Unkown command."));
            {
                System.out.println(cmd);
                uiTerminal.handleInputs();
            }
        }
    }
}
