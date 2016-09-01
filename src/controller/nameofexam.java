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
import model.exam;
import model.news;
import model.viewevent;
import model.viewexam;
import model.viewnews;

/**
 * Servlet implementation class nameofexam
 */
@WebServlet("/nameofexam")
public class nameofexam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public nameofexam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameofexam = request.getParameter("nameofexam");
		String dateofexam = request.getParameter("dateofexam");
		String optionallinks = request.getParameter("optionallinks");
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		exam ex = new exam();
		ex.setNameofexam(nameofexam);
		ex.setDateofexam(dateofexam);
		ex.setOptionallinks(optionallinks);
		int a = ex.save(net);
		
		if(a !=0){
			viewexam vc = new viewexam();
			ArrayList<String[]> ti = vc.save();
			
			request.setAttribute("k",ti );
			request.getRequestDispatcher("addnewexam.jsp").forward(request, response);
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
