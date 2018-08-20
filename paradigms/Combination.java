import java.util.List;
import java.util.ArrayList;

public class Combination{
	private Util utility = new Util();
	private List<String> combinations;
	int n, k;

	public Combination(){}

	public void recursiveCombinations(String aCombination, int mask){
		if(Integer.bitCount(mask) == this.k){
			combinations.add(aCombination);
			return;
		}
		for(int i=1; i<=n; i++){
			if(utility.isNotSetBit(mask,i)){
				recursiveCombinations(aCombination+i+" ",utility.setBit(mask, i));
			}
		}
	}

	public void recursiveDerangement(String aCombination, int mask){
		if(Integer.bitCount(mask) == this.k){
			combinations.add(aCombination);
			return;
		}
		for(int i=1; i<=n; i++){
			if(utility.isNotSetBit(mask,i) && i != aCombination.length()+1){
				recursiveDerangement(aCombination+i+" ",utility.setBit(mask, i));
			}
		}
	}

	public void makeCombinations(int n, int k){
		this.n = n;
		this.k = k;
		combinations = new ArrayList<>();
		recursiveCombinations("",0);
	}

	public void makeDerangement(int n, int k){
		this.n = n;
		this.k = k;
		combinations = new ArrayList<>();
		recursiveDerangement("",0);
	}

	public int getNumberOfCombinations(){
		return combinations.size();
	}


	public void printCombinations(){
		System.out.println(getNumberOfCombinations() + " Combinations:");
		combinations.forEach(System.out::println);
	}

	public List<String> getCombinations(){
		return combinations;
	}


}