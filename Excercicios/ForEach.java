package Excercicios;

public class ForEach {

	public static void main(String[] args) {
		
		String [] array = new String[] {"Maria", "Bob", "Alex"};
		
//		tipo de objeto (String), apelido para as posicoes varridas (nomes), colecao a ser varrida.
//		Para cada objeto nomes na colecao array fazer acao descrita
		
		for (String nomes : array) {
			System.out.println(nomes);
		}
		
		System.out.println("----------------------------------------");
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
