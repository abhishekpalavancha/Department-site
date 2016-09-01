package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.infocourse;
import model.officehours;

/**
 * Servlet implementation class viewofficehours
 */
@WebServlet("/viewofficehoursservlet")
public class viewofficehours extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public viewofficehours() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String identity = request.getParameter("identity");
		
		infocourse v = new infocourse();
		ArrayList<String[]> ti = v.save1(identity);
		System.out.println(ti);
		request.setAttribute("details",ti );
		request.getRequestDispatcher("infocourse.jsp?identity="+identity).forward(request, response);
		
		/*String al = request.getParameter("identity");
	   HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		System.out.println(net);
		System.out.println(net);
		System.out.println(net);
officehours v = new officehours();
		
		ArrayList<String[]> a1 = v.save(net);
		infocourse i = new infocourse();
		String[] s = a1.get(0);
		String x = s[0];
		ArrayList<String[]> h = i.save1(al);
	request.setAttribute("details",h );
	System.out.println(al);
	request.getRequestDispatcher("infocourse.jsp?identity="+al).forward(request, response);*/
	
		//request.getRequestDispatcher("viewcourses.jsp").forward(request, response);
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
