package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Event;
import model.resultinfo;

/**
 * Servlet implementation class resultinfoservlet
 */
@WebServlet("/resultinfoservlet")
public class resultinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public resultinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String identity = request.getParameter("identity");
String an = request.getParameter("a");
		resultinfo n = new resultinfo();
		n.setIdentity(identity);
		int a = n.delete();
		resultinfo k =  new resultinfo();
		ArrayList<String[]> t = k.save3();
	    
		System.out.println(t);
		request.setAttribute("res",t );
		request.getRequestDispatcher("resultinfo.jsp?identity="+an).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String newresult = request.getParameter("newresult");
		String stdid = request.getParameter("stdid");
		String p = request.getParameter("p");
		System.out.println(stdid);
		System.out.println(p);
		resultinfo n = new resultinfo();
		n.setNewresult(newresult);
		n.setStid(stdid);
		int a = n.update();
		resultinfo k =  new resultinfo();
		ArrayList<String[]> t = k.save3();
	    
		System.out.println(t);
		request.setAttribute("res",t );
		request.getRequestDispatcher("resultinfo.jsp?identity="+p).forward(request, response);
		
	}

}
