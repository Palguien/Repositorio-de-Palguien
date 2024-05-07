package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ej2 {
	
	public static void main(String args[]) {

		ArrayList<String> lista = new ArrayList<String>();
		Scanner keyBoard = new Scanner(System.in);
		int count=0;

		System.out.println("-----");
		//ask data for ArrayList
		String aux="entrando";
				
		while(!aux.equals("salir")) {
			System.out.println("mete un nombre (salir para terminar)");
			aux=keyBoard.nextLine();
			lista.add(aux);
			
		}
		lista.remove(lista.size()-1);
		
		System.out.println("--Arraylist--");
		//print ArrayList
		for (int i = 0; i < lista.size(); i++) {
			System.out.print(lista.get(i)+" - ");
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
			System.out.println("5-Ordenar lista");
			modo=keyBoard.nextInt();
			keyBoard.nextLine();
			switch(modo) {
			case 0:
				System.out.println("Exiting");
				break;
			case 1:
				System.out.println("mete un nombre:");
				aux=keyBoard.nextLine();
				lista.add(aux);
				break;
			case 2:
				System.out.println("mete un nombre para eliminar:");
				aux=keyBoard.nextLine();
				if(lista.contains(aux)) {
					lista.remove(aux);
					System.out.println("eliminado");
				}else {
					System.out.println("el nombre introducido no está en la lista");
				}
				break;
			case 3:
				System.out.println("mete un nombre para encontrar:");
				aux=keyBoard.nextLine();
				if(lista.contains(aux)) {			
					System.out.println("está en la posición "+lista.indexOf(aux));
				}else {
					System.out.println("el nombre introducido no está en la lista");
				}
				break;
			case 4:
				//print ArrayList
				for (int i = 0; i < lista.size(); i++) {
					System.out.print(lista.get(i)+" - ");
				}
				System.out.println();
				break;
			case 5:
				//ordenar
				lista.sort(null);

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
