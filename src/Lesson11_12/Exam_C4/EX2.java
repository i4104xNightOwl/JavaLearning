package Lesson11_12.Exam_C4;

import java.util.LinkedList;
import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Nhap n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }

        LinkedList<Integer> filter = new LinkedList<>();
        for (int item : list) if (item % 2 == 0) filter.add(item);

        int sum = 0;
        for (Integer item : filter) sum += item;

        float avg = (float) sum / filter.size();
        System.out.println(avg);
    }

}
