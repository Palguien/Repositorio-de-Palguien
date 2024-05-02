package exercise2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int empleados, age;
		do {
			empleados = Integer.parseInt(
					JOptionPane.showInputDialog(null, "number of employees de " + Employee.getCompanyName() + ":"));
			if (empleados < 0) {
				JOptionPane.showMessageDialog(null, "No negative numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (empleados < 0);
		// Crear emleados
		Employee[] plantilla = new Employee[empleados];
		for (int i = 0; i < plantilla.length; i++) {
			JOptionPane.showMessageDialog(null, "Employee " + i);
			plantilla[i] = new Employee();
			try {
				// Crear dni
				plantilla[i].setDni(new Dni(Integer.parseInt(JOptionPane.showInputDialog(null, "numero dni:")),
						(JOptionPane.showInputDialog(null, "letra dni:")).charAt(0)));
				plantilla[i].setName(JOptionPane.showInputDialog(null, "employee name:"));
				plantilla[i].setCity(JOptionPane.showInputDialog(null, "city name:"));
				plantilla[i].setDate(JOptionPane.showInputDialog(null, "date of birth:"));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Errores detectados");
				i--;
			}
		}

		// showOlder
		System.out.println("-------------------");
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "age to surpass:"));
			if (empleados < 0) {
				JOptionPane.showMessageDialog(null, "No negative numbers", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
		} while (empleados < 0);
		showOlderThan(plantilla, age);
		; // showData
		System.out.println("-------------------");
		showData(plantilla);
	}

	public static void showData(Employee[] lista) {
		System.out.println(Employee.getCompanyName());
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i].toString());
		}
	}

	public static void showOlderThan(Employee[] lista, int edad) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].calculatesAge() > edad) {
				System.out.println(lista[i].toString());
			}

		}
	}

}
