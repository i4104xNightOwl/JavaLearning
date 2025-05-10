package Lession6.Object;

public class Student {
    public String name;
    public int age;
    public float weight;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public void showName() {
        System.out.println("Ten sinh vien: " + name);
    }

    public void showAge() {
        System.out.println("Tuoi: " + age);
    }

    public void showWeight() {
        System.out.println("Can nang: " + weight);
    }
}
