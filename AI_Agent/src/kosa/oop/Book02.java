package kosa.oop;

public class Book02 {
	// Book 객체의 필드
	String bookName;
	int bookPrice;

	// Book class의 디폴트 생성자
	public Book02() {}

	// 생성자
	public Book02(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}

	// discount 메서드
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

	// 출력하는 메서드
	public void result() {
		// discount 매서드에서 계산한 값을 변수에 저장
		int discountedPrice = discount();
		// 출력 레이아웃
		System.out.println(bookName + " 교재의 정가는 " + bookPrice + "원, 할인된 가격은 " + discountedPrice + "원 입니다.");
	}
}