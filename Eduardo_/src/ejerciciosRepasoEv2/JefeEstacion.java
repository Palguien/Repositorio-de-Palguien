package ejerciciosRepasoEv2;

public class JefeEstacion extends Personal{
	private String nombre;
	private String DNI;
	private String fechaNombramiento;
	
	
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
	public String getFechaNombramiento() {
		return fechaNombramiento;
	}
	public void setFechaNombramiento(String fechaNombramiento) {
		this.fechaNombramiento=fechaNombramiento;
	}
	public void mostrarDatos() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("DNI: " +this.DNI);
		System.out.println("Fecha de nombramiento: " +this.fechaNombramiento);
	}
	
}
