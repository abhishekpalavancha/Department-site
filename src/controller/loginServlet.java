package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.login;

/**
 * Servlet implementation class login
 */
@WebServlet("/loginservlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String netid = request.getParameter("netid");
		String password = request.getParameter("password");
		
		login lll = new login();
		lll.setNetid(netid);
		lll.setPassword(password);
		String k = lll.save();
		if(k.equals("not")){
			
			/*HttpSession ssn = request.getSession();
			ssn.setAttribute("role", "student");
			ssn.setAttribute("name", netid);*/
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		}
		else{
			if(k.equals("faculty")){
			HttpSession ssn = request.getSession();
			ssn.setAttribute("role", "faculty");
			ssn.setAttribute("name", netid);
			request.getRequestDispatcher("home.jsp").forward(request, response);
			}else{
				HttpSession ssn = request.getSession();
				ssn.setAttribute("role", "student");
				ssn.setAttribute("name", netid);
				request.getRequestDispatcher("home2.jsp").forward(request, response);
			}
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
