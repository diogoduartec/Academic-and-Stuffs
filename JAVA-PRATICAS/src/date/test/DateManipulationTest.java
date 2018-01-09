package date.test;
import java.util.Date;
public class DateManipulationTest {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000L);
        System.out.println(date);
    }
}
