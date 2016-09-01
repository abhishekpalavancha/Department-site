package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.register;
import model.resource;

/**
 * Servlet implementation class profileinfoservlet
 */
@WebServlet("/profileinfoservlet")
public class profileinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public profileinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String year = request.getParameter("yearofjoining");
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		/*int n = Integer.parseInt(netid);*/
		register r = new register();
		
		r.setPassword(password);
		r.setFirstname(firstname);
		r.setLastname(lastname);
		
		r.setYear(year);
		int a = r.save2(net);
		response.sendRedirect("editprofileservlet");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
