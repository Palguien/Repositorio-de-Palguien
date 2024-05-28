package ej2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dialogs.Dialogs;

/**
 * 2.	Diseñar una aplicación que muestre un informe de los alumnos, según sus notas: todos los alumnos cuya nota es Bien (entre 6 y 7)
 *  y todos los alumnos cuya nota es Notable (entre 7 y 9). Cada informe debe ordenarse por la nota de forma ascendente. Debes usar una 
 *  consulta con parámetros y reutilizarla.
 *  
 * @author junior
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe", usr = "c##alumnos", psw = "alumnos";
		try {
			Connection conex=DriverManager.getConnection(url,usr,psw);
			String sql="select * from Alumnos where (media > ? and media < ?) order by media asc";
			PreparedStatement ps = conex.prepareStatement(sql);
			ps.setInt(1, 6);
			ps.setInt(2, 7);
			ResultSet rs = ps.executeQuery();
			System.out.println("BIENES");
			while(rs.next()) {
				System.out.println("Nombre:"+rs.getString("Nombre")+", Nota: "+rs.getString("Media"));
			}
			
			ps = conex.prepareStatement(sql);
			ps.setInt(1, 7);
			ps.setInt(2, 9);
			rs = ps.executeQuery();
			System.out.println("NOTABLES");
			while(rs.next()) {
				System.out.println("Nombre:"+rs.getString("Nombre")+", Nota: "+rs.getString("Media"));
			}
			conex.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
