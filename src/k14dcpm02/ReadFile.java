package k14dcpm02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class ReadFile {
    public static void write(String fileName, List<HangHoa> listHangHoa) {
        File file = new File(fileName);
        PrintWriter out;
        try {
            out = new PrintWriter(file);
            out.println(listHangHoa);
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("Your name");
            e.printStackTrace();
        }
    }
}
