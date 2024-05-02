package exercise1;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		Boat barquito = new Boat();
		Sailboat barco = new Sailboat();
		Yacht barcote = new Yacht();
		Rental r1 = new Rental();
		Rental r2 = new Rental();
		Rental r3 = new Rental();
		boolean flag;
		int inputInt;
		int[] inputPos = new int[2];
		String inputStr;

		// Barco normal (BOAT)
		do {
			JOptionPane.showMessageDialog(null, "Input data of Boat 1");
			flag = true;
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				barquito.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				barquito.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				barquito.setYear(inputInt);
				inputStr = JOptionPane.showInputDialog(null, "DNI of the boat's owner?:");
				r1.setDNI(inputStr);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "days in mooring?:"));
				r1.setNumDays(inputInt);
				inputPos[0] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (X Coordinate)?:"));
				inputPos[1] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (Y Coordinate):"));
				r1.setMooringPos(inputPos);
				r1.setBoat(barquito);

			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Error detectado en los argumentos, reintroduzca los datos",
						"ERROR", JOptionPane.ERROR_MESSAGE);
				flag = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error detectado, reintroduzca los datos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				flag = false;
			}

		} while (!flag);
		JOptionPane.showMessageDialog(null, "price of the rental of Boat 1 = " + r1.calculateRental());

		// Barco especial 1 (Sailboat)
		do {
			JOptionPane.showMessageDialog(null, "Input data of Boat 2");
			flag = true;
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				barco.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				barco.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				barco.setYear(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "number of masts of the boat?:"));
				barco.setMasts(inputInt);
				inputStr = JOptionPane.showInputDialog(null, "DNI of the boat's owner?:");
				r2.setDNI(inputStr);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "days in mooring?:"));
				r2.setNumDays(inputInt);
				inputPos[0] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (X Coordinate)?:"));
				inputPos[1] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (Y Coordinate):"));
				r2.setMooringPos(inputPos);
				r2.setBoat(barco);

			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Error detectado en los argumentos, reintroduzca los datos",
						"ERROR", JOptionPane.ERROR_MESSAGE);
				flag = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error detectado, reintroduzca los datos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				flag = false;
			}

		} while (!flag);
		JOptionPane.showMessageDialog(null, "price of the rental of Boat 2 = " + r2.calculateRental());
		
		// Barco especial 3 (Yacht)
		do {
			JOptionPane.showMessageDialog(null, "Input data of Boat 3");
			flag = true;
			try {
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "plate of the boat?:"));
				barcote.setPlate(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "length(in meters) of the boat?:"));
				barcote.setLength(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "year of manufacture of the boat?:"));
				barcote.setYear(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "horsepower of the boat?:"));
				barcote.setPower(inputInt);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "number of cabins the boat?:"));
				barcote.setCabins(inputInt);
				inputStr = JOptionPane.showInputDialog(null, "DNI of the boat's owner?:");
				r3.setDNI(inputStr);
				inputInt = Integer.parseInt(JOptionPane.showInputDialog(null, "days in mooring?:"));
				r3.setNumDays(inputInt);
				inputPos[0] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (X Coordinate)?:"));
				inputPos[1] = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Position in mooring (Y Coordinate):"));
				r3.setMooringPos(inputPos);
				r3.setBoat(barcote);

			} catch (IllegalArgumentException e) {
				JOptionPane.showMessageDialog(null, "Error detectado en los argumentos, reintroduzca los datos",
						"ERROR", JOptionPane.ERROR_MESSAGE);
				flag = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Error detectado, reintroduzca los datos", "ERROR",
						JOptionPane.ERROR_MESSAGE);
				flag = false;
			}

		} while (!flag);
		JOptionPane.showMessageDialog(null, "price of the rental of Boat 3 = " + r3.calculateRental());
	}

}
