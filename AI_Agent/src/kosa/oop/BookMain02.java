package kosa.oop;

public class BookMain02 {
	public static void main(String[] args) {
		// 책의 이름을 반복해서 입력하지 않도록 배열에 저장
		Book02 books[] = { 
				new Book02("JAVA", 30000), 
				new Book02("JSP", 20000), 
				new Book02("Oracle", 15000) };

		// 총 금액을 0으로 초기화, 생성
		int totalPrice = 0;

		// 모든 책에 대해 결과를 출력 
		// books 내부의 각 요소(Book02 타입 객체)를 book이라는 변수에 담아 한 번씩 실행함
		for (Book02 book : books) {
			book.result();
			totalPrice += book.discount();  // 할인된 가격을 총 금액에 더해줌
		}

		// 총 금액을 출력
		System.out.println("총 금액: " + totalPrice + "원");
	}
}