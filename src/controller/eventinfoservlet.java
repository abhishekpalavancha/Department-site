package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Event;
import model.jobs;

/**
 * Servlet implementation class eventinfoservlet
 */
@WebServlet("/eventinfoservlet")
public class eventinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eventinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String identity = request.getParameter("identity");
		
		Event n = new Event();
		n.setIdentity(identity);
		int a = n.delete();
		response.sendRedirect("eventviewservlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String description = request.getParameter("description");
		String eventid = request.getParameter("eventid");
		System.out.println(eventid);
		System.out.println(eventid);
		System.out.println(eventid);
		Event n = new Event();
		n.setDescription(description);
		n.setEventid(eventid);
		int a = n.save1();
		response.sendRedirect("eventviewservlet");
	}

}
