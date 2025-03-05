package kosa.oop;

public class Book03 {
	// �ʵ�: å�̸�, ����, ���ε� ����
	// �޼���: ���ΰ��� ����, å ���� ���

	String bookName;
	int price;
	int dc_price;

	public Book03() {}

	// ������ (dc ������ ����)
	public Book03(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	// ���ΰ��� ���� 
	// dc_price ���� �ٲٸ� �ǹǷ� return�� �ʿ䰡 ����
	public void discount() {
		if (price >= 30000) {
			dc_price = (int) (price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int) (price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int) (price * 0.85);
		}
	}

	// å ���� ���
	public void printBook() {
		System.out.println(bookName + " ������ ������ " + price + "��, ���ε� ������ " + dc_price + "�� �Դϴ�.");
	}
}