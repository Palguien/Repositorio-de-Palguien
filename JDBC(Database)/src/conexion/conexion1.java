package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

public class conexion1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@10.1.6.249:1521:xe";
			String username = "c##bdarticulos";
			String password = "bdarticulos";
			//String insert="INSERT INTO FABRICANTE VALUES ('0','pichamatojo')";
			ArrayList<Fabricante> listaFab = new ArrayList<Fabricante>();
			
			Connection conexion = DriverManager.getConnection(url, username, password);	
			Statement stmt = conexion.createStatement();
			
			//stmt.executeUpdate(insert);
			
			ResultSet rset = stmt.executeQuery("select * from fabricante");
			
			while(rset.next()) {
				//System.out.println(rset.getString(1)+" --- "+rset.getString(2));
				listaFab.add(new Fabricante(rset.getString(1),rset.getString(2)));
			}
			
			Collections.sort(listaFab);
			for (Fabricante fabricante : listaFab) {
				System.out.println(fabricante.toString());
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Valor inválido");
		}
		

	}

}
