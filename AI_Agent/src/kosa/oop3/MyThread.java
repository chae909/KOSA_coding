package kosa.oop3;

// Runnable�ȿ��� run�̶�� �߻�޼��� ����
public class MyThread implements Runnable {

	@Override
	public void run() {
		// ��Ƽ������ �۾�����
		for (int i = 1; i<11; i++) {
			try {
				// 1�ʿ� �ѹ��� ��Ƽ������ �۾��� ����
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
		System.out.println("���ε���");
	}

}
