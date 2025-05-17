package Lesson11_12.Exam_C4;

import java.util.ArrayList;
import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao so thi " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }

        System.out.println("===================");
        list.sort(null);
        int max = list.get(list.size() - 1);
        System.out.println("So lon nhat: " + max);

        System.out.println("===================");
        System.out.print("Nhap so can xoa: ");
        int x = scanner.nextInt();

        ArrayList<Integer> filter = new ArrayList<>();
        for (int item : list) if (item != x) filter.add(item);

        filter.sort((o1, o2) -> o2 - o1);
        System.out.println(filter);
    }
}
