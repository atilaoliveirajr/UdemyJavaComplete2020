package Excercicios;
import java.util.Scanner;

public class For {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("Type the value of 'n'.");
		int n = sc.nextInt();
		
		int sum = 0;
		
		int i;
		
		for (i = 0; i < n; i++) {
			System.out.println("Type the value of 'x'.");
			int x = sc.nextInt();
			sum += x;
			System.out.println("Contador: " + i);
		}
		
		if (i >= n) {
			System.out.println("Resultado da soma: " + sum);
		}
	}

}
