package day_12_02.ex01;

public class Student {
	String name;
	int grade;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
	public String getStudInfo() {
		String info = "이름: " + name + ", 학년: " + grade;
		return info;
	}
}