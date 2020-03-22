package hulkshop.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import hulkshop.core.CrudApiHandler;
import hulkshop.core.HttpServletBase;
import hulkshop.core.MysqlConn;
import hulkshop.models.User;

/**
 * Servlet implementation class TestAPI
 */
@WebServlet("/TestAPI")
public class TestAPI extends HttpServletBase {
	
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestAPI() {
        super();
		try {
	    	conn = new MysqlConn();
	    	if(conn == null) { throw new Exception("No hay conexion a la DB."); }
		} catch (Exception e) {
			System.out.println("TestAPI Error: ");
			System.out.println(e);
		}
    }
    
	
	@Override
	public void destroy() {
	// TODO Auto-generated method stub
	}
	
	public void init(FilterConfig arg0) throws ServletException {
	// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		HttpSession session = request.getSession(false);
		PrintWriter out = response.getWriter();
		User model = new User(conn);
		
		try {
	        if(session != null && session.getAttribute("username") != null){
				out.print("Usuario: ");
	        	/*
		    	User Me = new User();
		    	Me.getById((int)session.getAttribute("userid"));
		    	*/
	        } else {
	            
	        }
		} catch(Exception e) {
			out.print("Error: ");
			out.println(e);
		}

        // response.setContentType("application/json");
        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
