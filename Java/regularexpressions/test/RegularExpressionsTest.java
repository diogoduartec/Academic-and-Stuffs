package regularexpressions.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionsTest {
    public static void main(String[] args) {
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} from n to m
        // ( )
        // |
        // $ end of line
        // ^ NOT
        //String regex = "ab";
        //String text = "abaaabacab";
        //String regex = "\\d";                               //--------------> find all digits
        //String regex = "\\D";                               //--------------> find not digits
        //String regex = "\\s";                               //--------------> find blank spaces
        //String regex = "\\S";                               //--------------> find not blank spaces
        //String regex = "\\w";                               //--------------> find words characters
        //String regex = "\\W";                               //--------------> find not words characters
        //String regex = "[aj2]";                             //--------------> find a, j, or 2
        //String regex = "[a-d1-5]";                          //--------------> find interval
        //String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";        //--------------> find hexadecimal format
        //String regex = "([\\w._\\-])+@([a-zA-Z])+.com";     //--------------> find email format
        String regex = "\\d{1,2}/\\d{1,2}/\\d{2,4}";          //--------------> find data format
        String text = "10/02/2017 2/1/1 1515/122/5 0/0/0 02/07/2003 2/3/98";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("text: "+text);
        System.out.println("index: 0123456789");
        System.out.println("expression: "+matcher.pattern());
        System.out.println("positions founds");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
