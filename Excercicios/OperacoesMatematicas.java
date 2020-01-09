package Excercicios;
import java.util.Scanner;

public class OperacoesMatematicas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor da variável A");		
		double a = sc.nextDouble();		
		System.out.println("Digite o valor da variável B");
		double b = sc.nextDouble();
		System.out.println("Digite o valor da variável C");
		double c = sc.nextDouble();
		double x1, x2;
		
		sc.close();		

		double delta = Math.pow(b, 2.0f) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0f * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0f * a);

		if (delta < 0) {
			System.out.printf("Nao existe solucao possivel, pois %.2f (delta) é negativo.", delta);
		} else {
			System.out.printf("Os valores possíveis de X sao: %.2f e %.2f", x1, x2);
		}

	}

}
