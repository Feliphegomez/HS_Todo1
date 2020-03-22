package hulkshop.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public abstract class HttpServletBase extends HttpServlet {
	HttpSession session = null;
	protected MysqlConn conn;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpServletBase() {
        super();
    }

    public boolean isGuest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(false);
        
        if(session != null && session.getAttribute("username") != null){
        	return false;
        }
        
        return true;
    }
    
    public void setSession(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		PrintWriter out;
		try {
			out = response.getWriter();
			if(session != null && session.getAttribute("username") != null){
	            out.println("session: <br />\n");
	    		out.println(session);
	    		System.out.println(session);
	        }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
            System.out.println(e);
		}
    }
}
