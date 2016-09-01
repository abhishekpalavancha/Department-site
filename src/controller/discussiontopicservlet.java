/*package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.discussion;

*//**
 * Servlet implementation class discussiontopicservlet
 *//*
@WebServlet("/discussiontopicservlet")
public class discussiontopicservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    *//**
     * @see HttpServlet#HttpServlet()
     *//*
    public discussiontopicservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	*//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String discusionnumber = request.getParameter("discusionnumber");
		String comment = request.getParameter("comment");
		discussion rs = new discussion();
		rs.setDiscusionnumber(discusionnumber);
		rs.setComment(comment);
		int a = rs.save3();
		request.getRequestDispatcher("viewdiscussionservlet").forward(request, response);
		discussion qs = new discussion();
		qs.setDiscusionnumber(discusionnumber);
		ArrayList<String[]> ti = qs.question();
		System.out.println(ti);
		System.out.println(ti);
		request.setAttribute("k",ti );
		request.getRequestDispatcher("discussion.jsp?identity="+discusionnumber).forward(request, response);
	}

	*//**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 *//*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
*/