package ejercicio2;

public class Principal {
	public static void main(String []args) {

		
		//3personas, 2 mamíferos, 1 animal
		Animal a1=new Animal();
		a1.setNombre("Alvaro");
		a1.setNumeroCrias(35);
		a1.mostrarDatos();
		
		Persona p1=new Persona();
		p1.setProfesion("Camionero");
		p1.mostrarDatos();

		Persona p2=new Persona();
		p2.setProfesion("Dependiente");
		p2.mostrarDatos();

		Persona p3=new Persona();
		p3.setProfesion("Reponedor");
		p3.mostrarDatos();
		
		Mamifero m1=new Mamifero();
		m1.setNumeroHuesos(250);
		m1.setNumeroExtremidades(55);
		m1.setNombre("Pato");
		m1.setNumeroCrias(2);
		m1.mostrarDatos();
		
		Mamifero m2=new Mamifero();
		m2.setNumeroHuesos(803);
		m2.setNumeroExtremidades(2981);
		m2.setNombre("Lobo");
		m2.setNumeroCrias(62);
		m2.mostrarDatos();
		
		
		
	}

}
