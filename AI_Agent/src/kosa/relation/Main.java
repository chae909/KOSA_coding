package kosa.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("��ǻ�����α׷����Թ�");
		Course c2 = new Course("���������");
		Course c3 = new Course("���������");
		
		Student s1 = new Student("ä����");
		Student s2 = new Student("������");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c1);
		s2.register(c3);
		
		// ���
		s1.printMember();
		System.out.println();
		s2.printMember();
		System.out.println("==============");
		
		c1.printCourses();

	}

}
