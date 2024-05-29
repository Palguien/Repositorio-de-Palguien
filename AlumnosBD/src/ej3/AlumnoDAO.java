package ej3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dialogs.Dialogs;


public class AlumnoDAO {
	public static Connection conectar() {
		Connection con=null;		
		String usr="c##alumnos", pass="alumnos";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
        try {
            con = DriverManager.getConnection(url, usr, pass);
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }
        return con;
    }
	
	 public static void create(Alumno alumno) {
	        if (alumno != null) {
	            Connection conexion = conectar();
	            String sql = "INSERT INTO Alumnos "
	                    + "VALUES ( ?,    ?,NULL, ?, ?)";
	            try {
	                PreparedStatement sentencia = conexion.prepareStatement(sql);
	                sentencia.setInt(1, alumno.getNum());
	                sentencia.setString(2, alumno.getNombre());
	                sentencia.setDouble(3, alumno.getMedia());
	                sentencia.setString(4, alumno.getCurso()); 
	                sentencia.executeUpdate();
	                conexion.close(); 
	            } catch (SQLException ex) {
	                System.out.println("Error al insertar en alumno");
	            }
	        }
	    }
	 
	 public static Alumno read(int id) {
		 Alumno alumno = null;
	        String sql = "SELECT *"
	                + "FROM Alumnos "
	                + "WHERE CodFab = ?";
	        try {
	            Connection conexion = conectar();
	            PreparedStatement sentencia = conexion.prepareStatement(sql);
	            sentencia.setInt(1, id); 

	            ResultSet rs = sentencia.executeQuery();

	            if (rs.next()) { 
	            	
	                String nom = rs.getString("nom");
	                double media = rs.getDouble("media"); 
	                String curso = rs.getString("curso"); 

	                alumno = new Alumno(id, nom,media,curso);
	                conexion.close();
	            }
	        } catch (SQLException ex) {
	            System.out.println("Error al consultar un alumno.");
	        }

	        return alumno; 
	    }
	 
	 public static void update(Alumno alumno) {
	        if (alumno != null) {
	            String sql = "UPDATE Alumnos "
	                    + "SET Media=?"
	                    + "WHERE num = ?";
	            try {
	                Connection conexion = conectar();
	                PreparedStatement sentencia = conexion.prepareStatement(sql);

	                double newMedia= Dialogs.askFloatDialog("Nueva media");
	                sentencia.setDouble(1, newMedia);
	                sentencia.setInt(2, alumno.getNum());

	                sentencia.executeUpdate();
	                conexion.close();
	            } catch (SQLException ex) {
	                System.out.println("Error al actualizar un alumno.");
	            }
	        }
	    }
	 
	 
	 public static void delete(int id) {
	        String sql = "DELETE FROM Alumnos "
	                + "WHERE num = ?";
	        try {
	            Connection conexion = conectar();
	            PreparedStatement sentencia = conexion.prepareStatement(sql);

	            sentencia.setInt(1, id); 

	            sentencia.executeUpdate();
	            conexion.close();
	        } catch (SQLException ex) {
	            System.out.println("Error al eliminar un alumno.");
	        }
	    }
	 
	 
}
