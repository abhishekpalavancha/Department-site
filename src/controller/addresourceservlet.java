package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.addcourses;
import model.resource;
import model.viewcourses;

/**
 * Servlet implementation class addresourceservlet
 */
@WebServlet("/addresourceservlet")
public class addresourceservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addresourceservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nameofresource = request.getParameter("nameofresource");
		String typeofresource = request.getParameter("typeofresource");
		String otherdetails = request.getParameter("otherdetails");
		resource rs = new resource();
		rs.setNameofresource(nameofresource);
		rs.setTypeofresource(typeofresource);
		rs.setOtherdetails(otherdetails);
		int a = rs.save();
		resource vc = new resource();
		ArrayList<String[]> ti = vc.save1();
		request.setAttribute("k",ti );
		request.getRequestDispatcher("addnewresource.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
