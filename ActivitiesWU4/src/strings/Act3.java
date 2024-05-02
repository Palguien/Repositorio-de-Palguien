package strings;

public class Act3 {

	public static void main(String[] args) {
		String cadena1="1234567895", cadena2 = "";
		for (int i = 0; i < cadena1.length(); i++) {
			cadena2=cadena2+(cadena1.charAt(cadena1.length()-i-1));
		}
		System.out.println("String original = "+cadena1);
		System.out.println("String invertido = "+cadena2);
	}

}
