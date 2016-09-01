package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.news;
import model.viewjobs;
import model.viewnews;

/**
 * Servlet implementation class newsservlet
 */
@WebServlet("/newsservlet")
public class newsservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newsservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String news = request.getParameter("news");
		HttpSession ssn = request.getSession();
		String net="";
		net = (String) ssn.getAttribute("name");
		news nw = new news();
		if(!net.equals("")){
			 nw.setNews(news);
			}
			int a = nw.save(net);
			if(a !=0){
				viewnews vc = new viewnews();
				ArrayList<String[]> ti = vc.save();
				System.out.println(ti);
				request.setAttribute("k",ti );
				request.getRequestDispatcher("news.jsp").forward(request, response);
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
