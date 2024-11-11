package day_11_11.ex01;

public class College extends Student {
    private int courses; //학점


    public College(String name, int grade, int _courses) {
        super();
        // super(name, grade);
        System.out.println("College 생성자 호출");

        super.name = name;
        super.grade = grade;
        courses = _courses;
    }

    public int getCourses() {
        return courses;
    }



    // public College() {
    //     this("이순신", 2, 20);
    //     System.out.println("College 클래스의 기본 생성자 호출");
    // }

    // public College(String name, int grade, int courses) {
    //     super();
    //     System.out.println("매개변수가 3개인 College 생성자 호출");

    //     super.name = name;
    //     super.grade = grade;
    //     this.courses = courses;
    // }

    // public int getCourses() {
    //     return courses;
    // }
}
