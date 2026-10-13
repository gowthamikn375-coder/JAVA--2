package com.student.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request,
                           HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String course = request.getParameter("course");

        String errorMessage = null;

        // Name validation
        if (name == null || name.trim().isEmpty()) {

            errorMessage = "Student name cannot be empty.";

        }

        // Email validation
        else if (email == null || email.trim().isEmpty()) {

            errorMessage = "Email ID cannot be empty.";

        }

        else if (!email.matches(
                "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {

            errorMessage = "Please enter a valid email ID.";

        }

        // Course validation
        else if (course == null || course.trim().isEmpty()) {

            errorMessage = "Please select a course.";

        }

        // If there is an error
        if (errorMessage != null) {

            request.setAttribute("error", errorMessage);

            request.getRequestDispatcher("result.jsp")
                   .forward(request, response);

        }

        // If registration is successful
        else {

            request.setAttribute("name", name);
            request.setAttribute("email", email);
            request.setAttribute("course", course);

            request.getRequestDispatcher("result.jsp")
                   .forward(request, response);
        }
    }
}