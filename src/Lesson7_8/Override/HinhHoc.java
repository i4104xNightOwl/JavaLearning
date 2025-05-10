package Lesson7_8.Override;

class HinhTron {
    public void xuatThongTin() {
        System.out.println("Day la hinh tron");
    }
}

class Hinhtru extends HinhTron {

    @Override
    public void xuatThongTin() {
        System.out.println("Day la hinh tru");
    }
}

public class HinhHoc {
    public static void main(String[] args) {
        HinhTron tron = new HinhTron();
        tron.xuatThongTin();

        Hinhtru hinhtru = new Hinhtru();
        hinhtru.xuatThongTin();

        System.out.println("Thong tin doi tuong hinh tron: " + tron.getClass());
        System.out.println("Thong tin doi tuong hinh tron: " + tron.getClass().getName());
        System.out.println("Thong tin doi tuong hinh tron: " + tron.getClass().getSimpleName());

    }
}