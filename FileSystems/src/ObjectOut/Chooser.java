package ObjectOut;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

import dialogs.Dialogs;

public class Chooser {

	public static void main(String[] args) {
		final String PATH = "C:\\File";

		File folder = new File(PATH);
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
				//Chooser y filtros
				JFileChooser chooser = new JFileChooser(folder);
				FileNameExtensionFilter filter = new FileNameExtensionFilter("cosas de ejemplo","dat","txt");
				chooser.setFileFilter(filter);
				chooser.showOpenDialog(null);
				File fich = chooser.getSelectedFile();

				// creating the object file
				//File fich = new File(PATH, "cosas.dat");
				FileOutputStream fileStreamOut = new FileOutputStream(fich);
				ObjectOutputStream objFileOut = new ObjectOutputStream(fileStreamOut);

				// writing objects
				objFileOut.writeObject("Tus muertos");
				objFileOut.writeObject(lines);
				objFileOut.writeObject(lines[0]);
				objFileOut.close();

				FileInputStream fileStreamIn = new FileInputStream(fich);
				ObjectInputStream objFileIn = new ObjectInputStream(fileStreamIn);
				// reading objects
				
				System.out.println(objFileIn.read());
				System.out.println(objFileIn.read());
				System.out.println(objFileIn.read());
				
				objFileIn.close();

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
			
		}

	}

}
