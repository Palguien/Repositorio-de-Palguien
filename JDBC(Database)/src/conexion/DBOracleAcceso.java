package conexion;
import java.sql.*;

public class DBOracleAcceso {
	public static void main(String[] args){
		//consulta 1
		try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","c##bdarticulo","bdarticulo");
	         Statement stmt = conexion.createStatement();
	 	     ResultSet rset =stmt.executeQuery("select * from fabricante");
	 	    System.out.println("CodFab "+" NomFab");
	 	    while (rset.next()) {
	 	        System.out.print(rset.getString(1));   // Print col 1
	 	        //System.out.print(" "+rset.getString("NomFab"));
	 	       System.out.print(" "+rset.getString(2));
	 	       System.out.println();
	 	    }	 	    
	 	    stmt.close();
	     }catch (SQLException | ClassNotFoundException ex) {
	        System.out.println("Error en la conexión de la base de datos");
	     }
		
		//consulta 2
		try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         Connection  conexion = DriverManager.getConnection("jdbc:oracle:thin:@10.1.6.30:1521:xe","c##bdarticulo","bdarticulo");
	         Statement stmt = conexion.createStatement();
	         String consulta2="SELECT A.*,F.NomFab FROM ARTICULO A JOIN FABRICANTE F ON A.CodFab=F.CodFab";
	 	     ResultSet rset =stmt.executeQuery(consulta2);
	 	     System.out.println("CodArt "+" NomArt"+"  Precio "+" NomFab ");
	 	     while (rset.next()) {
	 	        System.out.print(rset.getString(1));   // Print col 1	 	        
	 	        System.out.print(" "+rset.getString(2));
	 	        System.out.print(" "+rset.getDouble(3));
	 	        System.out.print(" "+rset.getString(5));
	 	        System.out.println();
	 	    }	 	    
	 	    stmt.close();
	     }catch (SQLException | ClassNotFoundException ex) {
	        System.out.println("Error en la conexión de la base de datos");
	     }
		
		
		
		
	}
}
