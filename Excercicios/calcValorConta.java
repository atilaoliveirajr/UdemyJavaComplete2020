package Excercicios;
import java.util.Scanner;

public class calcValorConta {
	
	static double plano = 100f;
	static double custoDoMinutoDentroDoPlano = 1f;
	static double custoDoMinutoForaDoPlano = 2f;
	static double consumidoPeloCliente;
	static double valorDaConta;
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Favor inserir quantos minutos o cliente consumiu.");
		consumidoPeloCliente = scanner.nextDouble();
		
		if (consumidoPeloCliente <= 100) {
			valorDaConta = consumidoPeloCliente * custoDoMinutoDentroDoPlano;
			System.out.printf("O valor da conta é: R$ %.2f", valorDaConta);
		} else {
			valorDaConta = (plano * custoDoMinutoDentroDoPlano) + ((consumidoPeloCliente - plano) * custoDoMinutoForaDoPlano);
			System.out.printf("O valor da conta é: R$ %.2f", valorDaConta);
		}
				
		scanner.close();
		
	}

}
