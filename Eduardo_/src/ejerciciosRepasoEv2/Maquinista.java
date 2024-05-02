package ejerciciosRepasoEv2;

public class Maquinista extends Personal{
	private String nombre;
	private String DNI;
	private double sueldo;
	private String rango;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI=DNI;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo=sueldo;
	}	
	
	public String getRango() {
		return rango;
	}
	public void setRango(String rango) {
		this.rango=rango;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: " +this.nombre);
		System.out.println("DNI: " +this.DNI);
		System.out.println("Sueldo: " +this.sueldo);
		System.out.println("Rango adquirido: " +this.rango);
	}
	
}
