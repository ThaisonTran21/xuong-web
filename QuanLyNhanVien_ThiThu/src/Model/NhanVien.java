/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TRAN THAI SON
 */
public class NhanVien {
    private String ma;
    private String tenNV;
    private String SDT;
    private boolean trangThai;

    public NhanVien() {
    }

    public NhanVien(String ma, String tenNV, String SDT, boolean trangThai) {
        this.ma = ma;
        this.tenNV = tenNV;
        this.SDT = SDT;
        this.trangThai = trangThai;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "ma=" + ma + ", tenNV=" + tenNV + ", SDT=" + SDT + ", trangThai=" + trangThai + '}';
    }
    
    
}
