/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.PhongHoc;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author TRAN THAI SON
 */
public class PhongHocRepository {

    public ArrayList<PhongHoc> getAllPhongHoc() throws SQLException {
        ArrayList<PhongHoc> lstPH = new ArrayList<>();
        Connection cn = DBConnext.getConnection();
        String sql = "select maPhong,TenPhong,tang,soSV,TrangThai\n"
                + "from PhongHoc";

        try {
            Statement stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                PhongHoc ph = new PhongHoc();
                ph.setMaPhong(rs.getString("maPhong"));
                ph.setTenPhong(rs.getString("TenPhong"));
                ph.setTang(rs.getInt("tang"));
                ph.setSoSV(rs.getInt("soSV"));
                ph.setTrangThai(rs.getBoolean("TrangThai"));
                lstPH.add(ph);
            }
        } catch (Exception e) {
        }
        return lstPH;
    }

    public Integer addPhongHoc(PhongHoc ph) throws SQLException {
        Integer row = null;
        Connection cn = DBConnext.getConnection();
        String sql = "insert into PhongHoc( TenPhong,tang,soSV,TrangThai)\n"
                + "values(?,?,?,?)";
        try {

            PreparedStatement prsm = cn.prepareStatement(sql);
            //prsm.setString(1, ph.getMaPhong());
            prsm.setString(1, ph.getTenPhong());
            prsm.setInt(2, ph.getTang());
            prsm.setInt(3, ph.getSoSV());
            prsm.setBoolean(4, ph.isTrangThai());
            row = prsm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row;
    }

    public Integer updatePhongHoc(PhongHoc ph) throws SQLException {
        Integer row = null;
        Connection cn = DBConnext.getConnection();
        String sql = "update PhongHoc \n"
                + "set TenPhong=?, tang=?, soSV=?, TrangThai=?\n"
                + "where maPhong=?";
        try {

            PreparedStatement prsm = cn.prepareStatement(sql);
            prsm.setString(5, ph.getMaPhong());
            prsm.setString(1, ph.getTenPhong());
            prsm.setInt(2, ph.getTang());
            prsm.setInt(3, ph.getSoSV());
            prsm.setBoolean(4, ph.isTrangThai());
            row = prsm.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return row;
    }

    public Integer deletePhongHoc(String maPhong) throws SQLException {
        Integer row = null;
        Connection cn = DBConnext.getConnection();
        String sql = "delete from PhongHoc\n"
                + "where maPhong=?";

        try {
            PreparedStatement ptsm = cn.prepareStatement(sql);
            ptsm.setString(1, maPhong);
            row = ptsm.executeUpdate();
        } catch (Exception e) {
        }
        return row;
    }
}
