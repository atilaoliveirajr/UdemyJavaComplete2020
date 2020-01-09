package Excercicios;

public class formatacaoSimples {

	public static void main(String[] args) {
		
		String nome = "Joao";
		int idade = 31;
		double renda = 4000.35;
		
		System.out.printf("%s tem %d anos e ganha R$%.2f.%n", nome, idade, renda);
		
//		%f = Ponto flutuante
//		%d = Inteiro
//		%s = Texto
//		%n = Quebra de linha
		
	}
	
}
