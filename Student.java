
import java.util.ArrayList;
import java.util.List;

class Stu {
	private String student_id;
	private String student_name;
	private List<Double> grades = new ArrayList<>();
	
	public String getStudent_id() {
		return student_id;
	}
	
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	public List<Double> getGrades() {
		return grades;
	}
	
	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}
	
	public void addGrade(double grade) {
		this.grades.add(grade);
	}
}

public class Student {
	public static void main(String[] args) {
		Stu o = new Stu();
		o.setStudent_id("44");
		o.setStudent_name("Abhishek");
		o.addGrade(85.5);
		o.addGrade(90.0);
		o.addGrade(88.0);
		
		String student_id = o.getStudent_id();
		String student_name = o.getStudent_name();
		List<Double> grades = o.getGrades();
		
		System.out.println("Student ID: " + student_id);
		System.out.println("Student Name: " + student_name);
		System.out.println("Grades: " + grades);
	}
}
