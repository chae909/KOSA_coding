package kosa.oop4;

public class Main {

	public static void main(String[] args) {
		// MyType -> ������ �͸�Ŭ������ �����غ���
		MyType t = new MyType() {
			
			@Override
			public void hello() {
				System.out.println("�ݰ���!");
				
			}
		};
		
		t.hello();

	}

}
