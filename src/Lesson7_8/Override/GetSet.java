package Lesson7_8.Override;

class SinhVien {
    private String name;
    private String age;

    public String getName() { return name; }
    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "khong biet";
            return;
        }
        this.name = name;
    }

    public String getAge() {
        if (Integer.parseInt(age) != -1) {
            return age;
        }
        return "Tuoi khong hop le";
    }
    public void setAge(int age) {
        if (age < 18) {
            this.age = String.valueOf(-1);
            return;
        }
        this.age = String.valueOf(age);
    }
}

public class GetSet {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien();
        SinhVien sv1 = new SinhVien();

        sv.setName("Sinh Vien");
        sv.setAge(20);

        sv1.setName("");
        sv1.setAge(8);

        System.out.println(sv.getName());
        System.out.println(sv.getAge());

        System.out.println(sv1.getName());
        System.out.println(sv1.getAge());
    }
}
