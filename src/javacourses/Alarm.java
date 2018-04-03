package javacourses;

import java.time.OffsetTime;

public class Alarm extends Note {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    long time = System.currentTimeMillis();

}
