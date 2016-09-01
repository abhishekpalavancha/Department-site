package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.addcourses;
import model.applyjob;

/**
 * Servlet implementation class applyjobservlet
 */
@WebServlet("/applyjobservlet")
public class applyjobservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public applyjobservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		String student = request.getParameter("student");
		applyjob ad = new applyjob();
		ad.setStudent(student);
		int a = ad.apply(net);
		
		PrintWriter out=response.getWriter();
		
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		if(a==1){
			out.println("<script>alert(\"successfully applied for this job\");window.location.href=\"Jobviewservlet\";</script>");
			//request.setAttribute("a","successfully registered" );
			//response.sendRedirect("viewnameofexam2");
			//request.getRequestDispatcher("viewnameofexam2").forward(request, response);
			}
		else if(a==0){
			//request.setAttribute("a","Already registered" );
			out.println("<script>alert(\"Already applied\");window.location.href=\"Jobviewservlet\";</script>");
			//response.sendRedirect("viewnameofexam2");
			//request.getRequestDispatcher("viewnameofexam2").forward(request, response);
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
