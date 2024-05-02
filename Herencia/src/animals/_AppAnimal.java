package animals;

import javax.swing.JOptionPane;

public class _AppAnimal {

	public static void main(String[] args) {
		
		Animal[] lista = new Animal[6];
		for (int i = 0; i < 3; i++) {
			JOptionPane.showMessageDialog(null, "ANIMAL "+(i+1));
			lista[i] = new Animal();
		}
		for (int i = 3; i < 5; i++) {
			JOptionPane.showMessageDialog(null, "ANIMAL "+(i+1)+" (MAMMAL)");
			lista[i] = new Mammal();
		}
		JOptionPane.showMessageDialog(null, ("ANIMAL "+6+" (MAMMAL, PERSON)"));
		lista[5]=new Person();
		//Print pantalla
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
		}

	}

}
