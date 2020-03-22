package hulkshop.core;
import java.sql.*;

public class MysqlConn {
	public Connection adapter;
	public Statement stmt;
	public ResultSet rs;
	
	public void main() {
		try {  
			Class.forName("com.mysql.jdbc.Driver");			
			adapter = DriverManager.getConnection("jdbc:mysql://181.129.103.142:3306/kardex","kardex","kardex2020");
			stmt = adapter.createStatement();
		} catch (Exception e){
			System.out.println(e);
		}  
	}
	
	public ResultSet getSQL(String sql){
		try {
			ResultSet rs   = stmt.executeQuery(sql);
			adapter.close();  
			return rs;
		} catch (Exception e){
			System.out.println(e);
			return null;
		}  
	}
}