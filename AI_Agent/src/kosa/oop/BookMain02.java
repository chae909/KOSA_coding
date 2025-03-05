package kosa.oop;

public class BookMain02 {
	public static void main(String[] args) {
		// å�� �̸��� �ݺ��ؼ� �Է����� �ʵ��� �迭�� ����
		Book02 books[] = { 
				new Book02("JAVA", 30000), 
				new Book02("JSP", 20000), 
				new Book02("Oracle", 15000) };

		// �� �ݾ��� 0���� �ʱ�ȭ, ����
		int totalPrice = 0;

		// ��� å�� ���� ����� ��� 
		// books ������ �� ���(Book02 Ÿ�� ��ü)�� book�̶�� ������ ��� �� ���� ������
		for (Book02 book : books) {
			book.result();
			totalPrice += book.discount();  // ���ε� ������ �� �ݾ׿� ������
		}

		// �� �ݾ��� ���
		System.out.println("�� �ݾ�: " + totalPrice + "��");
	}
}