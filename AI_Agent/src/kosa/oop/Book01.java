package kosa.oop;

public class Book01 {
//	교재 JAVA, JSP, Oracle 각각 가격이 30000, 20000, 15000 이다. 
//
//	교재 DC는 30000원 이상 25% 할인
//		20000원 이상 20% 할인
//		15000원 이상 15%할인
	
	// 요구분석 공통된 데이터 구조
	// field
	String bookName;
	int bookPrice;
	
	// Book class의 디폴트 생성자
	public Book01() {}
	
	// 생성자
	public Book01(String bookName, int bookPrice) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	
	// 공통된 기능 -> 메서드
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
