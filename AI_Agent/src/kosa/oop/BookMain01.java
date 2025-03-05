package kosa.oop;

public class BookMain01 {

	public static void main(String[] args) {
//		���� JAVA, JSP, Oracle ���� ������ 30000, 20000, 15000 �̴�. 
//		���
//		Java ����� ������ 30000�� ���ε� ������22500�� �Դϴ�.
//		JSP ����� ������ 20000�� ���ε� ������16000�� �Դϴ�.
//		Oracle ����� ������ 15000�� ���ε� ������12750�� �Դϴ�.
//		�ѱݾ�: 51250��
		
		// ��ü ����
		Book01 java = new Book01("JAVA", 30000);
		Book01 jsp = new Book01("JSP", 20000);
		Book01 oracle = new Book01("Oracle", 15000);
		
		int javaDis = java.discount(java.bookPrice);
		int jspDis = jsp.discount(jsp.bookPrice);
		int oraDis = oracle.discount(oracle.bookPrice);
		
		// ���
		System.out.println(java.bookName + " ������ ������" + java.bookPrice + ", ���ε� ������ " + javaDis + "�� �Դϴ�. ");
		
		System.out.println(jsp.bookName + " ������ ������" + jsp.bookPrice + ", ���ε� ������ " + jspDis + "�� �Դϴ�. ");
		
		System.out.println(oracle.bookName + " ������ ������" + oracle.bookPrice + ", ���ε� ������ " + oraDis + "�� �Դϴ�. ");
		
		System.out.println("�ѱݾ�: " + (javaDis+jspDis+oraDis));

	}
}
