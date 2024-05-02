package animals;

import javax.swing.JOptionPane;

public class Person extends Mammal {
	//atributes
	private String profession;
	//builder
	public Person() {
		askperson();
	}
	//method
	public void askperson() {
		askMammal();
		setProfession(JOptionPane.showInputDialog("Profession:"));
	}
	//get y set
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	@Override
	public String toString() {
		return "Person [profession=" + profession + ", getBones()=" + getBones() + ", getLimbs()=" + getLimbs()
				+ ", getOffspring()=" + getOffspring() + ", getName()=" + getName() + "]";
	}
	
}
