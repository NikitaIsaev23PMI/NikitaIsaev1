import Times.Time;
public class Main
{
public static void main(String[] args)
{
        Time time = new Time(42, 30, 45);
        System.out.println("Время: " + time.toString());

        time.changeTime(2, 30, 15);
        System.out.println("Измененное время: " + time.toString());
}
}