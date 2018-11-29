package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Thomas sandbox code provided by
 * https://www.youtube.com/watch?v=_Y_YdllgJCM
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String _username = request.getParameter("username");
            String _password = request.getParameter("password");

            if (_username != null && _password != null) {

                if (_username.equalsIgnoreCase("Bob") && _password.equals("Password")) {

                    response.sendRedirect("Welcome.html");
                } else {
                    out.println("Invalid username or password");
                }

            } else {

                out.println("Username or Password cannot be blank");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
