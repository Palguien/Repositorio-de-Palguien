package ejerciciosRepasoEv2;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PrincipalHora {
	public static void main(String[]args) {
		Scanner entrada=new Scanner(System.in);
		Hora h1=new Hora();
		String respuesta;
		String array[]=new String[3];
		int i=0;
		System.out.println("¿Qué hora es?");
		respuesta=entrada.nextLine();
		StringTokenizer respuesta2=new StringTokenizer(respuesta, ": . ,");
		while(respuesta2.hasMoreTokens()){
			array[i]=respuesta2.nextToken();
			i++;
		}
		h1.setHora(Integer.valueOf(array[0]));
		h1.setMinuto(Integer.valueOf(array[1]));
		h1.setSegundo(Integer.valueOf(array[2]));
		h1.mostrarDatos();
		
		//Falta incrementar segundos.
		
	}

}
