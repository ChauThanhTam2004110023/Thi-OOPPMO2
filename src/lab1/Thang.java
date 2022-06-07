package lab1;

public enum Thang {
    Thang_Mot(31),
    Thang_Hai(29),
    Thang_Ba(31),
    Thang_Tu(30),
    Thang_Nam(31),
    Thang_Sau(30),
    Thang_Bay(31),
    Thang_Tam(31),
    Thang_Chin(31),
    Thang_Muoi(31),
    Thang_Muoi_Mot(31),
    Thang_Muoi_Hai(31);

    private final int soNgay;
    Thang(int soNgay)
    {
        this.soNgay = soNgay;
    }
    public int soNgay()
    {
        return this.soNgay;
    }





}
