package com.example.helloworld_sd19201.buoi4.controller;

import com.example.helloworld_sd19201.buoi4.entity.SinhVien;
import com.example.helloworld_sd19201.buoi4.service.SinhVienService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

@WebServlet(name = "SinhVienController", value = {
        "/sinh-vien/hien-thi", //Get
        "/sinh-vien/view-add", //Get
        "/sinh-vien/view-update", //Get
        "/sinh-vien/delete", //Get
        "/sinh-vien/detail", //Get
        "/sinh-vien/add", //Post
        "/sinh-vien/update" //Post
})
public class SinhVienController<SinhVienServices> extends HttpServlet {
    SinhVienService svService = new SinhVienService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi")){
            hienThi(req, resp);
        }else if (uri.contains("view-add")){
            viewAdd(req, resp);
        }else if (uri.contains("view-update")){
            viewUpdate(req, resp);
        }else if (uri.contains("delete")){
            deleteSinhVien(req, resp);
        }else if (uri.contains("detail")){
            viewDetail(req, resp);
        }
    }

    private void viewDetail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ma = req.getParameter("id");
        req.setAttribute("sv", svService.getByMaSinhVien(ma));
        req.getRequestDispatcher("/buoi4/detail.jsp").forward(req, resp);
    }

    private void viewAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/buoi4/add.jsp").forward(req, resp);
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String ma = req.getParameter("id");
        req.setAttribute("sv", svService.getByMaSinhVien(ma));
        req.getRequestDispatcher("/buoi4/edit.jsp").forward(req, resp);
    }

    private void deleteSinhVien(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String ma = req.getParameter("id");
        svService.deleteSinhVien(ma);
        resp.sendRedirect("/sinh-vien/hien-thi");
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<SinhVien> danhSach = svService.getAll();
        req.setAttribute("danhSach", danhSach);
        req.getRequestDispatcher("/buoi4/hien-thi.jsp").forward(req, resp);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")){
            addSinhVien(req, resp);
        }else if (uri.contains("update")){
            updateSinhVien(req, resp);
        }
    }

    private void addSinhVien(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException, InvocationTargetException, IllegalAccessException {
        SinhVien sv = new SinhVien();
        BeanUtils.populate(sv, req.getParameterMap());
        svService.addSinhVien(sv);
        resp.sendRedirect("/sinh-vien/hien-thi");
    }

    private void updateSinhVien(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException, InvocationTargetException, IllegalAccessException {
        SinhVien sv = new SinhVien();
        BeanUtils.populate(sv, req.getParameterMap());
        svService.updateSinhVien(sv);
        resp.sendRedirect("/sinh-vien/hien-thi");
    }
}
