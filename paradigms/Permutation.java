import java.util.List;
import java.util.ArrayList;

public class Permutation{
	private Util utility = new Util();
	private List<String> permutations = new ArrayList<>();
	private int n;

	public Permutation(){}

	public void recursivePermutations(String aPermutation, int mask){
		if(utility.isAllBitsSet(n,mask)){
			permutations.add(aPermutation);
			return;
		}
		for(int i=1; i<=n; i++){
			if(utility.isNotSetBit(mask,i)){
				recursivePermutations(aPermutation+i+" ",utility.setBit(mask, i));
			}
		}
	}

	public void makePermutations(int n){
		this.n = n;
		recursivePermutations("",0);
	}

	public int numberOfPermutations(){
		return permutations.size();
	}

	void printPermutations(){
		System.out.println(numberOfPermutations()+" Permutacoes:");
		permutations.forEach(System.out::println);
	}

}