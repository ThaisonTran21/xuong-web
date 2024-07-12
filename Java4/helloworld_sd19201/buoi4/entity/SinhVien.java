package com.example.helloworld_sd19201.buoi4.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private String maSinhVien;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;

}
