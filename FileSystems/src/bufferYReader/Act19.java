package bufferYReader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * We save in the file "text.txt" the ID, age and name of a person 
 * using the methods writeUTF(), writeChar() and writeInt()
 */
public class Act19 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File fichero=new File(PATH,"prueba.dat");
		String dni="12345678A";
		int edad=26;
		String nombre="Juan Pérez García";
		//Abrimos fichero para lectura
		try {
			DataOutputStream salida = new DataOutputStream(new FileOutputStream(fichero,true));
			writeData(dni, edad, nombre, salida);
			writeData("5558888", 16, "Anastasio Furnier", salida);
			salida.close();
			DataInputStream entrada= new DataInputStream(new FileInputStream(fichero));
			dni=entrada.readUTF();
			entrada.readChar();//Elimina el tabulador
			edad=entrada.readInt();
			entrada.readChar(); //Elimina el tabulador
			nombre=entrada.readUTF();
			System.out.println("DNI: " + dni+ "\tEDAD: " + edad + "\tNOMBRE:" +nombre);
			entrada.close();
		}catch(IOException e) {
			System.out.println("Error de entrada/salida");
			e.printStackTrace();
			System.exit(0);
		}

	}

	private static void writeData(String dni, int edad, String nombre, DataOutputStream salida) throws IOException {
		salida.writeUTF(dni);
		salida.writeChar('\t');
		salida.writeInt(edad);
		salida.writeChar('\t');
		salida.writeUTF(nombre);
		salida.writeChar('\n');
	}

}
