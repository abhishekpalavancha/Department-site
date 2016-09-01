package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Teach;
import model.enroll;

/**
 * Servlet implementation class enrollservlet
 */
@WebServlet("/enrollservlet")
public class enrollservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enrollservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String identity = request.getParameter("identity");
		HttpSession ssn = request.getSession();
		String net = (String) ssn.getAttribute("name");
		enroll t = new enroll();
		t.setIdentity(identity);
		t.setNet(net);
		int a = t.save();
		/*request.getRequestDispatcher("viewcoursesservlet").forward(request, response);*/
PrintWriter out=response.getWriter();
		
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);
		if(a==1){
			out.println("<script>alert(\"successfully enrolled for this course\");window.location.href=\"officehoursservlet2\";</script>");
			//request.setAttribute("a","successfully registered" );
			//response.sendRedirect("viewnameofexam2");
			//request.getRequestDispatcher("viewnameofexam2").forward(request, response);
			}
		else if(a==0){
			//request.setAttribute("a","Already registered" );
			out.println("<script>alert(\"you are Already enrolled\");window.location.href=\"officehoursservlet2\";</script>");
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
