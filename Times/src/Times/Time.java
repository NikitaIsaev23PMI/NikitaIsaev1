package Times;
public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("неверные значения введеного времени");
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void setHours(int hours) {
        if (hours < 0 || hours > 23) {
            throw new IllegalArgumentException("неверное значение часа");
        }
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("неверное значение минут");
        }
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 59) {
            throw new IllegalArgumentException("неверное значение секунд");
        }
        this.seconds = seconds;
    }

    public void changeTime(int addHours, int addMinutes, int addSeconds) {
        if (addHours < 0 || addMinutes < 0 || addSeconds < 0) {
            throw new IllegalArgumentException("Нельзя использовать отрицательные значения, т.к это время");
        }

        int newSeconds = this.seconds + addSeconds;
        int additionalMinutes = newSeconds / 60;
        this.seconds = newSeconds % 60;

        int newMinutes = this.minutes + addMinutes + additionalMinutes;
        int additionalHours = newMinutes / 60;
        this.minutes = newMinutes % 60;

        this.hours = (this.hours + addHours + additionalHours) % 24;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}