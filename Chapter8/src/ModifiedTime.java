/*
8.7 (Enhancing Class Time2) Modify class Time2 of Fig. 8.5 to include a tick method that increments
the time stored in a Time2 object by one second. Provide method incrementMinute to increment
the minute by one and method incrementHour to increment the hour by one. Write a
program that tests the tick method, the incrementMinute method and the incrementHour method
to ensure that they work correctly. Be sure to test the following cases:
a) incrementing into the next minute,
b) incrementing into the next hour and
c) incrementing into the next day (i.e., 11:59:59 PM to 12:00:00 AM).
**/

public class ModifiedTime {

    private int seconds;
    private int minutes;
    private int hours;

    public ModifiedTime(int seconds, int minutes, int hours) {

        if (hours < 0 || hours >= 24) {throw new IllegalArgumentException("hour must be 0-23");}
         if (minutes < 0 || minutes >= 60) {throw new IllegalArgumentException("minute must be 0-59");}
        if (seconds < 0 || seconds >= 60) {throw new IllegalArgumentException("second must be 0-59");}

        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }
    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) {throw new IllegalArgumentException("second must be 0-59");}
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 && minutes >= 60) {throw new IllegalArgumentException("minute must be 0-59");}
        this.minutes = minutes;
    }


    public void setHours(int hours) {
        if (hours < 0 || hours >= 24) {throw new IllegalArgumentException("hour must be 0-23");}
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getHours() {
        return  hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
