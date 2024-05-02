package test;

import javax.swing.JOptionPane;

import aparatos.Aparato;
import aparatos.Dishwasher;
import aparatos.Refrigerator;
import aparatos.Washer;
import aparatos.WashingMachine;
import exceptions.NegativeInputException;

public class App {

	public static void main(String[] args) {
		Aparato[] bosch = new Aparato[8];
		try {
			//Example: 220 A
			String str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION>)", "INPUT APARATO", JOptionPane.QUESTION_MESSAGE);
			bosch[0] = data(str,0);
			str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION>)", "INPUT APARATO", JOptionPane.QUESTION_MESSAGE);
			bosch[1] = data(str,0);
			str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION> <FLOAT>)", "INPUT REFRIGERATOR", JOptionPane.QUESTION_MESSAGE);
			bosch[2] = data(str,1);
			str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION> <FLOAT>)", "INPUT WASHER", JOptionPane.QUESTION_MESSAGE);
			bosch[3] = data(str,2);
			str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION> <FLOAT> <INT>)", "INPUT WASHINGMACHINE", JOptionPane.QUESTION_MESSAGE);
			bosch[4] = data(str,4);
			str = JOptionPane.showInputDialog(null, "Input=(<FLOAT> <CALIFICATION> <FLOAT> <INT>)", "INPUT DISHWASHER", JOptionPane.QUESTION_MESSAGE);
			bosch[5] = data(str,3);	
			printVector(bosch);
		} catch (NegativeInputException e) {
			e.printStackTrace();
		}

	}
	/**
	 * convierte String en parametros e inicializa un aparato
	 * @param data String
	 * @param tipoMaquina 0:Aparato, 1:Refrigerator, 2:Washer, 3:Dishwasher, 4:WahingMachine
	 * @return Aparato
	 * @throws NumberFormatException
	 * @throws NegativeInputException
	 * @throws IllegalArgumentException si tipomachina no es valido
	 */
	public static Aparato data(String data, int tipoMaquina) throws NumberFormatException, NegativeInputException {
		String[] parts = data.split(" ");
		switch(tipoMaquina) {
		case 0:
			//Aparato
			Aparato apa = new Aparato(Float.parseFloat(parts[0]),parts[1]);
			return apa;
		case 1:
			//Refrigerator
			Aparato ref = new Refrigerator(Float.parseFloat(parts[0]),parts[1], Float.parseFloat(parts[2]));
			return ref;
		case 2:
			//Washer
			Aparato was = new Washer(Float.parseFloat(parts[0]),parts[1], Float.parseFloat(parts[2]));
			return was;
		case 3:
			//DishWasher
			Aparato dis = new Dishwasher(Float.parseFloat(parts[0]),parts[1], Float.parseFloat(parts[2]), Integer.parseInt(parts[3]));
			return dis;
		case 4:
			//Washing Machine
			Aparato wama = new WashingMachine(Float.parseFloat(parts[0]),parts[1], Float.parseFloat(parts[2]), Integer.parseInt(parts[3]));
			return wama;
		default:
			throw new IllegalArgumentException();
		}
		
	}
	private static void printVector(Aparato[] bosch) {
		for (Aparato aparato : bosch) {
			if(aparato==null) {
				continue;
			}else {
				System.out.println(aparato.toString());
			}
		}
	}

}
