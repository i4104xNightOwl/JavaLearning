package Lession5.Shape;

import Lession5.Utils.ToaDo;

import java.util.Scanner;

public class Circle {
    final float PI = 3.14f;
    float r;
    float cv;
    float dt;

    ToaDo toaDo;

    public void nhapBanKinh() {
        System.out.println("Hay nhap ban kinh hinh tron: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }

    public void tinhChuVi() {
        cv = PI * r * r;
    }

    public void inChuVi() {
        System.out.println("Chu vi tron: " + cv);
    }

    public void tinhDienTich() {
        dt = 2 * PI * r * r;
    }

    public void inDienTich() {
        System.out.println("Dien tich: " + dt);
    }

    public float getBanKinh() {
        return cv;
    }

    public boolean vongTronLon() {
        if (r > 10) return true;
        return false;
    }

    public ToaDo getToaDo() {
        return toaDo;
    }

    public void setToaDo(int x, int y) {
        this.toaDo = new ToaDo();
        this.toaDo.x = x;
        this.toaDo.y = y;
    }

    public void xuatBanKinh() {
        System.out.println("Ban kinh hinh tron: " + r);
    }

    public void xuatToaDo() {
        System.out.println("Toa do: ");
        System.out.println("X: " + this.toaDo.x);
        System.out.println("Y: " + this.toaDo.y);
    }
}
