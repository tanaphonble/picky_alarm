package ayp.aug.pickyalarm;

import java.util.Date;

/**
 * Created by Tanaphon on 8/23/2016.
 */
public class AlarmItem {
    private String text;
    private int minute;
    private int hour;
    private boolean status;     // on | off

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
