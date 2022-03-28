package k14dcpm02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HangSanhSu extends HangHoa{
   // private String loaiHangSanhSu;
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public HangSanhSu()
    {

    }
    
    public HangSanhSu(String nhaSanXuat, Date ngayNhapKho) {
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    public HangSanhSu(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia, String nhaSanXuat, Date ngayNhapKho) 
    {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy");
        String str1 = simpleDateFormat.format(ngayNhapKho);
        return super.toString()+ " Nhà sản xuất: " +nhaSanXuat+ " Ngày nhập kho: " +str1 ;
    }
}
