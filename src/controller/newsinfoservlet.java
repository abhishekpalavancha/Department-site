package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.jobs;
import model.news;

/**
 * Servlet implementation class newsinfoservlet
 */
@WebServlet("/newsinfoservlet")
public class newsinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newsinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String identity = request.getParameter("identity");
		
		news n = new news();
		n.setIdentity(identity);
		int a = n.delete();
		response.sendRedirect("viewnewsservlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String description = request.getParameter("description");
		String newsid = request.getParameter("newsid");
		System.out.println(newsid);
		System.out.println(newsid);
		System.out.println(newsid);
		news n = new news();
		n.setDescription(description);
		n.setNewsid(newsid);
		int a = n.save1();
		response.sendRedirect("viewnewsservlet");
	}

}
