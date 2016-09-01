package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Event;
import model.viewevent;
import model.viewjobs;

/**
 * Servlet implementation class eventServlet
 */
@WebServlet("/eventServlet")
public class eventServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public eventServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String event = request.getParameter("event");
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		Event ev = new Event();
		if(!net.equals("")){
			 ev.setEvent(event);
			}
		int a = ev.save(net);
		if(a !=0){
			viewevent vc = new viewevent();
			ArrayList<String[]> ti = vc.save();
			
			request.setAttribute("k",ti );
			request.getRequestDispatcher("event.jsp").forward(request, response);
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
