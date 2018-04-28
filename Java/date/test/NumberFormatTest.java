/**
 * Create on 09/01/2018
 * By Diogo Duarte
 * Practicing NumberFormat Class
 */
package date.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
    public static void main(String... args){
        float value = 120.00F;
        Locale locale = new Locale("it");
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(locale);
        numberFormats[2] = NumberFormat.getCurrencyInstance();
        numberFormats[3] = NumberFormat.getCurrencyInstance(locale);

        for(NumberFormat nf : numberFormats){
            System.out.println(nf.format(value));
        }

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.getMaximumFractionDigits());
        nf.setMaximumFractionDigits(5);
        System.out.println(nf.format(value));
    }
}
