// equals 메서드
// 데이터의 실제 필드값 비교

package day_11_25;

public class StringEqualsTest {
    public static void main(String[] args) {
        String name1 = "이순신";
        String name2 = "이순신";
        String name3 = "홍길동";

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals("이순신"));
        System.out.println(name1.equals(name3));
    }
}
