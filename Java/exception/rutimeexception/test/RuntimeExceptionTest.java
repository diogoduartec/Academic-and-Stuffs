package exception.rutimeexception.test;

import java.io.IOException;

public class RuntimeExceptionTest {
    public static void main(String[] args) throws IOException{
        /**Arithmetic Exception
        int a=10, b=0;
        if(b!=0){
            int c = a/b;
            System.out.println(a);
        }
        else System.out.println("Infinity");

        --------------------------------*/

        /**Null Pointer Exception
        Object o = null;
        System.out.println(o.toString());

         -------------------------------*/

        /**Array Index Out of Bounds Exception
        int[] a = new int[2];
        System.out.println(a[2]);
        */
        try {
            div(4, 0);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    public static void div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("You can not divide by zero");
        }
        int result = a/b;
        System.out.println(result);
    }
}
