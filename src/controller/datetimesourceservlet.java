package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.resource;

/**
 * Servlet implementation class datetimesourceservlet
 */
@WebServlet("/datetimesourceservlet")
public class datetimesourceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public datetimesourceservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String date = request.getParameter("date");
		String nos = request.getParameter("nos");
		
		resource rs = new resource();
		rs.setDate(date);
		rs.setNos(nos);
		ArrayList<String> a = rs.save3();
		System.out.println(nos);
		System.out.println(nos);
		System.out.println(nos);
		
		request.setAttribute("k",a );
		request.getRequestDispatcher("datetimeresource.jsp?identity="+nos+"&date="+date).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		String timeslot = request.getParameter("timeslot");
		String dt = request.getParameter("date");
		String nos = request.getParameter("nos");
		System.out.println(net);
		System.out.println(timeslot);
		System.out.println(dt);
		System.out.println(nos);
		resource rs = new resource();
		rs.setTimeslot(timeslot);
		rs.setNos(nos);
		rs.setDt(dt);
		rs.save4(net);
		response.sendRedirect("viewresourceservlet");
		
	}

}
