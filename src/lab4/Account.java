package lab4;

public class Account {
    private int day;
    private int month;
    private int year;

    public Account()
    {

    }

    public Account(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }
    @Override
    public String toString() {
        return "Day: " +day+ "month: " +month+ "day: " +day;
    }
}
