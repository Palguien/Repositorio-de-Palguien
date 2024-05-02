package arrayList;
import java.util.*;

public class prueba1 {
	public static void main(String[]args) {
		
		ArrayList<String> coches=new ArrayList<String>();
		coches.add("Toyota");
		coches.add("Ford");
		coches.add("Audi");
		coches.add("BMW");
		coches.add("Mercedes-Benz");
		System.out.println("Lista de coches:\n");
		for (int i=0;i<coches.size();i++) {
			System.out.println("Coche "+(i+1)+" "+coches.get(i));
		}
		
		
		
		coches.add(2,"Seat");
		System.out.println("\nInsertar un coche:\n");
		for (int i=0;i<coches.size();i++) {
			System.out.println("Coche "+(i+1)+" "+coches.get(i));
		}
		
		
		
		coches.remove(0);
		System.out.println("\nBorrar un coche:\n");
		for (int i=0;i<coches.size();i++) {
			System.out.println("Coche "+(i+1)+" "+coches.get(i));
		}
		
		
		
	}
}
