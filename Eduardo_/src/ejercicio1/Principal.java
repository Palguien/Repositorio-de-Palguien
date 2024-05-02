package ejercicio1;

public class Principal {
	public static void main(String[]args) {
		
		Empleado e1=new Empleado();
		e1.setNombre("Eduardo");
		e1.setSueldo(1000);
		e1.mostrarDatos();
		
		Empleado e2=new Empleado();
		e2.setNombre("Alberto");
		e2.setSueldo(2000);
		e2.mostrarDatos();
		
		Empleado e3=new Empleado();
		e3.setNombre("Manuel");
		e3.setSueldo(1500);
		e3.mostrarDatos();
		
		Empleado e4=new Empleado();
		e4.setNombre("Juan");
		e4.setSueldo(3000);
		e4.mostrarDatos();
		
		Empleado e5=new Empleado();
		e5.setNombre("Jose Luis");
		e5.setSueldo(700);
		e5.mostrarDatos();
		
		
		
		Jefe j1=new Jefe();
		j1.setNombre("Adrián");
		j1.setSueldo(12345);
		j1.setTitulo("Ingeniero de Software");
		j1.setDepartamento("Desarrollo de Software");
		j1.mostrarDatos();
		
		Jefe j2=new Jefe();
		j2.setNombre("Zacarias");
		j2.setSueldo(15432);
		j2.setTitulo("Ingeniero de Telecomunicaciones");
		j2.setDepartamento("Redes y Telecomunicación");
		j2.mostrarDatos();
		
		
	}
}
