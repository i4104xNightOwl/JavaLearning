package Lesson7_8.ThucHanh.Employee;

import Lesson7_8.ThucHanh.Configs;

public class PartTime extends Employee {
    private int gioLamViec;

    public PartTime(String ten, int gioLamViec) {
        this.ten = ten;
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String loaiNhanVien() {
        return "Nhan vien thoi vu";
    }

    public void tinhLuong() {
        this.luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_HIO * this.gioLamViec;
    }
}
