//My utility methods

public class Util{

	public Util(){}

	
	public boolean isSetBit(int n, int bit){
		return (((1<<bit) & n)>0 ? true : false);
	}
	
	public boolean isNotSetBit(int n, int bit){
		return (!(((1<<bit) & n)>0 ? true : false));
	}

	public boolean isAllBitsSet(int n, int mask){
		return (Integer.bitCount(mask) == n);
	}
	
	public int setBit(int n, int bit){
		return (n|(1<<bit));
	}

}