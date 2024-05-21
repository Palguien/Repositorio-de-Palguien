package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion1 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "c##bdarticulo";
			String password = "bdarticulo";
			
			Connection conexion = DriverManager.getConnection(url, username, password);	
			Statement stmt = conexion.createStatement();
			
			ResultSet rset = stmt.executeQuery("select * from fabricante");
			while(rset.next()) {
				System.out.println(rset.getString(1)+" --- "+rset.getString(2));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
