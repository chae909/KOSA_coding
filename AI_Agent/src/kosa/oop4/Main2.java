package kosa.oop4;

interface A{
	void abc();
}

class B{
	void bcd() {
		System.out.println("B�޼��� ȣ��");
	}
}

interface AA{
	BB abc(String name); // BB��ü�� ���Ͻ�Ŵ
}

class BB{
	BB(String name){
		System.out.println("BB������: " + name);
	}
}

public class Main2 {

	public static void main(String[] args) {
//		//1. �͸���Ŭ����
		AA aa1 = new AA() {
			
			@Override
			public BB abc(String name) {
				return new BB(name);
			}
		};
		aa1.abc("ȫ�浿");
		
		//2. ���ٽ�
		AA aa2 = (name) -> new BB(name);
		aa2.abc("�ڱ浿");
		
		//3. 
		AA aa3 = BB::new;
		aa3.abc("��浿");
		
		
		
		
		
		// 1. �͸�Ŭ������ �̿��ؼ� abc() �������̵� -> B�� �����ؼ� bcd() ȣ��
//		A a = new A() {
//		public void abc() {
//			B b = new B();
//			b.bcd();
//		}
//		};
//		a.abc();

		// 2. �ش系���� �����ϰ� ���ٽ����� ����
//		A a = () -> {
//			B b = new B();
//			b.bcd();
//		};
//		a.abc();
		
		// 3. �ν��Ͻ� ���� ����
//		B b = new B();
//		A a = b::bcd;
//		a.abc();
		
		
		
	}
}
