package abraham;

import dialogos.Dialogos;

public class AppArticulos {

	public static void main(String[] args) {
				
		String [] opciones = {"Altas", "Bajas", "Modificaciones", "Consultas", "Salir"};
		
		int opcion=-1;		
		while (opcion<4) {	
			opcion=Dialogos.pedirOpcion("Elige opcion", "AppArticulos", opciones);
			switch (opcion) {
				case 0:
					inserArt();
					break;
				case 1:
					delArt();
					break;
				case 2:
					modifArt();
					break;
				case 3:
					consulArt();					
					break;
				case 4:
					Dialogos.mensajeInfo("FIN ", "AppArticulos"); 
					opcion=5; break;
				default:
					opcion = 5; break;
			}			
		}			
	}

	public static void inserArt() {
		Articulo articulo;
		String codArt,nomArt,codFab;
		Double precio;
		codArt=Dialogos.pedirCadena("Codigo de articulo: ");
		nomArt=Dialogos.pedirCadena("Nombre de articulo: ");
		precio=Dialogos.pedirDouble("Precio: ");
		codFab=Dialogos.pedirCadena("Codigo de fabricante: ");
		articulo=new Articulo(codArt,nomArt,precio,codFab);
		ArticuloDAO.create(articulo);
	}
	
	public static void delArt() {
		String codArt;				
		codArt=Dialogos.pedirCadena("Codigo de articulo: ");				
		ArticuloDAO.delete(codArt);
	}
	
	public static void modifArt() {
		Articulo articulo;
		String codArt,nomArt,codFab;
		Double precio;
		codArt=Dialogos.pedirCadena("Codigo de articulo: ");
		articulo=ArticuloDAO.read(codArt);
		Dialogos.mensajeInfo("Los datos actuales son: "+articulo.toString(),"AppArticulos");
		
		nomArt=Dialogos.pedirCadena("Nombre de articculo: ");
		precio=Dialogos.pedirDouble("Precio: ");
		codFab=Dialogos.pedirCadena("Codigo de fabricante: ");
		articulo=new Articulo(codArt,nomArt,precio,codFab);
		ArticuloDAO.update(articulo);
	}
	
	public static void consulArt() {
		String codArt;
		Articulo articulo;		
		codArt=Dialogos.pedirCadena("Introduce codigo de articulo");
		articulo=ArticuloDAO.read(codArt);
		Dialogos.mensajeInfo(articulo.toString(),"AppArtculos");
	}

}
