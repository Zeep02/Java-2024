package day_10_28.ex01;

public class Student {
    protected String name;
    protected int grade;

    public Student() {
        System.out.println("Student 기본 생성자 호출");
    }

    public Student(String _name, int _grade){
        System.out.println("매개변수가 있는 student 생성자 호출");
        name = _name;
        grade = _grade;
    }

    public void study() {
        System.out.println("시험 공부를 합니다.");
    }

    public int test() {
        System.out.println("시험 점수입니다.");
        return 0;
    }
    public String getStudInfo() {
        return "이름: " + name + ", 학년: " + grade;
    }
}
