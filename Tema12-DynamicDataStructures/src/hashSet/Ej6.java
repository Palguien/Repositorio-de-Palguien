package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ej6 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		Alumno a1 = new Alumno(1, "Ricardo", 20, "3A");
		Alumno a2 = new Alumno(2, "Richard", 22, "2B");
		Alumno a3 = new Alumno(3, "Chindas", 200, "5C");
		
		set.add(1);
		set.add(2);
		set.add(7);
		set.add(3);
		set.add(8);
		set.add(1);
		
		set.add("Anselmo");
		set.add("Anastasio");
		set.add("Anacleto");
		set.add("Wamba");
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		
		
		Iterator<Object> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
