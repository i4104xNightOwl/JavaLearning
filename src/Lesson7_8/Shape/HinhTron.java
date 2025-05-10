package Lesson7_8.Shape;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
    public float banKinh;

    public HinhTron() {
        super();
        this.ten = "Hinh Tron";
    }

    public void NhapBanKinh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }

    public void TinhChuVi() { this.chuVi = 2 * PI * banKinh; }
    public void TinhDienTich() { this.dienTich = PI * banKinh * banKinh; }
}