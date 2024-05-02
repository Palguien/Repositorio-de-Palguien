package personasYtal;

public class Profesor extends Persona {
	//Atributes
	protected String[] groups;
	protected int id=0;
	protected String tutorshit;
	//builders
	public Profesor() {
		super();
		
	}
	public Profesor(String name, String surname, String adress, int age) {
		super(name, surname, adress, age);
		// TODO Auto-generated constructor stub
	}

	//get y set
	public int getId() {
		return id;
	}

	public int setId(int id) {
		if(id>0) {
			this.id = id;
			return id;
		}
			return -1;
	}
	public String getTutorshit() {
		return tutorshit;
	}
	public void setTutorshit(String tutorshit) {
		this.tutorshit = tutorshit;
	}
	public String[] getGroups() {
		return groups;
	}
	public void setGroups(String[] groups) {
		this.groups = groups;
	}
	
}
