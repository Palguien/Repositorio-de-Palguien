package cosasDeTokenizer;

import java.util.StringTokenizer;

public class activity1 {

	public static void main(String[] args) {
		String phrase = "Alien fumeta, el único alien que habita el planeta. Alien fumeta, canutos, petardos y porros y petas.";
		System.out.println(phrase);
		String phraseMod[] =new String[indexOfGuapoGuapo(phrase,' ')+1];
		StringTokenizer cachos = new StringTokenizer(phrase,", .",false);
		for (int i = cachos.countTokens()-1; i >= 0; i--) {
			phraseMod[i]=cachos.nextToken();
		}
		for (int i = 0; i < phraseMod.length; i++) {
			System.out.print(phraseMod[i]+" ");
		}
		System.out.println("\nRepet = "+indexOfGuapoGuapo(phrase,"el"));

	}
	/**
	 * Index of que no da puto asco y me da todas las instancias del caracter introducido en la cadena
	 * @param phrase	cadena
	 * @param c			caracter a buscar
	 * @return repet	int		
	 */
	private static int indexOfGuapoGuapo(String phrase, char c) {
		int repet=0;
		for (int i = 0; i < phrase.length(); i++) {
			if(phrase.charAt(i)==c) {
				repet++;
			}
		}
		return repet;
	}
	/**
	 * Index of que no da puto asco y me da todas las instancias de la subcadena introducido en la cadena
	 * @param phrase	cadena
	 * @param cad		subcadena a buscar
	 * @return repet	int		
	 */
	private static int indexOfGuapoGuapo(String phrase, String cad) {
		int repet=0,pos=0;
		while(phrase.indexOf(cad,pos)!=-1){
			repet++;
			pos=phrase.indexOf(cad,pos)+1;
		}
		return repet;
	}

}
