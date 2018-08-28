import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Partition{
	private Util utility = new Util();
	private List<String> partitions = new ArrayList<>();
	private List<Integer> partitionMasks = new ArrayList<>();

	private int n;

	public Partition(){}

	public void recursivePartitions(String aPartition, int mask){
		partitions.add(aPartition+"}");
		partitionMasks.add(mask);
		if(utility.isAllBitsSet(n,mask)){
			return;
		}
		for(int i=1; i<=n; i++){
			if(utility.isNotSetBit(mask,i) && !(partitionMasks.contains(utility.setBit(mask, i)))){
				recursivePartitions(aPartition+i+" ",utility.setBit(mask, i));
			}
		}
	}

	public void makePartitions(int n){
		this.n = n;
		recursivePartitions("{",0);
	}

	public int numberOfPartitions(){
		return partitions.size();
	}

	void printPartitions(){
		System.out.println(numberOfPartitions()+" Particoes (incluindo o conjunto vasio):");
		//Collections.sort(partitions);
		partitions.forEach(System.out::println);
	}

}