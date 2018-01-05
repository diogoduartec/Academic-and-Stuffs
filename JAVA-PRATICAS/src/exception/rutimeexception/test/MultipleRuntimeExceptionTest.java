package exception.rutimeexception.test;

/**
 * Create by Diogo Duarte in 05/01/2018
 * practicing Multiple Runtime Exception in java 6
 */
public class MultipleRuntimeExceptionTest {
    public static void main(String... args){
        try {
            throw new IndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bounds exception");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Index of bounds exception");
        } catch (IllegalArgumentException e){
            System.out.println("Illegal argument exception e");
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        } catch (RuntimeException e){
            System.out.println("Runtime exception");
        }
    }
}
