package herencia;

public class Empleado extends Persona{
	private double salario;
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario=salario;
	}
	public void mostrarDatos() {
		super.mostrarDatos();
		System.out.println("Salario: "+this.salario);
	}
	
}
