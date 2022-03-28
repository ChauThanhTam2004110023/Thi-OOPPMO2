package k14dcpm02;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
    public static void main(String[] args) throws ParseException{
        Kho kho = new Kho();
        kho.duLieuCoSan();
        kho.xuat();

        String nhapTiep = null;
        //Kho kho2 = new Kho();
        do
        {
            HangHoa hangHoa = kho.inPutHangHoa();
            kho.them(hangHoa);
            System.out.println("Bạn có muốn nhập tiếp không (1/0)");
            nhapTiep = kho.sc.nextLine();
        }
        while(nhapTiep.equalsIgnoreCase("1")); 
    }
}
