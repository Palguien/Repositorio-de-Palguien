package hashMap_Diccionarios;

public class Académico {
	private String nombre;
	private int aIngreso;
	
	public Académico() {
		super();
	}

	public Académico(String nombre, int aIngreso) {
		super();
		this.nombre = nombre;
		this.aIngreso = aIngreso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getaIngreso() {
		return aIngreso;
	}
	public void setaIngreso(int aIngreso) {
		this.aIngreso = aIngreso;
	}
	@Override
	public String toString() {
		return "Académico [nombre=" + nombre + ", aIngreso=" + aIngreso + "]";
	}
}
