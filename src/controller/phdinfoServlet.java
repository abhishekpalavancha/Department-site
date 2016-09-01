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
import model.phdinfo;
import model.viewcourses;

/**
 * Servlet implementation class phdinfoServlet
 */
@WebServlet("/phdinfoServlet")
public class phdinfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public phdinfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String phdid = request.getParameter("phdid");
		String semester = request.getParameter("semester");
		String otherinformation = request.getParameter("otherinformation");
		System.out.println(phdid);
		phdinfo n = new phdinfo();
		n.setPhdid(phdid);
		n.setSemester(semester);
		n.setOtherinformation(otherinformation);
		int a = n.save();
		if(a !=0){
			
			/*HttpSession ssn = request.getSession();
			String net="";
			net = (String) ssn.getAttribute("phdid");
			System.out.println(net);
			System.out.println(net);*/
	phdinfo v = new phdinfo();
		
			ArrayList<String[]> a1 = v.save1(phdid);
			
			request.setAttribute("k",a1 );
			request.getRequestDispatcher("phdinfo.jsp").forward(request, response);
		}
			
			
			/*String[] s = a1.get(0);
			String x = s[0];
			ArrayList<String[]> h = i.save1(x);
		request.setAttribute("details",h );
		System.out.println(a);
		request.getRequestDispatcher("phdinfo.jsp?identity="+phdid).forward(request, response);}*/
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
