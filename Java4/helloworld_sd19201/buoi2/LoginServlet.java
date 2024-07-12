package com.example.helloworld_sd19201.buoi2;

import com.example.helloworld_sd19201.HelloServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("buoi2/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //lấy giá trị usr và pwd từ trong form
        String usr = request.getParameter("usr");
        String pwd = request.getParameter("pwd");

        //Truyền giá trị usr và pwd sang một trang jsp mới
        request.setAttribute("usr", usr);
        request.setAttribute("pwd", pwd);

        //Trả về trang jsp kết quả
        request.getRequestDispatcher("buoi2/ket-qua.jsp").forward(request, response);

    }
}
