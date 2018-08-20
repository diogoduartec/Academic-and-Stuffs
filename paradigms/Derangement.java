import java.util.List;
import java.util.ArrayList;

public class Derangement{
	private Util utility = new Util();
	private List<String> derangements;
	int n;

	public Derangement(){}

	public void recursiveDerangement(String aDerangement, int mask){
		if(utility.isAllBitsSet(n,mask)){
			derangements.add(aDerangement);
			return;
		}
		for(int i=1; i<=n; i++){
			if(utility.isNotSetBit(mask,i) && (i != (aDerangement.length()/2)+1)){
				//System.out.println(i + " - " + (aDerangement.length()+1) + " - "+aDerangement);
				recursiveDerangement(aDerangement+i+" ",utility.setBit(mask, i));
			}
		}
	}

	public void makeDerangements(int n){
		this.n = n;
		derangements = new ArrayList<>();
		recursiveDerangement("",0);
	}

	public int getNumberOfDerangements(){
		return derangements.size();
	}


	public void printDerangements(){
		System.out.println(getNumberOfDerangements() + " Desarrajos:");
		derangements.forEach(System.out::println);
	}

	public List<String> getDerangements(){
		return derangements;
	}


}