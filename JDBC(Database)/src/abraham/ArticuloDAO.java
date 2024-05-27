package abraham;
import java.sql.*;

public class ArticuloDAO {
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

    public static void create(Articulo articulo) {
        if (articulo != null) {
            Connection conexion = conectar();
            String sql = "INSERT INTO Articulo "
                    + "VALUES ( ?,    ?,     ?,     ?)";
            try {
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                sentencia.setString(1, articulo.getCodArt());
                sentencia.setString(2, articulo.getNomArt());                
                sentencia.setDouble(3, articulo.getPrecio());
                sentencia.setString(4, articulo.getCodFab());
                sentencia.executeUpdate();
                conexion.close(); 
            } catch (SQLException ex) {
                System.out.println("Error al insertar.");
            }
        }
    }

    public static Articulo read(String codArt) {
        Articulo articulo = null;
        String sql = "SELECT *"
                + "FROM Articulo "
                + "WHERE CodArt = ?";
        try {
            Connection conexion = conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setString(1, codArt); 

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) { 
                String nomArt = rs.getString("NomArt");                
                Double precio = rs.getDouble("Precio");
                String codFab = rs.getString("CodFab");

                articulo = new Articulo(codArt, nomArt, precio, codFab);
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un articulo.");
        }

        return articulo; 
    }

    public static void update(Articulo articulo) {
        if (articulo != null) {
            String sql = "UPDATE Articulo "
                    + "SET NomArt=?, Precio=?, CodFab=? "
                    + "WHERE CodArt = ?";
            try {
                Connection conexion = conectar();
                PreparedStatement sentencia = conexion.prepareStatement(sql);

                sentencia.setString(1, articulo.getNomArt());
                sentencia.setDouble(2, articulo.getPrecio());                
                sentencia.setString(3, articulo.getCodFab());
                sentencia.setString(4, articulo.getCodArt()); 

                sentencia.executeUpdate();
                conexion.close();
            } catch (SQLException ex) {
                System.out.println("Error al actualizar un alumno.");
            }
        }
    }

    public static void delete(String codArt) {
        String sql = "DELETE FROM Articulo "
                + "WHERE CodArt = ?";
        try {
            Connection conexion = conectar();
            PreparedStatement sentencia = conexion.prepareStatement(sql);

            sentencia.setString(1, codArt); 

            sentencia.executeUpdate();
            conexion.close();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un articulo.");
        }
    }
}
