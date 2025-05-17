package Lesson11_12.Exam_C4;

import Lesson11_12.Exam_C4.Object.SinhVien;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Map<String, SinhVien> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            SinhVien sv = new SinhVien();
            sv.init(scanner);
            map.put(sv.svId, sv);
        }

        System.out.println("---");
        System.out.print("Nhap lop: ");
        String lop = scanner.nextLine();

        for (SinhVien sv : map.values()) if (sv.grade.equals(lop)) sv.show();

        System.out.println("---");
        System.out.print("Nhap ma sinh vien: ");
        String svId = scanner.nextLine();
        map.get(svId).show();
    }
}
