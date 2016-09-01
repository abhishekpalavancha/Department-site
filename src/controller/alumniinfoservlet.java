package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.alumniinfo;
import model.phdinfo;

/**
 * Servlet implementation class alumniinfoservlet
 */
@WebServlet("/alumniinfoservlet")
public class alumniinfoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public alumniinfoservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String alumniid = request.getParameter("alumniid");
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		System.out.println(alumniid);
		alumniinfo n = new alumniinfo();
		n.setAlumniid(alumniid);
		n.setName(name);
		n.setDescription(description);
		
		int a = n.save();
		response.sendRedirect("viewalumnistudent");
		/*if(a !=0){
			
			HttpSession ssn = request.getSession();
			String net="";
			net = (String) ssn.getAttribute("phdid");
			System.out.println(net);
			System.out.println(net);
			alumniinfo v = new alumniinfo();
		
			ArrayList<String[]> a1 = v.save1(phdid);
			
			request.setAttribute("k",a1 );*/
		/*response.sendRedirect("alumnistudent.jsp");*/
			//request.getRequestDispatcher("phdinfo.jsp").forward(request, response);
		}

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		alumniinfo n = new alumniinfo();
		
		n.setName(name);
		n.setDescription(description);
		
		int a = n.save1();
		response.sendRedirect("viewalumnistudent");
		
	}

}
