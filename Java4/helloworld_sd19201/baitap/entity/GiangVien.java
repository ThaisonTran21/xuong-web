package com.example.helloworld_sd19201.baitap.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Locale;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GiangVien {
    private String maGiangVien;
    private String diaChi;
    private float luong;
    private LocalDate ngaySinh;
    private boolean gioiTinh;
}
