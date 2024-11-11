package day_11_11.ex01;
public class StudentTest {
    public static void main(String[] args) {
        College c = new College("홍길동", 2, 24);
        Student s1 = new Middle("임꺽정", 1);
        Student s2 = new College("이순신", 3, 20);

        String sinsang = s1.getStudInfo();
        System.out.println(sinsang);

        sinsang = s2.getStudInfo();


        System.out.println(sinsang);
    }
}
