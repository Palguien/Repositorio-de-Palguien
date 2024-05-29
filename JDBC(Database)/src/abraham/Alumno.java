package abraham;

public class Alumno {
	static String codigo="0000000000";
	private String CodFab;
	private String NomFab;
	
	public Alumno() {
		int cod;
		cod=Integer.parseInt(Articulo.codigo)+1;
		Alumno.codigo=Integer.toString(cod);		
		this.CodFab=Alumno.codigo;
		this.NomFab="";		
	}
	
	public Alumno(String codFab, String nomFab) {		
		CodFab = codFab;
		NomFab = nomFab;
	}

	public String getCodFab() {
		return CodFab;
	}

	public void setCodFab(String codFab) {
		CodFab = codFab;
	}

	public String getNomFab() {
		return NomFab;
	}

	public void setNomFab(String nomFab) {
		NomFab = nomFab;
	}

	@Override
	public String toString() {
		return "Fabricante [CodFab=" + CodFab + ", NomFab=" + NomFab + "]";
	}	
	
}
