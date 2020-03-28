package hulkshop.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import hulkshop.core.ModeloBase;

public class User extends ModeloBase {
	private int userid = 0;
	private String username = "guest";
	private String password = "*****";
	private String fullname = "Invitado";
		
	public String toString() {
		if(isValid()) {
			return "Usuario: ";
		}
		return null;
	}

	public boolean isValid() {
		return userid > 0 ? true : false;
	}

	public void setUserid(int userid) {
		this.userid = userid;		
	}
	
}
