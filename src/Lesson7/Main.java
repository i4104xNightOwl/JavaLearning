package Lesson7;

import Lesson7.Shape.HinhChuNhat;
import Lesson7.Shape.HinhTron;
import Lesson7.Shape.HinhTru;
import Lesson7.Shape.HinhVuong;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        HinhTru hinhTru = new HinhTru();
        HinhVuong hinhVuong = new HinhVuong();
        HinhTron hinhTron = new HinhTron();

        hinhChuNhat.NhapChieuDai();
        hinhChuNhat.NhapChieuRong();
        hinhChuNhat.TinhChuVi();
        hinhChuNhat.TinhDienTich();

        hinhChuNhat.inChuvi();
        hinhChuNhat.inDienTich();
        hinhChuNhat.inTheTich();

    }
}
