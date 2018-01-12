package regularexpressions.test;

import java.util.Scanner;

/**
 * Create by Diogo Duarte on 12/01/2018
 */
public class TokenTest {
    public static void main(String... args){
        /*String str = "William, Marcelus, Suzana, John, Kamila";
        String[] strArray = str.split(",");
        for(String word:strArray){
            System.out.println(word.trim());
        }*/
        Scanner scanner = new Scanner("1 true monkey word 0xFFFF cat");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }
}
