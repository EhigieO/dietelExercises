package chapterThreeExercises;

public class Date {
    private int validYear;
    private int validMonth;
    private int day = 1;
    private int month = 1;
    private int year = 1900;
    private int validDay;
    private boolean isLeapYear = false;

    public Date(int month, int day, int year) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else
            System.out.println("invalid Month");

        if ((((day > 0 && day < 32) && (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12))
                || ((day < 31) && (month == 9 || month == 4 || month == 6 || month == 11))
                || ((day < 30) && (month == 2 && (isLeapYear = true)))
                || ((day < 29 && month == 2  && (isLeapYear = false))))) {
            this.day = day;
        } else
            System.out.print("invalid day");

        if (year < 5000 && year > 1900) {
            this.year = year;
        } else {
            System.out.print("Invalid Year");
        }
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13) {
            this.month = month;
        } else
            System.out.println("invalid Month");
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if ((((day > 0 && day < 32) && (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12))
                || ((day < 31) && (month == 9 || month == 4 || month == 6 || month == 11))
                || ((day < 30) && (month == 2 && (isLeapYear = false)))
                || ((day < 29) && (month == 2 && (isLeapYear = true))))) {
            this.day = day;
        } else
            System.out.print("invalid day");

    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        if (year <= 5000 && year >= 1900) {
            this.year = year;
        }
    }

    public int getYear() {
        return year;
    }

    public String displayDate() {
        return month + "/" + day + "/" + year;
    }

    public void leapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            } else
                isLeapYear = true;
        } else
            isLeapYear = false;
    }
}
