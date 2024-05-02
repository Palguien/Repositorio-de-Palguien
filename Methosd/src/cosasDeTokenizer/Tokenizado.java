package cosasDeTokenizer;

import java.util.StringTokenizer;

public class Tokenizado {

	public static void main(String[] args) {
		String cadena = "white, red, green and blue";
		StringTokenizer strTokens=new StringTokenizer(cadena,", ");
		System.out.println(strTokens.countTokens());
		System.out.println(strTokens.nextElement());
		while(strTokens.hasMoreTokens()) {
			System.out.println(strTokens.nextToken());
			System.out.println(strTokens.countTokens());
			System.out.println();
			
		}

	}

}
