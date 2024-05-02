package ejercicio1;

public class Empleado {
	protected String nombre;
	protected double sueldo;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}
	
	public void mostrarDatos() {
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Sueldo: " +this.sueldo);
	}

}
