package k14dcpm02;

public class HangDienMay extends HangHoa{
    private String tGBaoHanh;
    private String congSuatKW;
    
    public HangDienMay(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia,
            String tGBaoHanh, String congSuatKW) {
        super(tenHang, loaiHang, maHang, soLuongTonKho, donGia);
        this.tGBaoHanh = tGBaoHanh;
        this.congSuatKW = congSuatKW;
    }

    @Override
    public double getThue() 
    {
        return getDonGia()*0.1;
    }

    @Override
    public String getDanhGia() {
        String d = null;
        if(getSoLuongTonKho() >= 0)
        {
            d = "bán không được";
        }
        else
        {
            d = "bán được";
        }
        return d;
    }
    @Override
    public String toString() {
        return super.toString()+ " Thời gian bào hành: " +tGBaoHanh+ " Công suất KW: " +congSuatKW+" Thuế: "+getThue()+ " Đánh giá hàng điện máy: " +getDanhGia();
    }
    
}
