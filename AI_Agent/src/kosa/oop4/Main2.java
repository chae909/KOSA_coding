package kosa.oop4;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("B메서드 호출");
	}
}

interface AA{
	BB abc(String name); // BB객체를 리턴시킴
}

class BB{
	BB(String name){
		System.out.println("BB생성자: " + name);
	}
}

public class Main2 {

	public static void main(String[] args) {
//		//1. 익명내부클래스
		AA aa1 = new AA() {
			
			@Override
			public BB abc(String name) {
				return new BB(name);
			}
		};
		aa1.abc("홍길동");
		
		//2. 람다식
		AA aa2 = (name) -> new BB(name);
		aa2.abc("박길동");
		
		//3. 
		AA aa3 = BB::new;
		aa3.abc("김길동");
		
		
		
		
		
		// 1. 익명클래스를 이용해서 abc() 오버라이딩 -> B를 생성해서 bcd() 호출
//		A a = new A() {
//		public void abc() {
//			B b = new B();
//			b.bcd();
//		}
//		};
//		a.abc();

		// 2. 해당내용을 동일하게 람다식으로 구현
//		A a = () -> {
//			B b = new B();
//			b.bcd();
//		};
//		a.abc();
		
		// 3. 인스턴스 참조 구현
//		B b = new B();
//		A a = b::bcd;
//		a.abc();
		
		
		
	}
}
