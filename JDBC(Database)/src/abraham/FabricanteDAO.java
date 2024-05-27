package abraham;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FabricanteDAO {

	private static Connection conectar() {
		Connection con=null;		
		String usr="c##JDBC_prueba1", pass="prueba1";
		String url="jdbc:oracle:thin:@10.1.2.243:1521:xe";
		
        try {
            con = DriverManager.getConnection(url, usr, pass);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }
	
	
	 public static void create(Fabricante fabricante) {
	        if (fabricante != null) {
	            Connection conexion = conectar();
	            String sql = "INSERT INTO Fabricante "
	                    + "VALUES ( ?,    ?)";
	            try {
	                PreparedStatement sentencia = conexion.prepareStatement(sql);
	                sentencia.setString(1, fabricante.getCodFab());
	                sentencia.setString(2, fabricante.getNomFab());                
	                sentencia.executeUpdate();
	                conexion.close(); 
	            } catch (SQLException ex) {
	                System.out.println("Error al insertar en fabricante");
	            }
	        }
	    }
	 
	 
	 public static Fabricante read(String codFab) {
		 Fabricante fabricante = null;
	        String sql = "SELECT *"
	                + "FROM Fabricante "
	                + "WHERE CodFab = ?";
	        try {
	            Connection conexion = conectar();
	            PreparedStatement sentencia = conexion.prepareStatement(sql);
	            sentencia.setString(1, codFab); 

	            ResultSet rs = sentencia.executeQuery();

	            if (rs.next()) { 
	            	
	                String nomFab = rs.getString("NomFab");                

	                fabricante = new Fabricante(codFab, nomFab);
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	            System.out.println("Error al consultar un fabricante.");
	        }

	        return fabricante; 
	    }
	 
	 
	 public static void update(Fabricante fabricante) {
	        if (fabricante != null) {
	            String sql = "UPDATE Fabricante "
	                    + "SET NomFab=?"
	                    + "WHERE CodFab = ?";
	            try {
	                Connection conexion = conectar();
	                PreparedStatement sentencia = conexion.prepareStatement(sql);

	                sentencia.setString(1, fabricante.getCodFab());

	                sentencia.executeUpdate();
	                conexion.close();
	            } catch (SQLException ex) {
	                System.out.println("Error al actualizar un fabricante.");
	            }
	        }
	    }
	 
	 
	   public static void delete(String codFab) {
	        String sql = "DELETE FROM Fabricante "
	                + "WHERE CodFab = ?";
	        try {
	            Connection conexion = conectar();
	            PreparedStatement sentencia = conexion.prepareStatement(sql);

	            sentencia.setString(1, codFab); 

	            sentencia.executeUpdate();
	            conexion.close();
	        } catch (SQLException ex) {
	            System.out.println("Error al eliminar un fabricante.");
	        }
	    }
}
