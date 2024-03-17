package Lesson1;

public class SoundEcho {
    private final double sound = 1100;
    public double time;
    public boolean Echo;
    private int distance;
    double getResult() {
        if(Echo) {
            distance = 2;
        } else {
            distance = 1;
        }
        return (time * sound) / distance;
    }
}
