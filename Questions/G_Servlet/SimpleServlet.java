package Questions.G_Servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SimpleServlet extends HttpServlet {
    // Initialization: Called once when the servlet is first loaded
    public void init() throws ServletException {
        System.out.println("Servlet Initialized!");
    }

    // Service: Handles client requests (GET or POST)
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello, this is a simple servlet response!</h1>");
    }

    // Cleanup: Called once when the servlet is destroyed
    public void destroy() {
        System.out.println("Servlet Destroyed!");
    }
}
