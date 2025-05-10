package Lesson7_8.Shape;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        HinhTru hinhTru = new HinhTru();
        HinhVuong hinhVuong = new HinhVuong();
        HinhTron hinhTron = new HinhTron();

        System.out.println("=================");
        System.out.println("** Hinh Chu nhat");
        hinhChuNhat.NhapChieuDai();
        hinhChuNhat.NhapChieuRong();
        hinhChuNhat.TinhChuVi();
        hinhChuNhat.TinhDienTich();

        hinhChuNhat.xuatTen();
        hinhChuNhat.inChuvi();
        hinhChuNhat.inDienTich();

        System.out.println("=================");
        System.out.println("** Hinh Vuong");
        hinhVuong.NhapCanh();
        hinhVuong.TinhChuVi();
        hinhVuong.TinhDienTich();

        hinhVuong.xuatTen();
        hinhVuong.inChuvi();
        hinhVuong.inDienTich();

        System.out.println("=================");
        System.out.println("** Hinh Tron");
        hinhTron.NhapBanKinh();
        hinhTron.TinhChuVi();
        hinhTron.TinhDienTich();

        hinhTron.xuatTen();
        hinhTron.inChuvi();
        hinhTron.inDienTich();

        System.out.println("=================");
        System.out.println("** Hinh Tru");
        hinhTru.NhapChieuCao();
        hinhTru.TinhChuVi();
        hinhTru.TinhDienTich();
        hinhTru.TinhTheTich();

        hinhTru.xuatTen();
        hinhTru.inChuvi();
        hinhTru.inDienTich();
        hinhTru.inTheTich();
    }
}
