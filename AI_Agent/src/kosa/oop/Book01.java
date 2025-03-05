package kosa.oop;

public class Book01 {
//	���� JAVA, JSP, Oracle ���� ������ 30000, 20000, 15000 �̴�. 
//
//	���� DC�� 30000�� �̻� 25% ����
//		20000�� �̻� 20% ����
//		15000�� �̻� 15%����
	
	// �䱸�м� ����� ������ ����
	// field
	String bookName;
	int bookPrice;
	
	// Book class�� ����Ʈ ������
	public Book01() {}
	
	// ������
	public Book01(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	// ����� ��� -> �޼���
	public int discount(int bookPrice) {
		if (bookPrice >= 30000) {
			bookPrice *= 0.75;
		} else if (bookPrice >= 20000) {
			bookPrice *= 0.80;
		} else if (bookPrice >= 15000) {
			bookPrice *= 0.85;
		}
		return bookPrice;
	}
}
