package ejercicio2;

public class Animal {
	protected String nombre;
	protected int numeroCrias;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public int getNumeroCrias() {
		return numeroCrias;
	}
	public void setNumeroCrias(int numeroCrias) {
		this.numeroCrias=numeroCrias;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Número de crías: " +this.numeroCrias);
	}
}
