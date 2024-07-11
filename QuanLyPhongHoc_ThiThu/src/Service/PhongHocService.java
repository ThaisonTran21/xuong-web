/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Service.*;
import Model.PhongHoc;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author TRAN THAI SON
 */
public class PhongHocService {
    private PhongHocRepository PHRepository = new PhongHocRepository();
    public ArrayList<PhongHoc> getAllPhongHoc() throws SQLException{
        return PHRepository.getAllPhongHoc();
    }
    
    public Integer addPhongHoc(PhongHoc ph) throws SQLException{
        return PHRepository.addPhongHoc(ph);
    }
    
    public Integer updatePhongHoc(PhongHoc ph) throws SQLException{
        return PHRepository.updatePhongHoc(ph);
    }
    
    public Integer deletePhongHoc(String maPhong) throws SQLException{
        return PHRepository.deletePhongHoc(maPhong);
    }
}
