package herencia;

public class Persona {
	protected String nombre;
	protected int edad;
	protected double estatura;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura=estatura;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: "+this.nombre);
		System.out.println("Edad: "+this.edad);
		System.out.println("Estatura: "+this.estatura);		
	}
	
}
