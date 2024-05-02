package ejerciciosRepasoEv2;

public class Mecanico extends Personal{
	private String nombre;
	private int telefono;
	//enum especialidad(frenos, hidráulica, electricidad, motor);
	//private especialidad especialidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono=telefono;
	}
//	public enum getEspecialidad() {
//		return especialidad;
//	}
	public void mostrarDatos() {
		System.out.println("Nombre: " +this.nombre);
		System.out.println("Teléfono: " +this.telefono);
		//System.out.println("Especialidad: " +this.especialidad);
	}
}
