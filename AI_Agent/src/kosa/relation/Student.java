package kosa.relation;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> courses; // �л��� ������û�� �����
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
		courses = new ArrayList<Course>();
		// ������û�� ������� �׶��׶� �߰��ؾ��ϹǷ�
		// �� list�� ������
	}
	
	// ������û �޼ҵ�
	public void register(Course course) {
		//**course ��ü�� �Ѿ���� list�� �߰�����**
					//(((�ߺ� ����� ->
					//if (courses.contains(course))
		courses.add(course);
		course.addStudent(this);
	}
	
	// �� �л��� ���� �������
	public void printMember() {
		System.out.println("�л��̸�: " + name);
		// list�� ���� for�� ���!
		for (Course c:courses) {
			System.out.println("��������: " + c.getCourseName());
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
