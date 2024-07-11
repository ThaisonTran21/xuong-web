/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import Repository.NhanVienRepository;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author TRAN THAI SON
 */
public class NhanVienService {
    private NhanVienRepository nvRepository = new NhanVienRepository();
        public ArrayList<NhanVien> getAllNhanVien() throws SQLException{
            return nvRepository.getAllNhanVien();
        }
        
    public Integer deleteNhanVien(String Ma) throws SQLException{
        return nvRepository.deleteNhanVien(Ma);
    }
    
    public Integer addNhanVien(NhanVien nv) throws SQLException{
        return nvRepository.addNhanVien(nv);
    }
}
