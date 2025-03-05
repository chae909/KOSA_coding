package kosa.oop;

public class StaticExam {

	int total; // 필드 -> 객체 생성(new) : 지역변수이기 때문에 기본형이 있다. 
	static int grandTotal; // 정적변수, static변수, 클래스변수 -> 클래스 최초로딩
	
	public void add() {
		total += 10;
		grandTotal += 10;
	}
	
	public static void add2() { // 객체 생성을 안해도 됨. 
		System.out.println("static 출력");
	}
	
	public static void main(String[] args) {
		add2(); // 앞에 뭘 붙이지 않아도 (객체 생성을 하지 않아도 출력됨)
		
		StaticExam se = new StaticExam();
		StaticExam se2 = new StaticExam();
		se.add(); // se1.total 10, grandTotal 10이다.
		se2.add(); // se2.total 10, grandTotal이 20이 된다!
		
		System.out.println("total: "+se.total);
		System.out.println("grandTotal: "+StaticExam.grandTotal); // 클래스변수는 클래스 이름으로 접근!!
		System.out.println("total: "+se2.total);
		System.out.println("grandTotal: "+StaticExam.grandTotal);
	}
	
//	public static void main(String[] args) {
//		StaticExam se = new StaticExam();
//		StaticExam se2 = new StaticExam();
//		se.add(); // se1.total 10, grandTotal 10이다.
//		se2.add(); // se2.total 10, grandTotal이 20이 된다!
//		
//		System.out.println("total: "+se.total);
//		System.out.println("grandTotal: "+StaticExam.grandTotal); // 클래스변수는 클래스 이름으로 접근!!
//		System.out.println("total: "+se2.total);
//		System.out.println("grandTotal: "+StaticExam.grandTotal);
//
//	}

}
