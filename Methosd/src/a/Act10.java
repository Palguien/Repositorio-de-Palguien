package a;

import java.util.Scanner;

/**
 * @author pablo
 */
public class Act10 {

	public static void main(String[] args) {
		String[][] diccionario = {{"blue","triste"},{"red","comunista"},{"green","verde"}};
		String[] elemento = {"dickweed","pichamatojo"};
		diccionario=ordenar(diccionario);
		diccionario=add(diccionario,elemento);
		diccionario=ordenar(diccionario);
		printDic(diccionario);
		System.out.println(buscarDic(diccionario,"red"));
		System.out.println(buscarDic(diccionario,"dickweed"));
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Inglés:");
		elemento[0]=keyboard.nextLine();
		System.out.println("Español:");
		elemento[1]=keyboard.nextLine();
		diccionario=add(diccionario,elemento);
		printDic(diccionario);
		System.out.println("------");
		diccionario=ordenar(diccionario);
		printDic(diccionario);
		
		keyboard.close();
	}
	/**
	 * Aumenta en uno el tamaño del vector diccionario y le añade el par {ingles,español} 
	 * @param diccionario	String[][] de String[] tamaño 2
	 * @param elemento		String[] tamaño 2
	 * @return vector diccionario modificado
	 */
	private static String[][] add(String[][] diccionario, String[] elemento) {
		String[][] dicAmpliado = new String[diccionario.length+1][2];
		for (int i = 0; i < dicAmpliado.length-1; i++) {
			dicAmpliado[i]=diccionario[i];
		}
		dicAmpliado[diccionario.length]=elemento;
		return dicAmpliado;
	}
	/**
	 * Busca en el vector diccionario el string introducido, y si lo encuentra devuelve su traducción 
	 * @param diccionario	String[][] de String[] tamaño 2
	 * @param string		String a buscar para traducir
	 * @return string con la tradución del string introducido o mensaje de error si no está en el vector
	 */
	private static String buscarDic(String[][] diccionario, String string) {
		String traduccion="";
		boolean encontrado=false;
		for (int i = 0; i < diccionario.length; i++) {
			if(diccionario[i][0]==string) {
				encontrado=true;
				traduccion=diccionario[i][1];
			}
		}
		if(!encontrado) {
			return "ERROR 404. Data not found.";
		}else {
			return traduccion;
		}		
	}
	/**
	 * Imprime el contenido del vector diccionario
	 * @param diccionario	String[][] de String[] tamaño 2
	 */
	private static void printDic(String[][] diccionario) {
		for (int i = 0; i < diccionario.length; i++) {
			System.out.println(diccionario[i][0]+" /// "+diccionario[i][1]);
		}
	}
	/**
	 * Selecciona el último elemento del vector diccionario y lo ordena alfabéticamente
	 * @param diccionario	String[][] de String[] tamaño 2, suponemos que salvo el último lemento ya está ordenado
	 * @return diccionario ordenado
	 */
	private static String[][] ordenar(String[][] diccionario) {
		String[] aux;
		for (int i = diccionario.length-1; i > 0; i--) {
			if(diccionario[i][0].compareToIgnoreCase(diccionario[i-1][0])<0) {
				aux=diccionario[i];
				diccionario[i]=diccionario[i-1];
				diccionario[i-1]=aux;
			}
		}
		return diccionario;
	}
	
}
