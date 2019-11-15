import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ternar {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();
        int secunde = LocalDateTime.now().getSecond();

        String perioada = ora >= 12 ? "PM" : "AM";

        System.out.println(ora + ":" + minute + ":" + secunde + " " + perioada);

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
