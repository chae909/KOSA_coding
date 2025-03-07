package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType -> 임의의 익명클래스를 구현해보자
		MyType t = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("반가워!");
				
			}
		};
		
		t.hello();

	}

}
