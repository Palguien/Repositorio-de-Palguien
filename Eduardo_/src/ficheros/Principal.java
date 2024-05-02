package ficheros;

import java.io.*;

public class Principal {
	
	final static String RUTA="C:\\Users\\mañana\\eclipse-workspace\\Eduardo_\\ficheros";
	static File fich=new File(RUTA,"inven.dat");
	
	public static void main(String[]args) {
		//array de objeto LineaOrden
		LineaOrden linea[]=new LineaOrden[5];
		String descrip;
		int unidades, i=0;
		double precio;
		try {
			FileInputStream fichero=new FileInputStream(fich);
			DataInputStream entrada=new DataInputStream(fichero);
			descrip=entrada.readUTF();
			while(descrip!=null) {
				unidades=entrada.readInt();
				precio=entrada.readDouble();
				linea[i]=new LineaOrden(descrip, unidades, precio);
				i++;
				descrip=entrada.readUTF();
			}
			entrada.close();
		
		
		}
		catch(FileNotFoundException e1) {
			e1.printStackTrace();
		}
		catch(EOFException e2) {
			System.out.println("Fin.");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		//Salida
		for(i=0;i<linea.length;i++)
			System.out.println(linea[i].toString());
		
		//Esto es foreach y hace lo mismo que el bucle for
		for (LineaOrden lin:linea){
			System.out.println(lin.toString());
		}
	}
}
