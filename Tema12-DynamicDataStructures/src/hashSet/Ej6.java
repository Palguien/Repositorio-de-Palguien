package hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Ej6 {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
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
		
		set.add(new Alumno(1, "Ricardo", 20, "3A"));
		set.add(new Alumno(2, "Richard", 22, "2B"));
		set.add(new Alumno(3, "Chindas", 200, "5C"));
		set.add(new Alumno(3, "Chindas", 200, "5C"));
		
		
		visualizeMethod(set);

	}

	private static void visualizeMethod(HashSet<Object> set) {
		Iterator<Object> iter=set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
