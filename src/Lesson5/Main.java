package Lesson5;

import Lesson5.Shape.Circle;
import Lesson5.Utils.ToaDo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle hinhtron = new Circle();
        hinhtron.nhapBanKinh();

        if (hinhtron.vongTronLon()) {
            System.out.println("Hinh tron co ban kinh: " + hinhtron.getBanKinh());
            return;
        }

        ToaDo toaDo = new ToaDo();
        System.out.print("Toa do X: ");
        sc.nextInt();
        System.out.print("Toa do Y: ");
        sc.nextInt();

        hinhtron.setToaDo(toaDo.x, toaDo.y);

        hinhtron.tinhChuVi();
        hinhtron.tinhDienTich();

        hinhtron.inChuVi();
        hinhtron.inDienTich();

        hinhtron.xuatToaDo();

    }
}
