package kosa.relation;

public class Main {

	public static void main(String[] args) {
		Course c1 = new Course("컴퓨터프로그래밍입문");
		Course c2 = new Course("선형대수학");
		Course c3 = new Course("기초통계학");
		
		Student s1 = new Student("채정윤");
		Student s2 = new Student("이해인");
		
		s1.register(c1);
		s1.register(c2);
		
		s2.register(c1);
		s2.register(c3);
		
		// 출력
		s1.printMember();
		System.out.println();
		s2.printMember();
		System.out.println("==============");
		
		c1.printCourses();

	}

}
