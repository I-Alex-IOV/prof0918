package com.vertex.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        System.out.println("Username: " + username + " Password: " + password);

        req.getSession().setAttribute("username", username);

        String nextJSP = username.contains("admin") ? "/adminResults.jsp" : "/mudResults.jsp";
        forwardTo(nextJSP, req, resp);
    }

    private void forwardTo(String nextJsp, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJsp);
        dispatcher.forward(req, resp);
    }
}
