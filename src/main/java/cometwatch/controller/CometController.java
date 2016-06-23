package cometwatch.controller;

import cometwatch.dao.CometDAO;
import cometwatch.model.Comet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/comets")
public class CometController extends HttpServlet {


    // Add
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    // Get list
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    // Edit
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int cometID = Integer.parseInt(req.getParameter("id"));
        if (cometID < 1) {
            throw new ServletException("Esqueceu de colocar o id válido: " + cometID);
        }
        Comet comet = null;
        try {
            comet = CometDAO.find(cometID);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
        req.setAttribute("comet", comet);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

}
