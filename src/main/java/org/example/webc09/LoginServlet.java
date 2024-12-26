package org.example.webc09;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//dinh nghia 1 request phia server
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {

    public LoginServlet() {
        System.out.println("Created LoginServlet");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy");
    }

    //    method get
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + " " + password);
        PrintWriter writer = resp.getWriter();
//      hien thi giao dien: yeu
//      JSP
        writer.println("<html>");
//        if ("admin".equals(username) && "admin".equals(password)) {
            writer.println("<h1>Welcome " + username + " to website</h1>");
//        } else {
//            writer.println("<h1>Login Error</h1>");
//        }
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username + " " + password);
        System.out.println("Login post day");
    }
}
