package ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dialogs.Dialogs;

/**
 * 1.Escribir un programa que muestre todos los alumnos de un curso cuya nota es mayor que cierta nota de corte. 
 * Tanto el curso como la nota de corte serán introducidos por el usuario.
 * 
 * @author pablo
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe", usr = "c##alumnos", psw = "alumnos";
		try {
			Connection conex=DriverManager.getConnection(url,usr,psw);
			String sql="select * from Alumnos where media > ?";
			PreparedStatement ps = conex.prepareStatement(sql);
			int notaCorte = Dialogs.askIntDialog("Nota de Corte?");
			ps.setInt(1, notaCorte);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("Nombre:"+rs.getString("Nombre")+", Nota de Corte: "+rs.getString("Media"));
			}
			conex.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
