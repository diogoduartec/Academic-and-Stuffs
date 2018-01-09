package strings.test;
/**
 * Create on 09/01/2018
 * By Diogo Duarte
 * Practicing Strings Performance
 */
public class StringPerformanceTest {
    public static void main(String[] args) {
        /**test performance with normal string*/
        long timeBegin = System.currentTimeMillis();
        concatString(10000);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Time: "+(timeEnd-timeBegin));

        /**test performance with StringBuilder*/
        timeBegin = System.currentTimeMillis();
        concatStringBuilder(10000);
        timeEnd = System.currentTimeMillis();
        System.out.println("Time: "+(timeEnd-timeBegin));

        /**test performance with StringBuffer*/
        timeBegin = System.currentTimeMillis();
        concatStringBuffer(10000);
        timeEnd = System.currentTimeMillis();
        System.out.println("Time: "+(timeEnd-timeBegin));
    }
    private static void concatString(int tam){
        String s = "";
        for(int i=0; i<tam; i++){
            s+=i;
        }
    }
    private static void concatStringBuilder(int tam){
        StringBuilder s = new StringBuilder(tam);
        for(int i=0; i<tam; i++){
            s.append(i);
        }
    }
    private static void concatStringBuffer(int tam){
        StringBuffer s = new StringBuffer(tam);
        for(int i=0; i<tam; i++){
            s.append(i);
        }
    }
}
