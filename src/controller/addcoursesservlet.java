package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.addcourses;
import model.viewcourses;

/**
 * Servlet implementation class addcoursesservlet
 */
@WebServlet("/addcoursesservlet")
public class addcoursesservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addcoursesservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String netid = request.getParameter("netid");
		String courseid = request.getParameter("courseid");
		String coursename =request.getParameter("coursename");
		HttpSession ssn = request.getSession();
		String net = (String) ssn.getAttribute("name");
		addcourses ad = new addcourses();
		ad.setCourseid(courseid);
		ad.setCoursename(coursename);
		int a = ad.save(net);
		if(a !=0){
			viewcourses vc = new viewcourses();
			ArrayList<String[]> ti = vc.save();
			request.setAttribute("k",ti );
			request.getRequestDispatcher("viewcourses.jsp").forward(request, response);
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
