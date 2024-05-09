import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

import dialogs.Dialogs;
import hashSet.Alumno;
import hashSet.Alumno2;

public class Ej17 {
	
	public static void main(String[] args) {

		HashSet<Alumno> daw1 = new HashSet<Alumno>();
		HashSet<Alumno> daw2 = new HashSet<Alumno>();
		Scanner keyboard = new Scanner(System.in);
		int salir = 1;
		while(true) {
			try {
				System.out.println("--Nuevo alumno--");
				daw1.add(new Alumno(Dialogs.askIntDialog("id?"), JOptionPane.showInputDialog("nombre?"), 
						Dialogs.askIntDialog("edad?"), JOptionPane.showInputDialog("curso?")));
				
			}catch(Exception e) {
				System.out.println("Ha habido cagadas");
			}
			salir=abs(Dialogs.confirmMessage("Continuar"));
			if(salir==1) {
				break;
			}
			
			
		}
		
		
		
		daw1.add(new Alumno2(1, "Macareno", 15, "daw1"));

		System.out.println("-------------DAW1-------------");
		
		visualizeMethod(daw1);
		
		Iterator<Alumno> iter=daw1.iterator();
		while(iter.hasNext()) {
			Alumno alum=iter.next();
			if(alum.getEdad()<18) {
				daw2.add(alum);
			}
		}
		System.out.println("-------------DAW2-------------");
		visualizeMethod(daw2);
		
		daw1.removeAll(daw2);
		System.out.println("-------------DAW1 after removeAll-------------");
		visualizeMethod(daw1);
		
		

	}
	
	private static int abs(int num) {
		if(num<0) {
			return (-num);
		}
		return num;
	}


	//T pide un tipo genérico
	private static <T> void visualizeMethod(HashSet<T> set) {
		Iterator<T> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
