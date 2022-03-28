package k14dcpm02;

public abstract class HangHoa {
    private String tenHang;
    private String loaiHang;
    private String maHang;
    private int soLuongTonKho;
    private double donGia;

    public HangHoa()
    {

    }

    public HangHoa(String tenHang, String loaiHang, String maHang, int soLuongTonKho, double donGia) {
        this.tenHang = tenHang;
        this.loaiHang = loaiHang;
        this.maHang = maHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
    }

    public double getDonGia() {
        return donGia;
    }
    public void setDonGia(double donGia) {
        this.donGia = donGia;
    } 

   
    public String getMaHang() {
        return maHang;
    }
    public void setMaHang(String maHang) {
            this.maHang = maHang;
    }

    @Override
    public String toString() {
        return "Kho Hàng: Tên hàng: " +tenHang+ " Loại hàng: " +loaiHang+ " Mã hàng: " +maHang+ " Số lượng tồn kho: " +soLuongTonKho+ " Đơn giá: " +donGia;
    }
}




 
