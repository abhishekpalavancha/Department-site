package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.alumniinfo;
import model.jobs;
import model.result;
import model.resultinfo;
import model.viewjobs;

/**
 * Servlet implementation class postresultservlet
 */
@WebServlet("/postresultservlet")
public class postresultservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public postresultservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String studentid = request.getParameter("studentid");
		String result = request.getParameter("result");
		String noe = request.getParameter("nameofexam");
		System.out.println(noe);
		//System.out.println(jobs);
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		resultinfo ri =  new resultinfo();
		if(!net.equals("")){
		 ri.setStudentid(studentid);
		 ri.setResult(result);
		 ri.setNoe(noe);
		}
		if(studentid!=null && result!=null){
		int a = ri.save2(net);
		}
		resultinfo k =  new resultinfo();
		ArrayList<String[]> t = k.save3();
	    
		System.out.println(t);
		request.setAttribute("res",t );
		request.getRequestDispatcher("resultinfo.jsp?identity="+noe).forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nameofexam = request.getParameter("nameofexam");
		
		resultinfo n = new resultinfo();
		n.setNameofexam(nameofexam);
		try {
			n.save();
			response.sendRedirect("viewexamservlet");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
