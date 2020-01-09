package Excercicios;
import java.util.Scanner;

public class DoEWhile {

	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int sum = 0;
		
//		A condicao é avaliada antes de executar a funcao.		
		while (n != 0) {
			sum += sc.nextInt();
			System.out.println("Resultado da soma é: " + sum);
		}

//		A funcao é executada antes de analisar a condicao, portanto será executada pelo menos uma vez.
		do {
			if (sum != 0) {
				sum += sc.nextInt();
				System.out.println("Resultado na soma é ;" + sum);
			} else {
				System.out.println("O número digitado foi 0");
			}
			
		} while (n != 0);
		
	}

}
