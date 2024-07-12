package com.example.helloworld_sd19201.baitap.service;

import com.example.helloworld_sd19201.baitap.entity.GiangVien;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GiangVienService {
    List<GiangVien> lstgv = new ArrayList<>();

    public  GiangVienService(){
        lstgv.add(new GiangVien("GV001", "Nam Định", 25000, LocalDate.of(2001, 06, 21), true));
        lstgv.add(new GiangVien("GV002", "Hà Nam", 20000, LocalDate.of(2002, 05, 11), false));
        lstgv.add(new GiangVien("GV003", "Vĩnh Phúc", 15000, LocalDate.of(2000, 04, 31), true));
        lstgv.add(new GiangVien("GV004", "Hà Nội", 10000, LocalDate.of(2004, 03,10), false));
        lstgv.add(new GiangVien("GV005", "Hải Dương", 5000, LocalDate.of(2004, 02, 19), true));
    }

    public List<GiangVien> getAll(){
        return lstgv;
    }

    public GiangVien getByMaGiangVien(String maGiangVien){
        for (GiangVien gv: lstgv){
            if (gv.getMaGiangVien().equals(maGiangVien)){
                return gv;
            }
        }
        return null;
    }

    public void addGiangVien(GiangVien gv){
        lstgv.add(gv);
    }

    public void updateGiangVien(GiangVien gv){
        for (int i=0; i < lstgv.size(); i++){
            if (lstgv.get(i).getMaGiangVien().equals(gv.getMaGiangVien())){
                lstgv.set(i, gv);
            }
        }
    }

    public void deleteGiangVien(String maGiangVien){
        List<GiangVien> temp = new ArrayList<>();
        for (GiangVien gv: lstgv){
            if (gv.getMaGiangVien().equals(maGiangVien)){
                temp.add(gv);
            }
        }
        lstgv.removeAll(temp);
    }

}
