package com.example.helloworld_sd19201.buoi3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Locale;

@WebServlet (name = "CrudServlet", value = {
        "/crud/trang-chu",
        "/crud/them",
        "/crud/chi-tiet",
        "/crud/xoa"
})
public class CrudServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("trang-chu")) {
            this.trangChu(request, response);
        }else if (uri.contains("xoa")){
            System.out.println("Ban dang xoa");
        }
    }

    private void trangChu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/buoi3/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usr = request.getParameter("usr");
        String quocGia = request.getParameter("quocGia");
        String gioiTinh = request.getParameter("gioiTinh");
        boolean docThan = request.getParameter("docThan") != null;

        request.setAttribute("usr", usr);
        request.setAttribute("quocGia", quocGia);
        request.setAttribute("gioiTinh", gioiTinh);
        request.setAttribute("docThan", docThan);

        request.getRequestDispatcher("/buoi3/ket-qua.jsp").forward(request, response);
    }
}
