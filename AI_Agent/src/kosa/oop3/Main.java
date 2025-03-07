package kosa.oop3;

public class Main {

	public static void main(String[] args) {
//		Student role = new Student();
//		Teacher role = new Teacher();
		Programmer role = new Programmer();
		
		// 익명내부클래스로 열심히 운전하는 role 추가
		Role driver = new Role() {
			public void doing() {
				System.out.println("열심히 운전중");
			}
		};
		
		Person person1 = new Person("채정윤", role);
		Person person2 = new Person("채현석", driver);
		Person person3 = new Person("홍길동", new Role() {
			
			@Override
			public void doing() {
				System.out.println("그림그리는중");
				
			}
		});
		
		person1.doIt();
		person2.doIt();
	}
}