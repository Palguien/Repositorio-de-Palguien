package pr1estrdinamicas_PabloPollos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class AppModif {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Chooser para escritura
		JFileChooser chooser = new JFileChooser(".\\fichObj");
		chooser.showOpenDialog(null);
		File fich=chooser.getSelectedFile();
		//Lectura
		FileInputStream fileStreamIn;
		try {
			fileStreamIn = new FileInputStream(fich);
			ObjectInputStream objFileIn = new ObjectInputStream(fileStreamIn);
			// reading objects
			HashMap<Character,Académico> rae = (HashMap<Character, Académico>) objFileIn.readObject();	//Declarar mapa
			objFileIn.close();
			//recorrer el mapa
			System.out.println("Recorriendo el HashMap:");
			char clave;
			Académico valor;
			for (Entry<Character, Académico> elemento : rae.entrySet()) {
				clave=elemento.getKey();
				valor=elemento.getValue();
				System.out.println("> "+clave+" guarda el valor "+valor);
			}
			//switch menú
			boolean loop = true;
			String[] options = {"Ordenar nombre","Ordenar letra","Añadir","Borrar"};
			int selec;
			while(loop) {
				ArrayList<Académico> listaSinLetra=new ArrayList<>(rae.values()); //Declaro Arraylist de académicos
				
				selec=JOptionPane.showOptionDialog(null, "Elige", "SELECT", JOptionPane.CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, null);
				switch(selec) {
				case 0:
					//ordenar por nombre
					System.out.println("--- Ordenar por nombre");
					Collections.sort(listaSinLetra);
					for (Académico element : listaSinLetra) {
						System.out.println(element);
					}
					break;
				case 1:
					//ordenar por letra
					Set<Map.Entry<Character, Académico>> conLetra = rae.entrySet();
			        List<Map.Entry<Character, Académico>> listaConLetra
			                = new ArrayList<>(conLetra);
			        ComparaLetras c2=new ComparaLetras();          
			        Collections.sort(listaConLetra,c2);
			        
			        System.out.println("Orden por letra: " + listaConLetra); 
					break;
				case 2:
					//meter nuevo academico
					AppEscribir.nuevoAcademico(rae, dialogos.Dialogos.pedirCadena("letra clave").charAt(0),
							new Académico(dialogos.Dialogos.pedirCadena("nombre"), dialogos.Dialogos.pedirEntero("año ingreso")));
					break;
				case 3:
					//Borrar academico por letra
					char delete = dialogos.Dialogos.pedirCadena("letra a eliminar").charAt(0);
					rae.remove(delete);
					break;
				default:
					//salir
					loop=false;
				}
				
			}
			
			//Chooser para escritura
			JFileChooser chooser1 = new JFileChooser(".\\fichObj");
			chooser1.showOpenDialog(null);
			File fich1=chooser1.getSelectedFile();
			// creating the object file
			FileOutputStream fileStreamOut;
				//escritura	
				try {
					fileStreamOut = new FileOutputStream(fich1);
					ObjectOutputStream objFileOut;
					objFileOut = new ObjectOutputStream(fileStreamOut);

					objFileOut.writeObject(rae);

					objFileOut.close();
				} catch (FileNotFoundException e1) {		
					e1.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
