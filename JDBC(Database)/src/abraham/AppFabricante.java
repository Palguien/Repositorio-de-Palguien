package abraham;

import dialogos.Dialogos;

public class AppFabricante {

	public static void main(String[] args) {		
		String [] opciones = {"Altas", "Bajas", "Modificaciones", "Consultas", "Salir"};
		int opcion=-1;		
		while (opcion<4) {	
			opcion= Dialogos.pedirOpcion("Elige", "AppFabricante", opciones);
			switch (opcion) {
				case 0:
					inserFab();
					break;
				case 1:
					delFab();
					break;
				case 2:
					modifFab();
					break;
				case 3:
					consulFab();					
					break;
				case 4:
					Dialogos.mensajeInfo("Fin");
					opcion=5; break;
				default:
					opcion = 5; break;
			}			
		}			
	}
 
	public static void inserFab() {
		Fabricante fab;
		String nomFab,codFab;
		codFab=Dialogos.pedirCadena("C�digo de fabricante: ");
		nomFab=Dialogos.pedirCadena("Nombre de fabricante: ");
		fab=new Fabricante(codFab,nomFab);
		FabricanteDAO.create(fab);
	}
	
	public static void delFab() {
		String codFab;				
		codFab=Dialogos.pedirCadena("C�digo de fabricante: ");			
		FabricanteDAO.delete(codFab);
	}
	
	public static void modifFab() {
		Fabricante fab;
		String codFab,nomFab;
		codFab=Dialogos.pedirCadena("C�digo de art�culo: ");
		fab=FabricanteDAO.read(codFab);
		Dialogos.mensajeInfo("Los datos actuales son: "+fab.toString());
		
		nomFab=Dialogos.pedirCadena("Nombre de art�culo: ");
		codFab=Dialogos.pedirCadena("C�digo de fabricante: ");
		fab=new Fabricante(codFab,nomFab);
		FabricanteDAO.update(fab);
	}
	
	public static void consulFab() {
		String codFab;
		Fabricante fab;		
		codFab=Dialogos.pedirCadena("Introduce c�digo de fabricante");
		fab=FabricanteDAO.read(codFab);
		Dialogos.mensajeInfo(fab.toString());
	}
}
