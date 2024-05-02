package animals;

import javax.swing.JOptionPane;

public class Animal {
	//atributes
	protected String name;
	protected int offspring;
	//builder
	public Animal() {
		askAnimal();
	}
	//method
	public void askAnimal() {
		setName(JOptionPane.showInputDialog("Name?"));
		setOffspring(Integer.parseInt(JOptionPane.showInputDialog("Number of offspring:")));
	}
	public void visualizeData() {
		System.out.println(toString());
	}
	//get y set
	public int getOffspring() {
		return offspring;
	}
	public void setOffspring(int offspring) {	
		this.offspring = offspring;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", offspring=" + offspring + "]";
	}
	
	
}
