package k14dcpm02;

import java.util.Date;

public class KhoHang {
    private String tenHang;
    private String loaiHang;
    private String maHang;
    private String nhaCungCap;
    private int soLuongTonKho;
    private double donGia;
    private Date ngaySX;
    private Date ngayHetHan;


    //public KhoHang(String maHang)
    //{
    //    this.setMaHang(maHang);
    //}
    public KhoHang(String tenHang, String loaiHang,String nhaCungCap, String maHang, int soLuongTonKho, double donGia, Date ngaySX,
            Date ngayHetHan) {
        this.tenHang = tenHang;
        this.nhaCungCap = nhaCungCap;
        this.maHang = maHang;
        this.soLuongTonKho = soLuongTonKho;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.ngayHetHan = ngayHetHan;
    }

    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getLoaiHang() {
        return loaiHang;
    }
    public void setLoaiHang(String loaiHang) {
        this.loaiHang = loaiHang;
    }
     public String getNhaCungCap() {
        return nhaCungCap;
    }
    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public int getSoLuongTonKho() {
        return soLuongTonKho;
    }
    public void setSoLuongTonKho(int soLuongTonKho) {
        this.soLuongTonKho = soLuongTonKho;
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

    public void setNgaySX(Date ngaySX) {
        this.ngaySX = ngaySX;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    @Override
    public String toString() {
        return "Kho Hàng: [tên hàng: " +tenHang+ " loại hàng: " +loaiHang+ " mã hàng: " +maHang+ " nhà cung cấp: " +nhaCungCap+ " số lượng tồn kho: " +soLuongTonKho+ " đơn giá: " +donGia+ " ngày sản xuất: " +ngaySX+ " ngày hết hạn: " +ngayHetHan+ "]";
    }
}
