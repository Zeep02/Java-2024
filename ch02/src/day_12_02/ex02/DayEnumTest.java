package day_12_02.ex02;

public class DayEnumTest {
    public static void main(String[] args) {
        System.out.println(Day.SUN);
        System.out.println(Day.SUN.ordinal());
        System.out.println(Day.MON.ordinal());

        Day day = Day.WED;
        System.out.println(day.name());

        switch (day) {
            case SUN:
                System.out.println("일요일");
                break;
            
            case MON:
                System.out.println("월요일");
                break;

            case TUE:
                System.out.println("화요일");
                break;

            case WED:
                System.out.println("수요일");
                break;

            case THU:
                System.out.println("목요일");
                break;

            case FRI:
                System.out.println("금요일");
                break;

            case SAT:
                System.out.println("토요일");
                break;
        }
    }
}
