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
import model.viewcourses;

/**
 * Servlet implementation class infocoursservlet
 */
@WebServlet("/infocourseservlet")
public class infocourseservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public infocourseservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String courseid = request.getParameter("courseid");
		String officehours = request.getParameter("officehours");
		String tainfo =request.getParameter("tainfo");
		String syllabus = request.getParameter("syllabus");
		
		infocourse n = new infocourse();
		n.setOfficehours(officehours);
		n.setTainfo(tainfo);
		n.setSyllabus(syllabus);
		n.setCourseid(courseid);
		System.out.println(courseid);
		int a = n.save();
		response.sendRedirect("viewofficehoursservlet?identity="+courseid);
		/*if(a !=0){
			viewcourses vc = new viewcourses();
			ArrayList<String[]> ti = vc.save();
			request.setAttribute("k",ti );
			
			
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
			ArrayList<String[]> h = i.save1(courseid);
		request.setAttribute("details",h );
		System.out.println(a);
		request.getRequestDispatcher("infocourse.jsp?identity="+courseid).forward(request, response);
		*/
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
