package resourcebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBunbleTest {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        resourceBundle = ResourceBundle.getBundle("messages", new Locale("pt", "BR"));
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("good.morning"));
        System.out.println(resourceBundle.getString("banana"));
    }
}
