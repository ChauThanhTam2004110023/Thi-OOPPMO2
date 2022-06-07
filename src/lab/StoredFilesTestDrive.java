package lab;

public class StoredFilesTestDrive {
    public static void main(String[] args) {
        StoredFiles storedFiles = new StoredFiles("accounts.json");
        storedFiles.read();
        System.out.println("");
    }
}
