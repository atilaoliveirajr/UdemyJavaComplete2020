package Excercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListUtil {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("Maria");
		arrayList.add("Alex");
		arrayList.add("Joao");
		arrayList.add("Claudia");
		
		arrayList.remove(1);
		arrayList.add(1, "Marco");
		
		System.out.println(arrayList.get(3));
		
		boolean test = arrayList.contains("Joao");
		
		System.out.println(test);
		
		
//		Varrer as Strings (X), e para as Strings que tenha o caracter C na posicao 0 e remova a String.
		arrayList.removeIf(x -> x.charAt(0) == 'C');
		
		for (String x : arrayList) {
			System.out.println(x);
		}
		
//		Filtrar e pegar elementos que comecem com a letra A
		List<String> result = arrayList.parallelStream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		

	}

}
