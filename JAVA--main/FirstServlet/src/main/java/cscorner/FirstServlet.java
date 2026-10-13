package cscorner;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor
     */
    public FirstServlet() {
        super();
    }

    /**
     * Handles GET request
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<head>");
        pw.println("<title>Kavya</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<h1>First Servlet!</h1>");
        pw.println("<h2>Servlet is working successfully.</h2>");
        pw.println("</body>");
        pw.println("</html>");

        pw.close();
    }

    /**
     * Handles POST request
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doGet(request, response);
    }
}