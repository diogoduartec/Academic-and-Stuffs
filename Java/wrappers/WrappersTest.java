package wrappers;
/**
 * Date 08/01/2018
 * @autor Diogo Duarte
 * Practicing Wrappers Classes
 */
public class WrappersTest {
    byte bytePrimitive = 1;
    short shortPrimitive = 1;
    int intPrimitive = 1;
    long longPrimitive = 10L;
    float floatPrimitive = 10F;
    double doublePrimitive = 10D;
    char charPrimitive = 'A';
    boolean booleanPrimitive = true;

    /**Autoboxing*/
    Byte byteWrapper = 1;
    Short shortWrapper = 1;
    Integer integerWrapper = new Integer("123456");
    Long longWrapper = 10L;
    Float floatWrapper = 10F;
    Double doubleWrapper = 10D;
    Character characterWrapper = 'A';
    Boolean booleanWrapper = true;

    /**Unboxing*/
    int i = integerWrapper;
    String str = "100";
    float f = Float.parseFloat(str);

}