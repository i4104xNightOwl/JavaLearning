package Lesson7_8.ThucHanh.Employee;

import Lesson7_8.ThucHanh.Configs;

public class FullTime extends Employee {
    private int ngayLamThem;
    private int loaiChucVu;

    public FullTime(String name) {
        this.ten = name;
    }

    public FullTime(String name, int ngayLamThem) {
        this.ten = name;
        this.ngayLamThem = ngayLamThem;
    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.loaiChucVu = loaiChucVu;
    }

    @Override
    public String loaiNhanVien() {
        if (this.loaiChucVu == Configs.NHAN_VIEN_SEP) {
            return "Nhan vien Sep toan thoi gian";
        }
        if (this.loaiChucVu == Configs.EMPLOYEE) {
            return "Nhan vien Linh toan thoi gian";
        }
        return "";
    }

    public void tinhLuong() {
        if (this.loaiChucVu == Configs.NHAN_VIEN_SEP) {
            this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP;
        }
        if (this.loaiChucVu == Configs.EMPLOYEE) {
            this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH;
        }
        this.luong += Configs.LUONG_LAM_THEM_MOI_NGAY * this.ngayLamThem;
    }
}