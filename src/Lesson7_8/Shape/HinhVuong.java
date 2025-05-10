package Lesson7_8.Shape;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong() {
        super();
        this.ten = "Hinh Vuong";
    }

    public void NhapCanh() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh hinh vuong: ");
        this.dai = this.rong = sc.nextFloat();
    }
}
