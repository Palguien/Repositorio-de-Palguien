package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import dialogs.Dialogs;

public class conexion2_sentParametrizadas {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "c##bdarticulo";
			String password = "bdarticulo";
			//String insert="INSERT INTO FABRICANTE VALUES ('0','pichamatojo')";
			ArrayList<Fabricante> listaFab = new ArrayList<Fabricante>();
			
			Connection conexion = DriverManager.getConnection(url, username, password);	
			
			//Statement stmt = conexion.createStatement();
			//stmt.executeUpdate(insert);
			//stmt.executeUpdate("delete from articulo where codart='0000000001' ");
			//ResultSet rset = stmt.executeQuery("select * from articulo");

			
			//sentencias parametrizadas (pedir un tipo de dato concreto, para evitar que rompan la BD)
			PreparedStatement pstmt = conexion.prepareStatement("select * from articulo where (codArt = ? or codArt = ? or nomArt=?)");
//			pstmt.setInt(1, 8);
			int id=Dialogs.askIntDialog("give me the code");
			pstmt.setInt(1, id);
			pstmt.setInt(2, 4);
			pstmt.setString(3, "tablet");
			ResultSet rset = pstmt.executeQuery();
			
			while(rset.next()) {
				System.out.println(rset.getString(1)+" --- "+rset.getString(2));
				//listaFab.add(new Fabricante(rset.getString(1),rset.getString(2)));
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
