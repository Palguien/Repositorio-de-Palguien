package pr1estrdinamicas_PabloPollos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.swing.JFileChooser;

public class AppEscribir {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		HashMap<Character,Académico> rae = new HashMap<>();	//Declarar mapa
		rae.put('A', new Académico("Wamba",710));	//Insertar académicos al mapa
		rae.put('B', new Académico("Wifredo",2019));
		rae.put('C', new Académico("Recaredo",1959));
		rae.put('Ñ', new Académico("Reverte",2000));
		
		Académico aca = new Académico("Volcarona",2010);//comprobamos que nuevoAcademico() funciona
		nuevoAcademico(rae,'Z',aca);
		
		
		//recorrer el mapa
		System.out.println("Recorriendo el HashMap:");
		char clave;
		Académico valor;
		for (Entry<Character, Académico> elemento : rae.entrySet()) {
			clave=elemento.getKey();
			valor=elemento.getValue();
			System.out.println("> "+clave+" guarda el valor "+valor);
		}
		
		ArrayList<Académico> listaSinLetra=new ArrayList<>(rae.values()); //Declaro Arraylist de académicos
		//escribir en orden
		//nombre
		System.out.println("--- Ordenar por nombre");
		
		Collections.sort(listaSinLetra);
		
		for (Académico element : listaSinLetra) {
			System.out.println(element);
		}
		//ingreso
		System.out.println("--- Ordenar por ingreso");
		
		ComparaIngreso cl=new ComparaIngreso();          
        Collections.sort(listaSinLetra,cl);
        
		for (Académico element : listaSinLetra) {
			System.out.println(element);
		}
		//letra
		Set<Map.Entry<Character, Académico>> conLetra = rae.entrySet();
        List<Map.Entry<Character, Académico>> listaConLetra
                = new ArrayList<>(conLetra);
        ComparaLetras c2=new ComparaLetras();          
        Collections.sort(listaConLetra,c2);
        
        System.out.println("Orden por letra: " + listaConLetra); 
		
		
		//Chooser para escritura
		JFileChooser chooser = new JFileChooser(".\\fichObj");
		chooser.showOpenDialog(null);
		File fich=chooser.getSelectedFile();
		// creating the object file
		FileOutputStream fileStreamOut;
			//escritura	
			try {
				fileStreamOut = new FileOutputStream(fich);
				ObjectOutputStream objFileOut;
				objFileOut = new ObjectOutputStream(fileStreamOut);

				objFileOut.writeObject(rae);

				objFileOut.close();
			} catch (FileNotFoundException e1) {		
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

	}
	//nuevoAcademico()
	static boolean nuevoAcademico(HashMap<Character, Académico> rae, char c, Académico aca) {
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			rae.put(c,aca);
			return true;
		}else {
			return false;
		}
		
	}

}
