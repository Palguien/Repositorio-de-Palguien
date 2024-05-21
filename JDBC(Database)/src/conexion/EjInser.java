package conexion;

import java.sql.*;


public class EjInser {

	public static void main(String[] args) {
		Connection  conexion;
		Statement sentencia;
		String sql;
		String url="jdbc:oracle:thin:@10.1.6.30:1521:xe";
		int numInser=0;
		try {
			conexion=DriverManager.getConnection(url,"c##bdarticulo","bdarticulo");
			sentencia=conexion.createStatement();
			sql="INSERT INTO FABRICANTE VALUES ('0000000018','Trust')";
			numInser=sentencia.executeUpdate(sql);
			System.out.println("Inserciones: "+numInser);
		}catch (SQLException ex) {
			System.out.println("Error en la conexión de la base de datos");
		}	

	}

}
