package hashMap_Diccionarios;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ejemplo2 {

	public static void main(String[] args) {
		
		HashMap<Character,Académico> rae = new HashMap<>();	//Declarar
		rae.put('A', new Académico("Wamba",710));	//Insertar
		rae.put('B', new Académico("Wamba",2019));
		rae.put('C', new Académico("Wamba",1959));
		rae.put('Ñ', new Académico("Reverte",2000));
		
		Académico aca = new Académico("Volcarona",2010);
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

	}

	private static boolean nuevoAcademico(HashMap<Character, Académico> rae, char c, Académico aca) {
		if((c>='A' && c<='Z')||(c>='a' && c<='z')) {
			rae.put(c,aca);
			return true;
		}else {
			return false;
		}
		
	}

}
