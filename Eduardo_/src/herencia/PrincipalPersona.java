package herencia;

public class PrincipalPersona {
	public static void main(String[]args) {
		
		Persona p1=new Persona();
		p1.setEdad(20);
		p1.setNombre("Jose");
		p1.setEstatura(1.80);
		p1.mostrarDatos();
		
		Empleado e1=new Empleado();
		e1.setNombre("Pepita");
		e1.setEdad(35);
		e1.setEstatura(1.93);
		e1.setSalario(2228);
		e1.mostrarDatos();
	}
}
