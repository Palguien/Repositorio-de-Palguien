package hashSet;

public class Alumno2 extends Alumno{
	  
	  
	public Alumno2(int id, String nombre, int edad, String curso) {
		super(id, nombre, edad, curso);
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public boolean equals(Object obj) {
		if(this.getId()==((Alumno2) obj).getId() &&
				this.getNombre().equals(((Alumno2) obj).getNombre()) &&
				this.getEdad()==((Alumno2) obj).getEdad() &&
				this.getCurso().equals(((Alumno2) obj).getCurso())) {
			return true;
		}
		return false;
	}
	  
	  
	  
	}
