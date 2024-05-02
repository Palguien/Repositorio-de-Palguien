package estructurasDinamicas;

import java.util.Comparator;

public class ComparaNombres implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Socio)o1).getNombre().compareTo(((Socio)o2).getNombre());		
		return (resul);
	}
	
}
