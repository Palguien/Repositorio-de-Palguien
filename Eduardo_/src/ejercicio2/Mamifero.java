package ejercicio2;

public class Mamifero extends Animal{
	
	protected int numeroHuesos;
	protected int numeroExtremidades;
	
	
	public int getNumeroHuesos() {
		return numeroHuesos;
	}
	public void setNumeroHuesos(int numeroHuesos) {
		this.numeroHuesos=numeroHuesos;
	}
	public int getNumeroExtremidades() {
		return numeroHuesos;
	}
	public void setNumeroExtremidades(int numeroExtremidades) {
		this.numeroExtremidades=numeroExtremidades;
	}
	
	public void mostrarDatos() {
		System.out.println("Número de huesos: " +this.numeroHuesos);
		System.out.println("Número de extremidades: " +this.numeroExtremidades);
	}

}
