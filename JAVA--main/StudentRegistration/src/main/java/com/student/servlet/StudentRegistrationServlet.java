package com.student.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class StudentRegistrationServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Course: " + course);

        response.setContentType("text/html");

        response.getWriter().println(
            "<h2>Registration Successful!</h2>"
        );

        response.getWriter().println(
            "<p>Name: " + name + "</p>"
        );

        response.getWriter().println(
            "<p>Email: " + email + "</p>"
        );

        response.getWriter().println(
            "<p>Course: " + course + "</p>"
        );
    }
}