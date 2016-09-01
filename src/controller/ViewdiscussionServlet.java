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
 * Servlet implementation class ViewdiscussionServlet
 */
@WebServlet("/ViewdiscussionServlet")
public class ViewdiscussionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewdiscussionServlet() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String button = request.getParameter("submit");//to get data from view page
		Discussionfeed q = new Discussionfeed(); //model Discussionfeed 
	    
		if(button.equals("post")){
		String lm = request.getParameter("name");	 //name of tag	
	    String fq = request.getParameter("bring");	
	    q.has(fq,lm,0);
	    Map xyz = q.fed(fq);
    	request.setAttribute("dc",xyz);
    	request.setAttribute("doc",fq);
    	javax.servlet.RequestDispatcher ab = request.getRequestDispatcher("viewdiscussion.jsp");
    	ab.forward(request, response);

		}else{
			String sq = request.getParameter("rpt");
			String sp = request.getParameter("bring");
			String sl = request.getParameter("bid");
			q.has(sp,sq,Integer.parseInt(sl));
			Map xyz = q.fed(sp);
	    	request.setAttribute("dc",xyz);
	    	request.setAttribute("doc",sp);
	    	javax.servlet.RequestDispatcher ab = request.getRequestDispatcher("viewdiscussion.jsp");
	    	ab.forward(request, response);
			
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
