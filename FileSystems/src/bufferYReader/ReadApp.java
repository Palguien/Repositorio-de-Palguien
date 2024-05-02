package bufferYReader;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadApp {
	final static String PATH = "C:\\File";
	static File file1 = new File(PATH, "pedido.dat");

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		LineOrder[] lineOrder=new LineOrder[0];
		try {
			
			String descrip;
			int units;
			double price;
			DataInputStream inFile;
			System.out.println(filas());
			lineOrder=new LineOrder[filas()];
			
			inFile = new DataInputStream(new FileInputStream(file1));
			
			int cont=0;
			while ((descrip = inFile.readUTF()) != null) {
				units = inFile.readInt();
				price = inFile.readDouble();
				lineOrder[cont] = new LineOrder(descrip, units, price);
			
				cont++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(EOFException e) {
			System.out.println("bye");	
		} catch (IOException e) {
			e.printStackTrace();
		}

		 for (LineOrder lineOrder2 : lineOrder) {

			 System.out.println(lineOrder2.toString());

		}

	}

	private static int filas() throws FileNotFoundException, IOException {
		String descrip;
		int units;
		double price;
		DataInputStream inFile;
		
		inFile = new DataInputStream(new FileInputStream(file1));
		int count=0;
		try {
			while ((descrip = inFile.readUTF()) != null) {
				units = inFile.readInt();
				price = inFile.readDouble();	
				count++;
			}
		}catch(EOFException e) {
			System.out.println("bye");	
		}
		inFile.close();
		return count;
	}

}
