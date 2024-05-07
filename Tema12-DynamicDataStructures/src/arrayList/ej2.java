package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ej2 {
	
	public static void main(String args[]) {

		ArrayList<String> dynamic = new ArrayList<String>();
		Scanner keyBoard = new Scanner(System.in);
		int count=0;

		System.out.println("-----");
		//ask data for ArrayList
		String aux="entrando";
				
		while(!aux.equals("salir")) {
			System.out.println("mete un nombre (salir para terminar)");
			aux=keyBoard.nextLine();
			dynamic.add(aux);
			
		}
		dynamic.remove(dynamic.size()-1);
		
		System.out.println("--Arraylist--");
		//print ArrayList
		for (int i = 0; i < dynamic.size(); i++) {
			System.out.print(dynamic.get(i)+" - ");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		//ej 3
		int modo;
		while(true) {
			System.out.println("--- Menú: ---");
			System.out.println("0-Salir");
			System.out.println("1-Insertar nombre");
			System.out.println("2-Eliminar nombre");
			System.out.println("3-Buscar nombre");
			System.out.println("4-Ver lista");
			modo=keyBoard.nextInt();
			keyBoard.nextLine();
			switch(modo) {
			case 0:
				System.out.println("Exiting");
				break;
			case 1:
				System.out.println("mete un nombre:");
				aux=keyBoard.nextLine();
				dynamic.add(aux);
				break;
			case 2:
				System.out.println("mete un nombre para eliminar:");
				aux=keyBoard.nextLine();
				if(dynamic.contains(aux)) {
					dynamic.remove(aux);
					System.out.println("eliminado");
				}else {
					System.out.println("el nombre introducido no está en la lista");
				}
				break;
			case 3:
				System.out.println("mete un nombre para encontrar:");
				aux=keyBoard.nextLine();
				if(dynamic.contains(aux)) {			
					System.out.println("está en la posición "+dynamic.indexOf(aux));
				}else {
					System.out.println("el nombre introducido no está en la lista");
				}
				break;
			case 4:
				//print ArrayList
				for (int i = 0; i < dynamic.size(); i++) {
					System.out.print(dynamic.get(i)+" - ");
				}
				System.out.println();
				break;
			default:
				System.out.println("Valor no válido");;
				
			}
			if(modo==0) {
				break;
			}
			
		}
		
		keyBoard.close();
		
	}

}
