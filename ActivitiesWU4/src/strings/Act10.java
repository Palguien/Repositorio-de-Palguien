package strings;

public class Act10 {

	public static void main(String[] args) {
		String cadena1="lamronbus",cadena2;
		cadena2=cadena1;
		for (int i = 1; i < cadena1.length(); i++) {
			cadena2=cadena2+cadena1.charAt(cadena1.length()-i-1);
		}
		System.out.println(cadena2);
	}

}
