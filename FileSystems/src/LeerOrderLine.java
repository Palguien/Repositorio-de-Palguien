import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerOrderLine {

	public static void main(String[] args) {
		final String PATH="C:\\File";
		File fichero=new File(PATH,"orderLineCharcuteria.dat");
		
		double precio;
		int unidad;
		long total;
		String descripcion;
		try {
			DataInputStream entrada = new DataInputStream(new FileInputStream(fichero)); 
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

	}

}
