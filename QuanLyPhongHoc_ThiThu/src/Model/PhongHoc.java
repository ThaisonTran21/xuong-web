/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TRAN THAI SON
 */
public class PhongHoc {
    private String maPhong;
    private String tenPhong;
    private int tang;
    private int soSV;
    private boolean trangThai;

    public PhongHoc() {
    }

    public PhongHoc(String maPhong, String tenPhong, int tang, int soSV, boolean trangThai) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.tang = tang;
        this.soSV = soSV;
        this.trangThai = trangThai;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public int getSoSV() {
        return soSV;
    }

    public void setSoSV(int soSV) {
        this.soSV = soSV;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "PhongHoc{" + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", tang=" + tang + ", soSV=" + soSV + ", trangThai=" + trangThai + '}';
    }

   
}
