package lab1;

public class Test {
    public static void main(String[] args) {
        TKB tkb = new TKB(Day.Monday, "Toán Lý Hóa");
        TKB tkb1 = new TKB(Day.Friday, "Văn Sử Địa");
        System.out.println(tkb);
        System.out.println(tkb1);


        int x = Thang.Thang_Mot.soNgay();
        System.out.println(x);

    }
}
