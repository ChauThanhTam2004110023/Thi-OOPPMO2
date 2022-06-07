package lab1;

public class TKB {
    private Day thu;
    private String cacMonHoc;

    public TKB(Day thu, String cacMonHoc) {
        this.thu = thu;
        this.cacMonHoc = cacMonHoc;
    }
    public Day getThu() {
        return thu;
    }
    public String getCacMonHoc() {
        return cacMonHoc;
    }
    @Override
    public String toString() {
        return "TKB: Thu: " +thu+ ", cac mon hoc: " +cacMonHoc;
    }
}
