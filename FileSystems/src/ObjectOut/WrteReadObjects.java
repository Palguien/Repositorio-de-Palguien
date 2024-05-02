package ObjectOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;

import dialogs.Dialogs;

public class WrteReadObjects {

	public static void main(String[] args) {
		final String PATH = "C:\\File";

		File folder = new File("PATH");
		if (!folder.exists()) {
			System.err.println("Folder does not exist");
			folder.mkdir();
		} else {
			int empleados = Dialogs.askIntDialog("Nº de empleados?");

			Empleado[] lines = new Empleado[empleados];

			for (int i = 0; i < lines.length; i++) {
				Dialogs.infoMessage("Empleado " + i + ":");
				lines[i] = new Empleado(JOptionPane.showInputDialog("Nombre:"), Dialogs.askIntDialog("Age:"),
						Dialogs.askFloatDialog("Salary:"));
			}

			try {
				// creating the object file
				File fich = new File(PATH, "empleados.dat");
				FileOutputStream fileStreamOut = new FileOutputStream(fich);
				ObjectOutputStream objFileOut = new ObjectOutputStream(fileStreamOut);

				// writing objects
				for (Empleado element : lines) {
					objFileOut.writeObject(element);
				}
				objFileOut.close();

				FileInputStream fileStreamIn = new FileInputStream(fich);
				ObjectInputStream objFileIn = new ObjectInputStream(fileStreamIn);
				// reading objects
				int cont = 0;
				for (Empleado element : lines) {
					try {
						lines[cont] = (Empleado) objFileIn.readObject();
						cont++;
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
				objFileIn.close();

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

}
