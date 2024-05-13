package hashMap_Diccionarios;

import java.util.HashMap;
import java.util.Map;

import dialogs.Dialogs;

public class ejemplo1 {

	public static void main(String[] args) {
		String auxStr;
		HashMap<Integer,String> diccionario = new HashMap<>();	//Declarar
		diccionario.put(0, "Zero");	//Insertar
		diccionario.put(1, "One");
		diccionario.put(2, "Two");
		diccionario.put(3, "Three");
		diccionario.put(4, "Four");
		diccionario.put(5, "Five");
		diccionario.put(6, "Six");
		diccionario.put(7, "Seven");
		diccionario.put(8, "Eight");
		diccionario.put(9, "Nine");
		
		diccionario.put(5, "Por el culo te la hinco"); 	//Sobreescribir
		diccionario.remove(7);							//Eliminar
		
		int cosa = Dialogs.askIntDialog("0-9");
		System.out.println(diccionario.get(cosa));
		System.out.println("--------");
		//lectura completa
		for (int i = 0; i <= diccionario.size(); i++) {
			auxStr=diccionario.get(i);
			System.out.println(auxStr);
		}
		System.out.println("--------");
		//check valor
		if(diccionario.containsValue("Two")) {
			System.out.println("- El valor 'Two' está");
		}
		//check clave
		int key2remove=2;
		if(diccionario.containsKey(key2remove)) {
			System.out.println("- remove() returns: "+diccionario.remove(key2remove));
		}
		System.out.println("--------");
		//recorrer el mapa
		System.out.println("Recorriendo el HashMap:");
		int clave;
		String valor;
		for (Map.Entry<Integer, String> elemento : diccionario.entrySet()) {
			clave=elemento.getKey();
			valor=elemento.getValue();
			System.out.println("> "+clave+" guarda el valor "+valor);
		}

	}

}
