package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.getRequestDispatcher("login.html").include(request, response);
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String passw = request.getParameter("passw");

        if (user.equals("szikora") && passw.equals("atilla")) out.print(user + "\n" + passw);
    }
}
