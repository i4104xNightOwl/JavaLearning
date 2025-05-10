package Lesson7.Shape;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc {
    public float dai, rong;

    public HinhChuNhat() {
        super();
        this.ten = "Chu nhat";
    }

    public void NhapChieuDai() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        this.dai = sc.nextFloat();
    }

    public void NhapChieuRong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu rong: ");
        this.rong = sc.nextFloat();
    }

    public void TinhChuVi() { this.chuVi = (this.dai + this.rong) * 2; }
    public void TinhDienTich() { this.dienTich = this.dai * this.rong; }
}
