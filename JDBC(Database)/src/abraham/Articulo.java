package abraham;

public class Articulo {
	static String codigo="0000000000";
	private String CodArt;
	private String NomArt;
	private double precio;
	private String CodFab;
	
	public Articulo() {
		int cod;
		cod=Integer.parseInt(Articulo.codigo)+1;
		Articulo.codigo=Integer.toString(cod);
		System.out.println("codigo: "+Articulo.codigo);
		this.CodArt=Articulo.codigo;
		this.NomArt="";
		this.precio=0.0;
		this.CodFab="";
	}	
	

	public Articulo(String codArt, String nomArt, double precio, String codFab) {		
		CodArt = codArt;
		NomArt = nomArt;
		this.precio = precio;
		CodFab = codFab;
	}


	public String getCodFab() {
		return CodArt;
	}

	public void setCodFab(String codFab) {
		CodArt = codFab;
	}	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getCodArt() {
		return CodArt;
	}

	public void setCodArt(String codArt) {
		CodArt = codArt;
	}

	public String getNomArt() {
		return NomArt;
	}

	public void setNomArt(String nomArt) {
		NomArt = nomArt;
	}


	@Override
	public String toString() {
		return "Articulo [CodArt=" + CodArt + ", NomArt=" + NomArt + ", precio=" + precio + ", CodFab=" + CodFab + "]";
	}

	
	
}
