package com.example.helloworld_sd19201.baitap.controller.GiangVien;

import com.example.helloworld_sd19201.baitap.entity.GiangVien;
import com.example.helloworld_sd19201.baitap.service.GiangVienService;
import com.example.helloworld_sd19201.buoi4.entity.SinhVien;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "GiangVienController", value = {
        "/giang-vien/hien-thi",
        "/giang-vien/view-add",
        "/giang-vien/view-update",
        "/giang-vien/delete",
        "/giang-vien/detail",
        "/giang-vien/add",
        "/giang-vien/update",
})
public class GiangVienController extends HttpServlet {
    GiangVienService gvs = new GiangVienService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")){
            hienThi(req, resp);
        }else if (uri.contains("view-add")){

        }else if (uri.contains("view-update")){

        }else if (uri.contains("delete")){

        }else if (uri.contains("detail")){
            viewDetail(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) {
        List<GiangVien> lstgv = gvg.getAll();
        req.setAttribute("danhSach", danhSach);
        req.getRequestDispatcher("/buoi4/hien-thi.jsp").forward(req, resp);
    }

    private void viewDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ma = req.getParameter("id");
        req.setAttribute("gv", gvs.getByMaGiangVien(ma));
        req.getRequestDispatcher("/baitap/detail.jsp").forward(req, resp);
    }


}
