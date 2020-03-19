package hulkshop.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "Login", urlPatterns = "/Login")

public class Login extends HttpServlet {
	
	public String messageError = ""; 
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		// request.getRequestDispatcher("jsp/link.jsp").include(request, response);

		String messageError = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		if(password.equals("admin123")){
			out.print("Welcome, "+username);
			HttpSession session=request.getSession();
			session.setAttribute("username",username);
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else{
			out.print("Lo sentimos, error de nombre de usuario o contraseña.\r\n");
			messageError = "Mensaje #1";
			request.getRequestDispatcher("login.jsp").include(request, response);
		}
		out.close();
	}

}
