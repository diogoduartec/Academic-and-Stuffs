package regularexpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest {
    public static void main(String[] args) {
        //String regex = "ab";
        //String text = "abaaabacab";
        //String regex = "\\d";                   //--------------> find all digits
        //String regex = "\\D";                   //--------------> find not digits
        //String regex = "\\s";                   //--------------> find blank spaces
        //String regex = "\\S";                   //--------------> find not blank spaces
        //String regex = "\\w";                   //--------------> find words characters
        String regex = "\\W";                     //--------------> find not words characters
        String text = "aj&d@2 1d 23n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text:  "+text);
        System.out.println("index: 0123456789");
        System.out.println("expression: "+matcher.pattern());
        System.out.println("positions founds");
        while(matcher.find()){
            System.out.print(matcher.start()+" ");
        }
    }
}
