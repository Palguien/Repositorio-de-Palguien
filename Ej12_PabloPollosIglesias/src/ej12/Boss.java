package ej12;

import javax.swing.JOptionPane;

public class Boss extends Employee{
	//atributes
	
	private static int bonusBoss = 250;
	//builder
	public Boss() {
		super(null,0,0);
		setName(JOptionPane.showInputDialog("Name?"));
		setAge(Integer.parseInt(JOptionPane.showInputDialog("Age?")));	
		setIncrease(0);
	}
	//method
	@Override
	public int getSueldoTotal() {
		return getBaseSalary()+bonusBoss;
	}
	//get y set
	public static int getBonusBoss() {
		return bonusBoss;
	}

	public static void setBonusBoss(int bonusBoss) {
		Boss.bonusBoss = bonusBoss;
	}
	@Override
	public String toString() {
		return "Boss [getName()=" + getName() + ", getAge()=" + getAge() + ", bonus = "+bonusBoss+"]";
	}
	
	
	
}
