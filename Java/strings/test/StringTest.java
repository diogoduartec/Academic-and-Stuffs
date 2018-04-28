package strings.test;

/**
 * Create on 09/01/2018
 * By Diogo Duarte
 * Practicing Strings manipulation
 */
public class StringTest {
    public static void main(String[] args) {
        String name = "William";
        name.concat(" Smith");
        System.out.println(name);
        name = name.concat(" Smith");
        System.out.println(name);
        String test = "pulp fiction";
        String test2 = "pulp fiction";
        System.out.println(test.charAt(3));
        System.out.println(test.equals(test2));
        System.out.println(test.length());
        System.out.println(test.replace('u', 'a'));
        System.out.println(test.toUpperCase());
        System.out.println(test.substring(0,4));
        System.out.println(test.trim());
    }
}
