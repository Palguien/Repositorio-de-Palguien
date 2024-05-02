package bombillaYtal;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Alumno {
	//Atributes
	private final int TAMAÑO = 5;
	private String name;
	private String grupo;
	private int[] notas = new int[TAMAÑO];
	//Builders
	/**
	 * Builder of Alumno that ask for data
	 * @param name	String
	 * @param grupo	String
	 * @param notas	int[] size TAMAÑO
	 */
	public Alumno(String name, String grupo,int[] notas) {
		setName(name);
		setGrupo(grupo);
		setNotas(notas);
	}
	/**
	 * Builder of Alumno that ask for data
	 */
	public Alumno() {
		this(null,null,null);
		pedirDatos();
	}
	/**
	 * Builder of Alumno
	 * @param name	String
	 */
	public Alumno(String name) {
		this(name,null,null);
	}
	/**
	 * Builder of Alumno
	 * @param name	String
	 * @param grupo	String
	 */
	public Alumno(String name, String grupo) {
		this(name,grupo,null);
	}
	//Methods
	/**
	 * Method that fills Alumno atributes if the builder was empty
	 */
	private void pedirDatos() {
		int mark;
		int marks[]=new int[TAMAÑO];
		String name,group;
		@SuppressWarnings({ "resource", "unused" })
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Give me a name:");

		name = JOptionPane.showInputDialog("Give me your name");
		group =JOptionPane.showInputDialog("Give me your group");
		
		for (int i = 0; i < marks.length; i++) {
			do {
				System.out.println("Give the mark "+(i+1));
				//mark = keyboard.nextInt();
				mark = Integer.parseInt(JOptionPane.showInputDialog("Give the mark "+(i+1)+":"));
				System.out.println("Mark="+mark);
				System.out.println();
				//keyboard.nextLine();
			}while(mark<1 || mark>10);
			marks[i]=mark;
		}
		
		setName(name);
		setGrupo(group);
		setNotas(marks);
	}

	/**
	 * Method that prints the toString of ALumno
	 */
	public void visualizarDatos() {
		System.out.println(toString());
	}
	/**
	 * Method that returns the average mark of the student
	 * @return float
	 */
	public float notaMedia() {
		float total=0;
		if(getNotas()==null) {
			return -1;
		}else {
			for (int i = 0; i < notas.length; i++) {
				total=notas[i]+total;
			}
			return total/TAMAÑO;
		}
	}
	/**
	 * Method that returns the number of fails that the student has in marks[]
	 * @return int	number od failed asignatures (-1 if marks[] is null)
	 */
	public int countSuspensos() {
		int total=0;
		if(getNotas()==null) {
			return -1;
		}else {
			for (int i = 0; i < notas.length; i++) {
				if(notas[i]<5) {
					total++;
				}
			}
			return total;
		}
	}
	//Get y Set
	/**
	 * Get of atribute TAMAÑO
	 * @return int
	 */
	public int getTAMAÑO() {
		return TAMAÑO;
	}
	/**
	 * Get of atribute name
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * Set of atribute name
	 * @param name	String
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Get of atribute grupo
	 * @return String
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * Set of atribute grupo
	 * @param name	String
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * Get of atribute marks[]
	 * @return int[]
	 */
	public int[] getNotas() {
		return notas;
	}
	/**
	 * Set of atribute marks[]
	 * @param name	int[]
	 */
	public void setNotas(int[] notas) {
		this.notas = notas;
	}
	//toString
	/**
	 * toString of Alumno
	 */
	@Override
	public String toString() {
		return "Alumno [name=" + name + ", grupo=" + grupo + ", notas=" + Arrays.toString(notas) + "]";
	}
}
