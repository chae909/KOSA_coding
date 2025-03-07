package kosa.oop3;

// Runnable안에는 run이라는 추상메서드 있음
public class MyThread implements Runnable {

	@Override
	public void run() {
		// 멀티스레드 작업내용
		for (int i = 1; i<11; i++) {
			try {
				// 1초에 한번씩 멀티스레드 작업을 해줌
				Thread.sleep(1000);
			} catch (Exception e) {
			}
			System.out.println("i");
		}

	}

	public static void main(String[] args) {
		MyThread my = new MyThread();
		Thread t = new Thread(my);
		t.start();
		System.out.println("메인동작");
	}

}
