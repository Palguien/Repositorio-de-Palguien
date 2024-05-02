package ObjectOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WrteObjects {
	
	private static Empleado[] lines= new Empleado[4];
	
	public static void main(String[] args) {
		final String PATH="C:\\File";
		
		lines[0]=new Empleado("Chicken meat",5,10.50);
		lines[1]=new Empleado("Pork Meat",3,8);
		lines[2]=new Empleado("Beef meat",10,5);
		lines[3]=new Empleado("Venison meat",10,10);
		
		

		try {
			//creating the object file
			File fich = new File(PATH,"fastfoods.ftw");
			FileOutputStream fileStream = new FileOutputStream(fich,true);
			ObjectOutputStream objFile = new ObjectOutputStream(fileStream);
			
			//writing objects
			for (Empleado element : lines) {
				objFile.writeObject(element);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			//creating the object file
			File fich = new File(PATH,"fastfoods.ftw");
			FileInputStream fileStream = new FileInputStream(fich);
			ObjectInputStream objFile = new ObjectInputStream(fileStream);
			//reading objects
			int cont = 0;
			for (Empleado element : lines) {
				try {
					lines[cont]=(Empleado) objFile.readObject();
					cont++;
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
			}

			for (int i = 0; i < lines.length; i++) {
				System.out.println(lines[i].toString());
				
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
