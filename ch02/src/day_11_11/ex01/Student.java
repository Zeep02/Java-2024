package day_11_11.ex01;

public class Student extends Person {
    protected String name;
    protected int grade;

    public Student() {
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String name, int grade) {
        System.out.println("매개변수가 있는 Student 생성자 호출");
        this.name = name;
        this.grade = grade;
    }
}
