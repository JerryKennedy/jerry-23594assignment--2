package com.assignment;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/signup")
public class SignUpServlet extends HttpServlet {
	String email, password;

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        email = req.getParameter("Email");
        password = req.getParameter("password");

        if (email != null && password != null) {
            res.sendRedirect("Login.html");
        } else {
           System.out.println("Please Fill in Everything!");
        }
    }
}
