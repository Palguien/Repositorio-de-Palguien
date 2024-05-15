package pr1estrdinamicas_PabloPollos;

import java.util.Comparator;
import java.util.Map;

public class ComparaLetras implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;		
		resul=((Map.Entry<Character, Académico>) o1).getKey().compareTo(((Map.Entry<Character, Académico>)o2).getKey());
		return (resul);
	}
	

}
