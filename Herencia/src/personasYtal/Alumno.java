package personasYtal;

import java.util.Arrays;

public class Alumno extends Persona {
	//atributes
	private String group;
	private int marks[];
	final private int TAM=5;
	//builders
	public Alumno(String name, String surname, String adress, int age, String group, int[] marks) {
		super(name, surname, adress, age);
		setGroup(group);
		setMarks(marks);
	}
	public Alumno(String name, String surname) {
		super(name,surname,null,0);
		int[] notas=new int[TAM];
		for (int i = 0; i < notas.length; i++) {
			notas[i]=0;
		}
		setGroup(null);
		setMarks(notas);
	}
	//get y set
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int marks[]) {
		this.marks = marks;
	}
	public int getTAM() {
		return TAM;
	}
//	@Override
//	public String toString() {
//		return super.toString()+"Student [group=" + group + ", marks=" + Arrays.toString(marks) + ", TAM=" + TAM + "]";
//	}
	@Override
	public String toString() {
		return "Student [group=" + group + ", marks=" + Arrays.toString(marks) + ", TAM=" + TAM + ", getName()="
				+ getName() + ", getSurname()=" + getSurname() + ", getAge()=" + getAge() + ", getAdress()="
				+ getAdress() + "]";
	}
	

	
	

}
