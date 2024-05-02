package ejercicio1;

public class Jefe extends Empleado{

	protected String titulo;
	protected String departamento;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	
	public String getDepartamento() {
			return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	
	public void mostrarDatos() {
		super.mostrarDatos();	
		System.out.println("Título: " +this.titulo);
		System.out.println("Departamento: " +this.departamento);
		
	}
	
}
