package kosa.oop4;


public class Main {

	public static void main(String[] args) {
		MyType my2 = () -> {
			System.out.println("람다식");
		};
		my2.hello();
		
		MyType my3 = () -> System.out.println("람다식2");
		my3.hello();
		
		YourType you1 = (String message) -> {
			System.out.println("텍스트: " + message);
		};
		you1.talk("안녕");
		
		YourType you2 = (String message) -> System.out.println("메세지" + message);
		you2.talk("반가워");
		
		MyNumber mynum = (x, y) -> (x>y)?x:y; // 리턴타입이 있으므로 sysout하지 않음
		System.out.println(mynum.getMax(10, 20));
		
		Runnable myrun = () -> {
			for (int i=1; i<6; i++) {
				try {
					// 1초에 한번씩 멀티스레드 작업을 해줌
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println("i");
			}
		};
		
		Thread t = new Thread(myrun);
		t.start();
		
		// MyType -> 임의의 익명클래스를 구현해보자
//		MyType t = new MyType() {
//			
//			@Override
//			public void hello() {
//				System.out.println("반가워!");
//				
//			}
//		};
//		
//		t.hello();

	}

}
