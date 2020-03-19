package hulkshop.core;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
 * @author FelipheGomez
 */
public class Conectar {
	
	static String CONN_DRIVER = "jdbc:mysql";
	static String CONN_PORT = "3306";
	static String CONN_HOST = "181.129.103.142";
	static String DB_NAME = "kardex";
	static String DB_USER = "kardex";
	static String DB_PASS = "kardex2020";
	static String CONN_URL = CONN_DRIVER + ":" + CONN_PORT + "//" + CONN_HOST + "/" + DB_NAME;
	public boolean isValid = false;
	Connection conexion = null;
	Statement stmt = null;
	ResultSet rs = null;

    /**
     * Establecemos la conexión con la base de datos.
     */
    public void conexion() {
        try {
	    	try {
	    	    Class.forName("com.mysql.jdbc.Driver");
	    	    System.out.println("Driver registrado!");
	    	} catch (ClassNotFoundException e) {
	    		throw new IllegalStateException("No se ha encontrado el driver en el classpath!", e);
	    	}
			
			try {
		    	MysqlDataSource dataSource = new MysqlDataSource();
		    	// usuario y pass
		    	dataSource.setUser(DB_NAME);
		    	dataSource.setPassword(DB_PASS);
		    	// servidor y puerto (he puesto el 3306 que es el std, pero cambialo sino!)
		    	dataSource.setServerName(CONN_HOST);
		    	dataSource.setPort(3306);
		    	// base de datos creada
		    	dataSource.setDatabaseName(DB_NAME);
		    	// crear conexion a partir de los datos 
		    	conexion = dataSource.getConnection();
		    	stmt = conexion.createStatement();
				isValid = true;						
			} catch (SQLException e) {
				// System.out.println(e);
				throw new Exception("DB_ErrorConnecting");
			}finally{
					try {
						if(rs != null) rs.close();
						if(stmt != null) stmt.close();
						if(conexion != null) conexion.close();
						if(isValid == false) {
							throw new Exception("DB_Accessdenied");
						}
					} catch (SQLException e) {
						// e.printStackTrace();
						throw new Exception("DB_Error");
					}
			}
        } catch (Exception sqle) {
            System.out.println("Error: " + sqle);
        }
    }
     
    /**
     * Probando la conexión.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Conectar conexion = new Conectar();
    	conexion.conexion();
    	System.out.println((conexion.isValid == true) ? "Conexion OK" : "Conexion KO");
    }
}
