import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao1{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		Combination combination = new Combination();
		int n, k;

		System.out.println("Digite n e k");
		n = scan.nextInt();
		k = scan.nextInt();
		
		combination.makeCombinations(n,k);
		combination.printCombinations();
	}
}