package lab3;

public class StoredFilesTestDrive {
    public static void main(String[] args) {
        StoredFiles storedFiles = new StoredFiles("Accounts.json");
        storedFiles.read();
        System.out.println("");
    }
}
