package Excercicios;

public class StringFormatting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,9);
		String s06 = original.replace("a", "X");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		
		System.out.println("Original: -" + original + "-");
		System.out.println("To Lower Case: -" + s01 + "-");
		System.out.println("To Upper Case: -" + s02 + "-");
		System.out.println("To Trim(): -" + s03 + "-");
		System.out.println("Substring (2): -" + s04 + "-");
		System.out.println("Substring (2, 9): -" + s05 + "-");
		System.out.println("Replace (a, x): -" + s06 + "-");
		System.out.println("Indexof bc: " + i);
		System.out.println("Lastindexof bc: " + j);
		
	}

}
