package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.revature.beans.Employee;
import com.revature.dao.EmployeeDao;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmployeeDao ed = new EmployeeDao();
		Employee em = ed.getEmployeeByUsername(request.getParameter("usrnm"));
		if((em!=null)&&(request.getParameter("pswrd").equals(em.getPswrd()))){
			request.setAttribute("currentEm", em);
			//create session store data here, request is transient
			//assign username and id to that session, set attribute for that session
			HttpSession sess = request.getSession();
			sess.setAttribute("empid", em.getEmpid());
			sess.setAttribute("fname", em.getFname());
			sess.setAttribute("balance", em.getFunds());
			RequestDispatcher rd = request.getRequestDispatcher("account.html");
			rd.forward(request, response);
		}else{
			PrintWriter out = response.getWriter();
			out.println("<h3>Incorrect Login</h3>"
					+ "<br>"
					+ "<p>Please input a valid user.</p");
			out.println(
					"<hr>" +
					"<a href='index.html'>BACK</a>"
					);
		}
	}

}
 