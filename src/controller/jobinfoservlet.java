package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Event;
import model.jobs;
import model.phdinfo;

/**
 * Servlet implementation class jobinfoservlet
 */
@WebServlet("/jobinfoservlet")
public class jobinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jobinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String identity = request.getParameter("identity");
		
		jobs n = new jobs();
		n.setIdentity(identity);
		int a = n.delete();
		response.sendRedirect("Jobviewservlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String description = request.getParameter("description");
		String jobid = request.getParameter("jobid");
		System.out.println(jobid);
		System.out.println(jobid);
		System.out.println(jobid);
		jobs n = new jobs();
		n.setDescription(description);
		n.setJobid(jobid);
		int a = n.save1();
		response.sendRedirect("Jobviewservlet");
	}

}
