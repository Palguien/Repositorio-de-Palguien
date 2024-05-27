package abraham;

public class Fabricante {
	static String codigo="0000000000";
	private String CodFab;
	private String NomFab;
	
	public Fabricante() {
		int cod;
		cod=Integer.parseInt(Articulo.codigo)+1;
		Fabricante.codigo=Integer.toString(cod);		
		this.CodFab=Fabricante.codigo;
		this.NomFab="";		
	}
	
	public Fabricante(String codFab, String nomFab) {		
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
