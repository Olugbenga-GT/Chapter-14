package com.ModifiedPayroll;

public class Date {
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Date(int month, int day, int year){
        if(month <=0||month >12){ throw new IllegalArgumentException("month(" + month + ") must be 1 - 12");}
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
             throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month <=0||month >12){ throw new IllegalArgumentException("month(" + month + ") must be 1 - 12");}
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
        this.year = year;
    }


    @Override
    public String toString() {
        return String.format("%d/ %d/ %d", day, month, year);
    }
}
