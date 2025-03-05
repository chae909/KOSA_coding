package kosa.oop;

public class Book03 {
	// 필드: 책이름, 정가, 할인된 가격
	// 메서드: 할인가격 산출, 책 정보 출력

	String bookName;
	int price;
	int dc_price;

	public Book03() {}

	// 생성자 (dc 가격은 빼고)
	public Book03(String bookName, int price) {
		this.bookName = bookName;
		this.price = price;
	}

	// 할인가격 산출 
	// dc_price 값만 바꾸면 되므로 return할 필요가 없음
	public void discount() {
		if (price >= 30000) {
			dc_price = (int) (price * 0.75);
		} else if (price >= 20000) {
			dc_price = (int) (price * 0.80);
		} else if (price >= 15000) {
			dc_price = (int) (price * 0.85);
		}
	}

	// 책 정보 출력
	public void printBook() {
		System.out.println(bookName + " 교재의 정가는 " + price + "원, 할인된 가격은 " + dc_price + "원 입니다.");
	}
}