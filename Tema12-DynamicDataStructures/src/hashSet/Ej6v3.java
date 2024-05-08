package hashSet;

import java.util.HashSet;
import java.util.Iterator;

//Usa alumno2 que tiene hashCode e equals modificado
public class Ej6v3 {

	public static void main(String[] args) {

		HashSet<Object> daw1 = new HashSet<Object>();
		HashSet<Object> daw2 = new HashSet<Object>();
		
		Alumno2 leocadio = new Alumno2(1, "Leocadio", 22, "daw1");
		Alumno2 stewie = new Alumno2(2, "Stewie", 27, "daw1");
		Alumno2 anselmo = new Alumno2(3, "Anselmo", 22, "daw1");
		Alumno2 stuart = new Alumno2(4, "Stuart", 22, "daw1");
		
		daw1.add(new Alumno2(1, "Macareno", 15, "daw1"));
		daw1.add(new Alumno2(1, "Macareno", 15, "daw1"));
		daw1.add(leocadio);
		System.out.println("-------------DAW1-------------");
		
		visualizeMethod(daw1);
		daw2.addAll(daw1);
		daw2.add(stuart);
		daw2.add(anselmo);
		daw2.add(stewie);
		System.out.println("-------------DAW2-------------");
		visualizeMethod(daw2);
		
		daw2.remove(stewie);
		System.out.println("-------------DAW2 after remove-------------");
		visualizeMethod(daw2);
		
		daw2.removeAll(daw1);
		System.out.println("-------------DAW2 after removeAll-------------");
		visualizeMethod(daw2);
		
//		daw2.retainAll(daw1);
//		System.out.println("-------------DAW2 after retainAll-------------");
//		visualizeMethod(daw2);
		
		System.out.println("-------------DAW2 after iterator-------------");
		removeElementbyId(daw2,4);
		visualizeMethod(daw2);

	}
	
	private static void removeElementbyId(HashSet<Object> group,int id) {
		Iterator<Object> iter=group.iterator();
		
		while(iter.hasNext()) {
			Alumno2 aux=(Alumno2) iter.next();
			
			if(aux.getId()==id) {
				iter.remove();
			}
		}
	}

	private static void visualizeMethod(HashSet<Object> set) {
		Iterator<Object> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
