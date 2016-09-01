package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.enroll;
import model.status;

/**
 * Servlet implementation class enrolledservlet
 */
@WebServlet("/enrolledservlet")
public class enrolledservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enrolledservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		enroll e = new enroll();
		ArrayList<String[]> ti = e.save1();
		System.out.println(ti);
		System.out.println(ti);
		System.out.println(ti);
		request.setAttribute("details",ti );
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
	    status s = new status();
	    ArrayList<String[]> status = s.save();
	    request.setAttribute("status",status );
		request.getRequestDispatcher("programrequirement.jsp").forward(request, response);
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
