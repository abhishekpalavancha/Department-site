package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.register;
import model.registerinfo;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String netid = request.getParameter("netid");
		String password =request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String emailid = request.getParameter("emailid");
		String role = request.getParameter("role");
		String year = request.getParameter("year");
		String program = request.getParameter("program");
		System.out.println(netid);
		System.out.println(password);
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(role);
		System.out.println(year);
		System.out.println(program);
		register r = new  register();
		r.setNetid(netid);
		r.setPassword(password);
		r.setFirstname(firstname);
		r.setLastname(lastname);
		r.setEmail(emailid);
		r.setRole(role);
		r.setYear(year);
		r.setProgram(program);
		int a = r.save();
		if(a !=0){
			registerinfo ri = new registerinfo();
			ArrayList<String[]> n= ri.save();
			request.setAttribute("res",n );
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else{
			request.setAttribute("message","Sorry Cannot be register");
			request.getRequestDispatcher("register.jsp").forward(request, response);
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
