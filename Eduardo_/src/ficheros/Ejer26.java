package ficheros;
import java.io.*;
import java.util.*;
public class Ejer26 {
	public static void main(String[]args) {
	int nAlumnos;
	Alumno clase[];
	Scanner entrada=new Scanner(System.in);
	int i=0;
	Alumno al;
	
	try {
		FileOutputStream fich=new FileOutputStream("clase.dat");
		ObjectOutputStream fichero=new ObjectOutputStream(fich);
		System.out.println("Número de alumnos de la clase: ");
		nAlumnos=entrada.nextInt();
		
		clase=new Alumno[nAlumnos];
		//pedimos los datos de cada alumno
		for(i=0;i<nAlumnos;i++) {
			System.out.println("Datos del alumno "+i+" : ");
			clase[i]=new Alumno();
		}
		
		//Guardamos los objetos(datos) en el fichero
		for(i=0;i<nAlumnos;i++) {
			fichero.writeObject(clase[i]);
		}
		fichero.close();
	}
	catch(FileNotFoundException e) {
		System.out.println("El fichero no existe");
	}

	catch (IOException e) {
		System.out.println("Error E/S.");
	}
		
	
	
	
	
	
	}
}
