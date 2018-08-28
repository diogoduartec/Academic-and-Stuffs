import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao4{

	public static void main(String... args){
		Scanner scan = new Scanner(System.in);
		Partition partition = new Partition();
		int n;

		System.out.println("Digite n");
		n = scan.nextInt();

		partition.makePartitions(n);
		partition.printPartitions();
	}
}