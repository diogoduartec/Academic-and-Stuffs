import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao3{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		Derangement derangement = new Derangement();
		int n;

		System.out.println("Digite n");
		n = scan.nextInt();

		derangement.makeDerangements(n);
		derangement.printDerangements();
	}
}