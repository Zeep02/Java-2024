package day_12_02.ex03;

public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 3, new Address("서울시", "강남구", "압구정동"));
        String name = s.getName();
        int grade = s.getGrade();

        Address addr = s.getAddress();
        String city = addr.city;
        String gu = addr.gu;
        String dong = addr.dong;

        System.out.println("학생 정보");
        System.out.println("-------------------------");
        System.out.println("이름: " + name + ", 학년: " + grade);
        System.out.println("주소: " + city + " " + gu + " " + dong);
    }
}
