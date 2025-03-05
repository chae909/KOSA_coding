package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseName; //�����
	private List<Student> students; // ������û�� �л���
	
	public Course() {}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
		students = new ArrayList<Student>();
		// student�� �� list �غ�
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void printCourses() {
		System.out.println("�����: " + courseName);
		for (Student s:students) {
			System.out.println("������û �л���: "+s.getName());
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
