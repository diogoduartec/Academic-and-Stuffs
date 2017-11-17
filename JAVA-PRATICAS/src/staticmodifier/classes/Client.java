package staticmodifier.classes;
/**
 * Date 16/11/2017
 * @autor Diogo Duarte
 * Practicing initialization block
 */
public class Client {
    //STEPS:
    //0 - Initialization block will be execute when JVM load the class (just on first time)
    //1 - Java allocate memory to object
    //2 - Class attributes initialized with their default values or explicit values
    //3 - Initialization block executed
    //4 - Constructor executed

    private static int plots[];
    static {
        //initialization block//
        plots = new int[100];
        for(int i=1; i<100; i++)
            plots[i]=1;
    }

    public int[] getPlots() {
        return plots;
    }

}
