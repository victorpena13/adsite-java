package com.spring.adsite.servlets;


import com.spring.adsite.DAO.DaoFactory;
import com.spring.adsite.models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/user/create.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad ad = new Ad (
                1,
                request.getParameter("title"),
                request.getParameter("description")
        );
        try {
            DaoFactory.getAdsDao().insert(ad);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        response.sendRedirect("/");
    }
}
