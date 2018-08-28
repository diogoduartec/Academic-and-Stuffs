import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao2{

	public static void main(String... args){
		int n;
		Scanner scan = new Scanner(System.in);
		Permutation permutation = new Permutation();
		System.out.println("Digite n");
		n = scan.nextInt();

		permutation.makePermutations(n);
		permutation.printPermutations();
	}
}