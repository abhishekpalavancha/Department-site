package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.jobs;
import model.viewcourses;
import model.viewjobs;

/**
 * Servlet implementation class jobsservlet
 */
@WebServlet("/jobsservlet")
public class jobsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jobsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String jobs = request.getParameter("jobs");
		//System.out.println(jobs);
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		jobs js =  new jobs();
		if(!net.equals("")){
		 js.setJobs(jobs);
		}
		int a = js.save(net);
		if(a !=0){
			viewjobs vc = new viewjobs();
			ArrayList<String[]> ti = vc.save();
			System.out.println(ti);
			request.setAttribute("k",ti );
			request.getRequestDispatcher("jobs.jsp").forward(request, response);
			request.getRequestDispatcher("jobinfo.jsp").forward(request, response);
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
