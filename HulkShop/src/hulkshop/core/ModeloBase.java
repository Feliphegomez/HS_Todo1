package hulkshop.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModeloBase {
	protected Connection adapter;
	protected Statement stmt;
	
	public ModeloBase(){
		try {  
			Class.forName("com.mysql.jdbc.Driver");			
			adapter = DriverManager.getConnection("jdbc:mysql://181.129.103.142:3306/kardex","kardex","kardex2020");
			stmt = adapter.createStatement();
		} catch (Exception e){
			System.out.println(e);
		}  
	}
}
