package blocodeinicializacao.classes;
/**
 * Date 16/11/2017
 * @autor Diogo Duarte
 * Practicing initialization block
 */
public class Client {
    //STEPS:
    //1 - Java allocate memory to object
    //2 - Class attributes initialized with their default values or explicit values
    //3 - Initialization block executed
    //4 - Constructor executed

    private int plots[];
    {
        //initialization block//
        plots = new int[100];
        for(int i=1; i<100; i++)
            this.plots[i]=1;
    }

    public int[] getPlots() {
        return plots;
    }

    public void setPlots(int[] plots) {
        this.plots = plots;
    }
}
