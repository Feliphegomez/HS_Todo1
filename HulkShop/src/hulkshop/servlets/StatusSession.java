package hulkshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import hulkshop.core.HttpServletBase;
import hulkshop.core.MysqlConn;
import hulkshop.models.User;

/**
 * Servlet implementation class StatusSession
 */
@WebServlet("/StatusSession")
public class StatusSession extends HttpServletBase {
	User model;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatusSession() {
        super();
		try {
	    	conn = new MysqlConn();
	    	if(conn == null) { throw new Exception("No hay conexion a la DB."); }
		} catch (Exception e) {
			System.out.println("TestAPI Error: ");
			System.out.println(e);
		}
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();

		try {
	    	conn = new MysqlConn();
	    	if(conn == null) { throw new Exception("No hay conexion a la DB."); }
	    	else {
	    		System.out.println("Conexion OK: ");


    			ResultSet rs = conn.stmt.executeQuery("select * from users WHERE id=" + 2);
    			while (rs.next()) {
    				out.println(rs.getInt(1));
    				// model.setUserid(rs.getInt(1));
    				/*
    				this.userid = ;
    				this.username = rs.getString(2);
    				this.password = rs.getString(3);
    				this.fullname = rs.getString(4);*/
    			}
    			conn.stmt.close();
	    	}
		} catch (Exception e) {
			System.out.println("TestAPI Error: ");
			System.out.println(e);
		}
		
		
		try {
	        if(session != null && session.getAttribute("username") != null){
	        	out.println("USER");
	        	/*
		    	User Me = new User();
		    	Me.getById((int)session.getAttribute("userid"));
		    	*/
	        } else {
	            // request.getRequestDispatcher("jsp/login.jsp").include(request, response);
	        	out.println("INVITADO");
	        	
	        	try {  
	    			Class.forName("com.mysql.jdbc.Driver");			
	    			Connection adapter = DriverManager.getConnection("jdbc:mysql://181.129.103.142:3306/kardex","kardex","kardex2020");
	    			Statement stmt = adapter.createStatement();

			    	if(conn == adapter) { throw new Exception("No hay conexion a la DB."); }

	    			ResultSet rs = stmt.executeQuery("select * from users WHERE id=" + 2);
	    			while (rs.next()) {
	    				model.setUserid(rs.getInt(1));
	    				/*
	    				this.userid = ;
	    				this.username = rs.getString(2);
	    				this.password = rs.getString(3);
	    				this.fullname = rs.getString(4);*/
	    			}
	    			stmt.close();
	    		} catch (Exception e){
	    			System.out.println(e);
	    		}  
	        	
	        }

	        
	        /*
	        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
	        GsonBuilder builder = new GsonBuilder(); 
	        builder.setPrettyPrinting(); 
	        Gson gson = builder.create(); 
	        User userGson = gson.fromJson(jsonString, User.class); 
	        out.println("userGson");
	        out.println(userGson);*/
	   
	        
		} catch(Exception e) {
			out.println(e);
            //request.getRequestDispatcher("login.jsp").include(request, response);  
		} finally {

	        out.println(model);
	        // response.setContentType("application/json");
	        out.close();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}