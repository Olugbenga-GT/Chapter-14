/*
* (Modifying the Internal Data Representation of a Class) It would be perfectly reasonable
for the Time2 class of Fig. 8.5 to represent the time internally as the number of seconds since midnight
rather than the three integer values hour, minute and second. Clients could use the same public
methods and get the same results. Modify the Time2 class of Fig. 8.5 to implement the time as
the number of seconds since midnight and show that no change is visible to the clients of the class.*/


public class ModifyTime {
    private int hour ;
    private int minute;
    private int second;

    public void setTime(int hour , int minute, int second){
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second > 60){
            throw new IllegalArgumentException("Either hour, minute or second is out of range");
        }
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //    Converting this time to universal time
    public String toUniversalString(){
        return String.format("%02d", second);
    }

    //    Converts time to Standard time format
    public  String toString(){
        return String.format("%s",
                (second < 43201 ? "AM" : "PM"));
    }

    public int getTimeInSeconds() {
        return second * hour * minute;
    }
}