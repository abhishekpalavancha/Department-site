package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.resource;
import model.signup;

/**
 * Servlet implementation class signupservlet
 */
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String examid = request.getParameter("examid");
		String id = request.getParameter("id");
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		signup rs = new signup();
		rs.setId(id);
		PrintWriter out=response.getWriter();
		rs.setExamid(examid);
		int a = rs.sign(net);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		if(a==1){
			out.println("<script>alert(\"successfully registered\");window.location.href=\"viewnameofexam2\";</script>");
			//request.setAttribute("a","successfully registered" );
			//response.sendRedirect("viewnameofexam2");
			//request.getRequestDispatcher("viewnameofexam2").forward(request, response);
			}
		else if(a==0){
			//request.setAttribute("a","Already registered" );
			out.println("<script>alert(\"Already registered\");window.location.href=\"viewnameofexam2\";</script>");
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
