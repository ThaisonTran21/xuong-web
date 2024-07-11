/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.NhanVien;
import java.util.ArrayList;
import java.sql.*;

public class NhanVienRepository {

    public ArrayList<NhanVien> getAllNhanVien() throws SQLException {
        ArrayList<NhanVien> lstNhanVien = new ArrayList<>();
        Connection cn = DBConnext.getConnection();
        String sql = "select Ma, Ten, Sdt, TrangThai\n"
                + "from NhanVien";

        try {
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMa(rs.getString("Ma"));
                nv.setTenNV(rs.getString("Ten"));
                nv.setSDT(rs.getString("Sdt"));
                nv.setTrangThai(rs.getBoolean("TrangThai"));
                lstNhanVien.add(nv);
            }
        } catch (Exception e) {
        }
        return lstNhanVien;
    }

    public Integer addNhanVien(NhanVien sv) throws SQLException {
        Integer row = null;
        Connection cn = DBConnext.getConnection();
        String sql = "insert into NhanVien(Ma, Ten, Sdt, TrangThai)\n"
                + "values (?,?,?,?)";
        try {
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ptsm.setString(1, sv.getMa());
            ptsm.setString(2, sv.getTenNV());
            ptsm.setString(3, sv.getSDT());
            ptsm.setBoolean(4, sv.isTrangThai());

            row = ptsm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }

    public Integer deleteNhanVien(String Ma) throws SQLException {
        Integer row = null;
        Connection cn = DBConnext.getConnection();
        String sql = "delete from NhanVien\n"
                + "where Ma=?";
        try {
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ptsm.setString(1, Ma);
            row = ptsm.executeUpdate();
        } catch (Exception e) {
        }
        return row;
    }
}
