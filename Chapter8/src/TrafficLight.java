//Write an enum type TrafficLight, whose constants (RED, GREEN, YELLOW) take one parameter—
//        the duration of the light. Write a program to test the TrafficLight enum so that it displays the
//enum constants and their durations.



public enum TrafficLight { GREEN(15), RED(5), YELLOW(10);
    private final int duration;

    TrafficLight(int duration) {
        this.duration = duration;
    }

   public int getDuration(){
        return duration;
   }
}
