package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName; //과목명
	private List<Student> students; // 수강신청한 학생들
	
	public Course() {}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();
		// student용 빈 list 준비
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void printCourses() {
		System.out.println("과목명: " + courseName);
		for (Student s:students) {
			System.out.println("수강신청 학생명: "+s.getName());
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
