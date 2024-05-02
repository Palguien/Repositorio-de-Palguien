package ficheros;

import java.io.Serializable;
import java.util.Scanner;

public class Alumno implements Serializable{
	private String nombre;
	private int edad;
	
	public Alumno() {
		this.pedirDatos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void pedirNombre() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Nombre del alumno: ");
		this.nombre=entrada.next();
	}
	
	public void pedirEdad() {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Edad del alumno: ");
		this.edad=entrada.nextInt();
	}

	public void pedirDatos() {
		this.pedirNombre();
		this.pedirEdad();
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	

}
