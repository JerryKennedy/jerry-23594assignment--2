package com.assignment;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	 public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	        String username = req.getParameter("name");
	        String password = req.getParameter("password");

	        if ("Jerry Kennedy".equals(username) && "player2".equals(password)) {
	            try {
	            	HttpSession session = req.getSession(true);
	            	session.setAttribute("name", username);
	                res.sendRedirect("StudentAdmin.html");
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } else {            
	            res.sendRedirect("ForgotP.html"); 
	        }
	    }
}
