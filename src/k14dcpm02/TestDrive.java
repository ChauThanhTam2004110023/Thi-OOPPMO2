package k14dcpm02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TestDrive{
    
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
    static Scanner sc = new Scanner(System.in);
    static Kho kho = new Kho();

    static 
    {
        try 
        {
            kho.duLieuCoSan();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws ParseException 
    {
        menu();
    }
    static void menu() throws ParseException
    {
        System.out.println("-------------MENU-------------");
        System.out.println("1.Thêm hàng");
        System.out.println("2.Xuất hàng");
        System.out.println("3.Tìm kiếm hàng thực phẩm theo mã");
        System.out.println("4.Tìm kiếm hàng điện máy theo mã");
        System.out.println("5.Tìm kiếm hàng sành sứ theo mã");
        System.out.println("6.Xóa hàng");

        String n = sc.nextLine();
        switch(n)
        {
            case "1": themHang(); break;
            case "2": xuatHang(); break;
            case "3": timKiemHangTPTheoMa(); break;
            case "4": timKiemHangDMTheoMa(); break;
            case "5": timKiemHangSSTheoMa(); break;
            case "6": xoaHang(); break;
            case "7": sua(); break;
            default:
            {
                System.out.println("Dữ liệu không đúng");
                nhanEnterDeTiepTuc();
                menu();
                break;
            }
        }
    }

    
    static void nhanEnterDeTiepTuc()
    {
        System.out.println("Nhấn enter để tiếp tục");
        sc.nextLine();
    }
    static void themHang() throws ParseException
    {
        kho.them(kho.inPutHangHoa());
        nhanEnterDeTiepTuc();
        menu();
    }
    static void xuatHang() throws ParseException
    {
        kho.xuat();
        System.out.println("Tổng giá trị hàng thực phẩm: " +kho.tinhTongHangThucPham());
        System.out.println("Tổng giá trị hàng điện máy: " +kho.tinhTongHangDienMay());
        System.out.println("Tổng giá trị hàng sành sứ: " +kho.tinhTongHangSanhSu());
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timKiemHangTPTheoMa() throws ParseException
    {
        String maHang;
        System.out.println("Nhập mã hàng cần tìm: ");
        maHang = sc.nextLine();
        kho.traVeKetQua(kho.timHangThucPhamTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timKiemHangDMTheoMa() throws ParseException
    {
        String maHang;
        System.out.println("Nhập mã hàng cần tìm: ");
        maHang = sc.nextLine();
        kho.traVeKetQua(kho.timHangDienMayTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }
    static void timKiemHangSSTheoMa() throws ParseException
    {
        String maHang;
        System.out.println("Nhập mã hàng cần tìm: ");
        maHang = sc.nextLine();
        kho.traVeKetQua(kho.timHangSanhSuTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }

    private static void xoaHang() throws ParseException 
    {
        System.out.println("Nhap hang can xoa: ");
        String maHang = sc.nextLine();
        kho.xoa(kho.timHangTheoMa(maHang));
        nhanEnterDeTiepTuc();
        menu();
    }

    private static void sua() throws ParseException
    {
        System.out.println("nhap ma hang: ");
        String maHang = sc.nextLine();
        kho.suaHangHoa(maHang);
        nhanEnterDeTiepTuc();
        menu();
    }
}
