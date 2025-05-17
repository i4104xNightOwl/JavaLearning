package Lesson7_8.Exam_C3.Employee;

public class Employee {
    protected String ten;
    protected long luong;

    public Employee() {}

    public Employee(String ten) {
        this.ten = ten;
    }

    protected String loaiNhanVien() { return ""; }

    public void XuatThongTin() {
        System.out.println("===== Employee: " + this.ten + " =====");
        System.out.println("- Employee type: " + this.loaiNhanVien());
        System.out.println("- Salary: " + this.luong + " VND");
    }
}
