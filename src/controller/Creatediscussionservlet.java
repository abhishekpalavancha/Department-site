package controller;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Discussion;

/**
 * Servlet implementation class CreateServlet
 */
@WebServlet("/Creatediscussionservlet")
public class Creatediscussionservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String RequestDispatcher = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Creatediscussionservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter print=response.getWriter(); 
		String a = request.getParameter("hash");
		Pattern p = Pattern.compile("[^a-z0-9]", 
		Pattern.CASE_INSENSITIVE);
	      Matcher m = p.matcher(a);
	 
	      int count = 0;
	      while (m.find()) {
	         count = count+1;
	         
	      }
	      
	      if(count>0)
	      {
	    	  request.setAttribute("msg", "Do not insert special charachters");
				javax.servlet.RequestDispatcher rd= request.getRequestDispatcher("creatediscussion.jsp");
				rd.forward(request, response);
	      }else{
		
		
		
		
		
		
	    Discussion q = new Discussion(); 
	    int b=q.storehash(a);  // stored value of a value goes to storehash
	    
	    if(b>0){ 
	    	javax.servlet.RequestDispatcher lm = request.getRequestDispatcher("listservlet");// after creation this executes
	    	lm.forward(request, response);
	    	 
	    }
	    
	    else { 
	    	request.setAttribute("msg","The topic already exist, please choose a different name");
	    	javax.servlet.RequestDispatcher lm = request.getRequestDispatcher("creatediscussion.jsp");
	    	lm.forward(request, response);
	    }
}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
