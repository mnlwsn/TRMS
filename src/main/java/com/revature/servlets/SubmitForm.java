package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.revature.log.LogUtil.log;


import com.revature.beans.Event;
import com.revature.dao.EventDao;

/**
 * Servlet implementation class SubmitForm
 */
public class SubmitForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		SimpleDateFormat sdfdate = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm a"); 
		String stDt = request.getParameter("startDate");
		String stTt = request.getParameter("startTime");
		EventDao ed = new EventDao();
		Event ev = null;
		Timestamp cal = null;
		Timestamp strt = null;
	
		
		try {
			cal = new Timestamp(sdfdate.parse(stDt).getTime());
			strt = new Timestamp(sdftime.parse(stTt).getTime());
			
		} catch (ParseException e1) {
			log.info("cannot parse time");
			e1.printStackTrace();
		}
		
		try {
			ev = new Event(
					(Integer)sess.getAttribute("empid"),
					request.getParameter("type"),
					request.getParameter("location"),
					request.getParameter("description"),
					Double.parseDouble(request.getParameter("cost")),
					cal,
					strt,
					request.getParameter("justification"),
					request.getParameter("gradeFormat"),
					request.getParameter("gradeCutOff")
					);
		} catch (NumberFormatException el) {
			log.info("failed to create new event obj, bc of date formatting");
			el.printStackTrace();
		}
		
        ed.insertEvent(ev);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		SimpleDateFormat sdfdate = new SimpleDateFormat("MM/dd/yy");
		SimpleDateFormat sdftime = new SimpleDateFormat("HH:mm a"); 
		String stDt = request.getParameter("startDate");
		String stTt = request.getParameter("startTime");
		EventDao ed = new EventDao();
		Event ev = null;
		Timestamp cal = null;
		Timestamp strt = null;
	
		
		try {
			cal = new Timestamp(sdfdate.parse(stDt).getTime());
			strt = new Timestamp(sdftime.parse(stTt).getTime());
			
		} catch (ParseException e1) {
			log.info("cannot parse time");
			e1.printStackTrace();
		}
		
		try {
			ev = new Event(
					(Integer)sess.getAttribute("empid"),
					request.getParameter("type"),
					request.getParameter("location"),
					request.getParameter("description"),
					Double.parseDouble(request.getParameter("cost")),
					cal,
					strt,
					request.getParameter("justification"),
					request.getParameter("gradeFormat"),
					request.getParameter("gradeCutOff")
					);
		} catch (NumberFormatException el) {
			log.info("failed to create new event obj, bc of date formatting");
			el.printStackTrace();
		}
		
        ed.insertEvent(ev);
        RequestDispatcher rd = request.getRequestDispatcher("confirmation.html");
		rd.forward(request, response);
       

	}

}
