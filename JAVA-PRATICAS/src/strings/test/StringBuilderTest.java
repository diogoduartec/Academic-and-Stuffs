package strings.test;
/**
 * Create on 09/01/2018
 * By Diogo Duarte
 * Practicing StringBuilder Class
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(16);
        sb.append("Annie Hall");
        System.out.println(sb);
        System.out.println(sb.insert(2,"del"));
        System.out.println(sb.delete(2, 5));
        System.out.println(sb.reverse());
    }
}
