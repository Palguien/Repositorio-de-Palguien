package bufferYReader;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * To save the sata of an order in a file, we have the following code fragment
 */
public class Act20 {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File fichero=new File(PATH,"pedido.dat");
		double[] precios = {350, 400, 890, 6200, 8730};
		int[] unidades = {5, 7, 12, 8, 30};
		String[] descripciones = {"cajas de pollos", "cajas de mejillones"
				,"cajas de boligrafos", "carteras", "bacon"};
		try{
		
		DataOutputStream salida = new DataOutputStream(new FileOutputStream(fichero)); 
		for (int i = 0; i < precios.length; i++) {
			salida.writeUTF (descripciones[i]);
			salida.writeInt (unidades [i]);
			salida.writeDouble (precios [i]);
		}
		salida.close();
		
		DataInputStream entrada = new DataInputStream(new FileInputStream(fichero)); 
		double precio;
		int unidad;
		long total;
		String descripcion;
		while((descripcion=entrada.readUTF())!=null) {
			unidad=entrada.readInt();
			precio=entrada.readDouble();
			total=(long) (unidad*precio);
			System.out.println("desc: " + descripcion+ "\tUDS: " + unidad + "\tPrecio:" +precio+ "\tTotal:" +total);
		}
		entrada.close();
		}catch(EOFException e1){
			System.out.println("Fin de lectura");
		} catch (IOException e) {
		System.out.println("Error de entrada/salida.");
		e.printStackTrace();
		}
		System.out.println(TotalDeTotales(fichero));
	}
	/**
	 * Si devuelve -1 es que ha habido un fallo
	 * @param fichero
	 * @return
	 */
	public static double TotalDeTotales(File fichero) {
		long totalSuma=-1;
		try {
			DataInputStream entrada = new DataInputStream(new FileInputStream(fichero)); 
			double precio;
			int unidad;
			long total;
			totalSuma=0;
			@SuppressWarnings("unused")
			String descripcion;
			
			while((descripcion=entrada.readUTF())!=null) {
				unidad=entrada.readInt();
				precio=entrada.readDouble();
				total=(long) (unidad*precio);
				totalSuma=totalSuma+total;
			}
			entrada.close();
		}catch(EOFException e1){
			System.out.println("Fin de lectura");
		}catch(IOException e) {
			System.out.println("Error de entrada/salida.");
			e.printStackTrace();
		}
		return totalSuma;
		
	}

}

