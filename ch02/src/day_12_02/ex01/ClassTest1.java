package day_12_02.ex01;

public class ClassTest1 {
    public static void main(String[] args) throws Exception{

        // 1
        Class class1 = Student.class;
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getPackage().getName());

        // 2
        Class class2 = Class.forName("day_12_02.Student");
        System.out.println(class2.getName());
        System.out.println(class2.getSimpleName());
        System.out.println(class2.getPackage().getName());

        // 3
        Student s1 = new Student("이순신", 3);
        Class class3 = s1.getClass();
        System.out.println(class3.getName());
        System.out.println(class3.getSimpleName());
        System.out.println(class3.getPackage().getName());
    }
}
