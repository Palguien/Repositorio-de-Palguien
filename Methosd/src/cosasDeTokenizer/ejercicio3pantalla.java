package cosasDeTokenizer;

import java.util.StringTokenizer;

public class ejercicio3pantalla {

	public static void main(String[] args) {
		String telef = "(234)123-7896";
		StringTokenizer strTokens=new StringTokenizer(telef,"()-",false);
		String areaNum=strTokens.nextToken();
		String phoneNum=strTokens.nextToken()+strTokens.nextToken();
		long areaLong=Integer.parseInt(areaNum);
		System.out.println("Area number = "+areaLong+"\nPhone number = "+phoneNum);
	}
	
}
