package conexion;

public class Fabricante implements Comparable {
	private String id;
	private String name;
	
	
	
	public Fabricante(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Fabricante() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Fabricante [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Object o) {
		return (name.compareTo(((Fabricante) o).getName()));
	}
	
	
}
