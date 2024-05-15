package pr1estrdinamicas_PabloPollos;

import java.util.Comparator;

public class ComparaIngreso implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Académico)o1).getaIngreso() - ((Académico)o2).getaIngreso();		        
		return (resul);
	}
	

}
