package Lesson11_12.Exam_C4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> fruitSet = new HashSet<>();

        while (true) {
            System.out.print("Nhap ten:");
            String fruit = scanner.nextLine();
            if (fruit.isEmpty()) break;
            fruitSet.add(fruit);
        }

        System.out.println("----");
        System.out.println("So luong: " + fruitSet.size());
        System.out.println(fruitSet);

        System.out.println("----");
        System.out.print("Nhap ten muon tim: ");
        String checkFruit = scanner.nextLine();
        if (fruitSet.contains(checkFruit)) {
            System.out.println(checkFruit);
        } else {
            System.out.println("Khong ton tai");
        }

        System.out.println("----");
        System.out.print("Nhap ten muon xoa: ");
        String deleteFruit = scanner.nextLine();
        fruitSet.remove(deleteFruit);
        System.out.println("HashSet sau khi xoa: " + fruitSet);

        System.out.println("----");
        List<String> newFruits = new ArrayList<>();
        newFruits.add("Xoai");
        newFruits.add("Tao");
        newFruits.add("Chuoi");
        fruitSet.addAll(newFruits);

        Iterator<String> iterator = fruitSet.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + " ");

        System.out.println();
        System.out.println("----");

        fruitSet.removeAll(newFruits);
        System.out.println("HashSet sau khi xóa các phần tử trong List: " + fruitSet);

        scanner.close();
    }
}
