
public class Empleado {
	
	private String nombre;
	private int sueldo;
	
	public Empleado(int sueldo, String nombre) {
		super();
		this.sueldo = sueldo;
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	

}
