package day_11_04.ex02;

public class Student {
    public String name;
    protected  int grade;
    private  String address;
    int age;

    public Student() {
        System.out.println(("Student "));
    }
    void study() {
        System.out.println("시험 공부를 합니다");
    }

    private int test() {
        System.out.println("시험점수입니다.");
        return 0;
    }
}
