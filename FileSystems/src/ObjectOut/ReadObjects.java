package ObjectOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjects {

	public static void main(String[] args) {
		LineOrder[] lines= new LineOrder[4];
		
		final String PATH="C:\\File";
		
		try {
			//creating the object file
			File fich = new File(PATH,"fastfoods.ftw");
			FileInputStream fileStream = new FileInputStream(fich);
			ObjectInputStream objFile = new ObjectInputStream(fileStream);
			//reading objects
			int cont = 0;
			for (LineOrder element : lines) {
				try {
					lines[cont]=(LineOrder) objFile.readObject();
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
