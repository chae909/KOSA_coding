package kosa.oop;

public class StaticExam {

	int total; // �ʵ� -> ��ü ����(new) : ���������̱� ������ �⺻���� �ִ�. 
	static int grandTotal; // ��������, static����, Ŭ�������� -> Ŭ���� ���ʷε�
	
	public void add() {
		total += 10;
		grandTotal += 10;
	}
	
	public static void add2() { // ��ü ������ ���ص� ��. 
		System.out.println("static ���");
	}
	
	public static void main(String[] args) {
		add2(); // �տ� �� ������ �ʾƵ� (��ü ������ ���� �ʾƵ� ��µ�)
		
		StaticExam se = new StaticExam();
		StaticExam se2 = new StaticExam();
		se.add(); // se1.total 10, grandTotal 10�̴�.
		se2.add(); // se2.total 10, grandTotal�� 20�� �ȴ�!
		
		System.out.println("total: "+se.total);
		System.out.println("grandTotal: "+StaticExam.grandTotal); // Ŭ���������� Ŭ���� �̸����� ����!!
		System.out.println("total: "+se2.total);
		System.out.println("grandTotal: "+StaticExam.grandTotal);
	}
	
//	public static void main(String[] args) {
//		StaticExam se = new StaticExam();
//		StaticExam se2 = new StaticExam();
//		se.add(); // se1.total 10, grandTotal 10�̴�.
//		se2.add(); // se2.total 10, grandTotal�� 20�� �ȴ�!
//		
//		System.out.println("total: "+se.total);
//		System.out.println("grandTotal: "+StaticExam.grandTotal); // Ŭ���������� Ŭ���� �̸����� ����!!
//		System.out.println("total: "+se2.total);
//		System.out.println("grandTotal: "+StaticExam.grandTotal);
//
//	}

}
