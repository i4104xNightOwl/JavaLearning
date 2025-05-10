package Lesson7.Shape;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        super();
        this.ten = "Hinh Tru";
    }

    public void NhapChieuCao() {
        super.NhapBanKinh();

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Chieu Cao: ");
        this.chieuCao = sc.nextFloat();
    }

    public void TinhTheTich() {
        this.TinhDienTich();
        this.theTich = this.dienTich * this.chieuCao;
    }
}
