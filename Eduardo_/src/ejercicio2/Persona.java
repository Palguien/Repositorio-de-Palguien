package ejercicio2;

public class Persona extends Mamifero{
	
	protected String profesion;
	
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion=profesion;
	}
	public void mostrarDatos() {
		//System.out.println("Persona");
		System.out.println("Profesión:" +this.profesion);
	}
}
