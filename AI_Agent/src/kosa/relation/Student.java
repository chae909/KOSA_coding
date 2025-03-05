package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; // 학생이 수강신청한 과목들
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
		// 수강신청한 과목들은 그때그때 추가해야하므로
		// 빈 list로 만들자
	}
	
	// 수강신청 메소드
	public void register(Course course) {
		//**course 객체가 넘어오면 list에 추가하자**
					//(((중복 물어볼때 ->
					//if (courses.contains(course))
		courses.add(course);
		course.addStudent(this);
	}
	
	// 한 학생에 대한 정보출력
	public void printMember() {
		System.out.println("학생이름: " + name);
		// list는 향상된 for문 사용!
		for (Course c:courses) {
			System.out.println("수강과목: " + c.getCourseName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
