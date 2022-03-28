/* package k14dcpm02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Conslelput {
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private List<HangHoa> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void them(HangHoa hangHoa)
    {
        this.ds.add(hangHoa);
    }

    public HangHoa inPutHangHoa() throws ParseException
    {
        HangHoa hangHoa = null;

        System.out.println("Tên hàng: ");
        String tenHang = sc.nextLine();
        System.out.println("Loại hàng: ");
        String loaiHang = sc.nextLine();
        System.out.println("Mã hàng: ");
        String maHang = sc.nextLine();
        System.out.println("Số lượng tồn kho: ");
        int soLuongTonKho = sc.nextInt();
        System.out.println("Đơn giá: ");
        double donGia = sc.nextDouble();

        System.out.println("bạn có cần thêm hàng không? Có: 1; Không: 0");
        int loai = sc.nextInt();
        sc.nextLine();
        if(loai == 0)
        {
            System.out.println("Hàng thức phẩm");
            String LoaiHangThucPham = sc.nextLine();
            hangHoa = new HangThucPham(tenHang, loaiHang, maHang, soLuongTonKho, donGia, simpleDateFormat.parse("dd/MM/yyyy"), simpleDateFormat.parse("dd/MM/yyyy"));
        }
        else if(loai == 0)
        {
            System.out.println("Hàng điện máy");
            String loaiHangDienMay = sc.nextLine();
            sc.nextLine();

            hangHoa = new HangDienMay(tenHang, loaiHang, maHang, soLuongTonKho, donGia, "tGBaoHanh", "congSuatKW");
        }
        else if(loai == 0)
        {
            System.out.println("Hàng sành sứ");
            String loaiHangSanhSu = sc.nextLine();
            hangHoa = new HangSanhSu(tenHang, loaiHang, maHang, soLuongTonKho, donGia, "nhaSanXuat", simpleDateFormat.parse("dd/MM/yyyy"));
        }
        return hangHoa;
    }
} */
