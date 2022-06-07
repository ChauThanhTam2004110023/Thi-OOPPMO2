package lab;

public class AccountTestDrive {
    public static void main(String[] args) {
        // List<Object> list = Account.accountValid("mr ku", "mrku@gmail.com");
        // //Boolean b;
        // System.out.println(list.get(0) + " === " +list.get(1));
        // Account.createAccount("ThanhTam", 123, "Tamkute@gmail.com");
        Account account = new Account();
        account.login("Mr teo", 12345);
    }
}
