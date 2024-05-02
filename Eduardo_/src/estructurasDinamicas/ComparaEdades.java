package estructurasDinamicas;
import java.util.Comparator;

public class ComparaEdades implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		int resul;
		resul=((Socio)o1).edad()-((Socio)o2).edad();
		//al restar las edades dará valor negativo, 0 o valor positivo.
		return (resul);
	}
	

}
