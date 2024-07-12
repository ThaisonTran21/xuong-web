package com.example.helloworld_sd19201.lab1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "lab1", value = "/lab1")
public class lab1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("lab1/lab1.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double cd = Double.parseDouble(request.getParameter("cd"));
        double cr = Double.parseDouble(request.getParameter("cr"));
        double chuvi = (cd+cr)*2;
        double dientich = cd*cr;

        request.setAttribute("chuvi", chuvi);
        request.setAttribute("dientich", dientich);

        request.getRequestDispatcher("lab1/ket-qua.jsp").forward(request, response);
    }
}
