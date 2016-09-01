package controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Discussion;
import model.Discussionfeed;

/**
 * Servlet implementation class SearchdiscussionServlet
 */
@WebServlet("/SearchdiscussionServlet")
public class SearchdiscussionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchdiscussionServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       String lm = request.getParameter("search");	
	    Discussion q = new Discussion(); 
	    int b=q.verify(lm);
	    if(b>0){//if hash is in db
	    	Discussionfeed bbb = new Discussionfeed(); //db through mod
	       
	    	request.setAttribute("doc",lm);
	    	Map xyz = bbb.fed(lm);
	    	request.setAttribute("dc",xyz);
	    	javax.servlet.RequestDispatcher ab = request.getRequestDispatcher("viewdiscussion.jsp");
	    	ab.forward(request, response);
	    	 
	    }
	    else { 
	    	request.setAttribute("msg","Sorry this  does not exist");
	    	javax.servlet.RequestDispatcher bh = request.getRequestDispatcher("search.jsp");
	    	bh.forward(request, response);
	    }
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		doGet(request, response);
	}

}
