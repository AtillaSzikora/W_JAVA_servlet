package main;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("test");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("user");
        String passw = request.getParameter("passw");

        if (user.equals("szikora") && passw.equals("atilla")) {
            out.print("Welcome Mr. " + user + "!"); }
        else {
            request.getRequestDispatcher("login.html").include(request, response);
            out.print("Bad user or password!"); }
    }
}