package kosa.oop4;


public class Main {

	public static void main(String[] args) {
		MyType my2 = () -> {
			System.out.println("���ٽ�");
		};
		my2.hello();
		
		MyType my3 = () -> System.out.println("���ٽ�2");
		my3.hello();
		
		YourType you1 = (String message) -> {
			System.out.println("�ؽ�Ʈ: " + message);
		};
		you1.talk("�ȳ�");
		
		YourType you2 = (String message) -> System.out.println("�޼���" + message);
		you2.talk("�ݰ���");
		
		MyNumber mynum = (x, y) -> (x>y)?x:y; // ����Ÿ���� �����Ƿ� sysout���� ����
		System.out.println(mynum.getMax(10, 20));
		
		Runnable myrun = () -> {
			for (int i=1; i<6; i++) {
				try {
					// 1�ʿ� �ѹ��� ��Ƽ������ �۾��� ����
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				System.out.println("i");
			}
		};
		
		Thread t = new Thread(myrun);
		t.start();
		
		// MyType -> ������ �͸�Ŭ������ �����غ���
//		MyType t = new MyType() {
//			
//			@Override
//			public void hello() {
//				System.out.println("�ݰ���!");
//				
//			}
//		};
//		
//		t.hello();

	}

}
