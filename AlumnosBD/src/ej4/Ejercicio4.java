package ej4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import ej3.Alumno;

/**
 * 4.	Obtener los alumnos de la bd y meterlos en una lista. Ordenar la lista por nombre y mostrarla. Ordenar por número y mostrarla.
 * @author junior
 *
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@localhost:1521:xe",usr = "c##alumnos", psw = "alumnos";
		ArrayList<Alumno> listado = new ArrayList<Alumno>();
		
		try {
			Connection con = DriverManager.getConnection(url, usr, psw);
			String sql=("select * from Alumnos");
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			while(rset.next()) {
				listado.add(new Alumno(rset.getInt(1), rset.getString(2),rset.getDouble(4), rset.getString(5)));
			}
			Collections.sort(listado);
			for (Alumno alumno : listado) {
				System.out.println(alumno.toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("terminamos");

	}

}
