package conexion;

import java.util.Comparator;

public class comparadorId implements Comparator<Fabricante>{

	@Override
	public int compare(Fabricante o1, Fabricante o2) {
		return o1.getId().compareTo(o2.getId());
	}

}
