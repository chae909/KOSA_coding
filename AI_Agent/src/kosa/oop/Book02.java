package kosa.oop;

public class Book02 {
	// Book ��ü�� �ʵ�
	String bookName;
	int bookPrice;

	// Book class�� ����Ʈ ������
	public Book02() {}

	// ������
	public Book02(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	// discount �޼���
	public int discount() {
		if (bookPrice >= 30000) {
			return (int) (bookPrice * 0.75);
		} else if (bookPrice >= 20000) {
			return (int) (bookPrice * 0.80);
		} else if (bookPrice >= 15000) {
			return (int) (bookPrice * 0.85);
		}
		return bookPrice;
	}

	// ����ϴ� �޼���
	public void result() {
		// discount �ż��忡�� ����� ���� ������ ����
		int discountedPrice = discount();
		// ��� ���̾ƿ�
		System.out.println(bookName + " ������ ������ " + bookPrice + "��, ���ε� ������ " + discountedPrice + "�� �Դϴ�.");
	}
}