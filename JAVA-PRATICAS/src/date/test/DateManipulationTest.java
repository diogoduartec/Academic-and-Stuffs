package date.test;
import java.util.Calendar;
import java.util.Date;
public class DateManipulationTest {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000L);
        System.out.println(date);
        date = new Date();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        System.out.println(c.get(Calendar.HOUR));
        c.add(Calendar.HOUR, 2);
        System.out.println(Calendar.HOUR);
    }
}
