package lab1package;

public class Student {
	private String name;
	private String address;
	private int[] grades;
	private String[] courses;
	private int pointer;
	public Student() {
		name = "";
		address = "";
	}
	public Student(String name, String address) {
		this.name = name;
		this.address = address;
		grades = new int[30];
		courses = new String[30];
		pointer = 0;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return "Jim("+name+" "+address+")";
	}
	public void addCourseGrade(String course, int grade) {
		courses[pointer] = course;
		grades[pointer] = grade;
		++pointer;
	}
	public void printGrades() {
		String result = name + " ";
		for(int i=0; i<pointer;i++) {
			result += courses[i] + ":" + grades[i] + " ";
		}
		System.out.println(result);
	}
	public double getAverageGrade() {
		int sum = 0;
		for(int i = 0; i < this.courses.length; i++) {
			sum = sum + grades[i];
		}
		return (double)sum/pointer;
	}
}
