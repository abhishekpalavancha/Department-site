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

/**
 * Servlet implementation class Detailsofcoursservlet
 */
@WebServlet("/Detailsofcoursservlet")
public class Detailsofcoursservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Detailsofcoursservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
officehours vc = new officehours();
		
		ArrayList<String[]> a = vc.save(net);
		infocourse i = new infocourse();
		String[] s = a.get(0);
		String x = s[0];
		ArrayList<String[]> h = i.save1(x);
	request.setAttribute("details",h );
	System.out.println(a);
	request.getRequestDispatcher("infocourse.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
