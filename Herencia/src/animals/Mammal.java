package animals;

import javax.swing.JOptionPane;

public class Mammal extends Animal{
	//atributes
	private int bones,limbs;
	//builder
	public Mammal() {
		askMammal();
	}
	//methods
	public void askMammal() {
		askAnimal();
		setBones(Integer.parseInt(JOptionPane.showInputDialog("Number of bones:")));
		setLimbs(Integer.parseInt(JOptionPane.showInputDialog("Number of limbs:")));
	}
	
	//get y set
	public int getBones() {
		return bones;
	}

	public void setBones(int bones) {
		this.bones = bones;
	}

	public int getLimbs() {
		return limbs;
	}

	public void setLimbs(int limbs) {
		this.limbs = limbs;
	}

	@Override
	public String toString() {
		return "Mammal [bones=" + bones + ", limbs=" + limbs + ", getOffspring()=" + getOffspring() + ", getName()="
				+ getName() + "]";
	}

	

	
}
