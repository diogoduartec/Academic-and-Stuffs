package date.test;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;
public class LocaleTest {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "usa");
        Locale locJap = new Locale("ja");
        Locale locIt = new Locale("it");
        Calendar c = Calendar.getInstance();
        c.set(2018,Calendar.JANUARY,9);
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dateFormat.format(c.getTime()));

        System.out.println(locJap.getDisplayCountry(locIt));
        System.out.println(locJap.getDisplayLanguage(locIt));
        System.out.println(locJap.getDisplayCountry());

    }
}
