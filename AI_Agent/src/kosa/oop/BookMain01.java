package kosa.oop;

public class BookMain01 {

	public static void main(String[] args) {
//		교재 JAVA, JSP, Oracle 각각 가격이 30000, 20000, 15000 이다. 
//		결과
//		Java 교재는 정가는 30000원 할인된 가격은22500원 입니다.
//		JSP 교재는 정가는 20000원 할인된 가격은16000원 입니다.
//		Oracle 교재는 정가는 15000원 할인된 가격은12750원 입니다.
//		총금액: 51250원
		
		// 객체 생성
		Book01 java = new Book01("JAVA", 30000);
		Book01 jsp = new Book01("JSP", 20000);
		Book01 oracle = new Book01("Oracle", 15000);
		
		int javaDis = java.discount(java.bookPrice);
		int jspDis = jsp.discount(jsp.bookPrice);
		int oraDis = oracle.discount(oracle.bookPrice);
		
		// 출력
		System.out.println(java.bookName + " 교재의 정가는" + java.bookPrice + ", 할인된 가격은 " + javaDis + "원 입니다. ");
		
		System.out.println(jsp.bookName + " 교재의 정가는" + jsp.bookPrice + ", 할인된 가격은 " + jspDis + "원 입니다. ");
		
		System.out.println(oracle.bookName + " 교재의 정가는" + oracle.bookPrice + ", 할인된 가격은 " + oraDis + "원 입니다. ");
		
		System.out.println("총금액: " + (javaDis+jspDis+oraDis));

	}
}
