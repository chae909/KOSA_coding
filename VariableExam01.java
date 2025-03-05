package kosa.basic;

public class VariableExam01 {

	public static void main(String[] args) {
		// 변수는 데이터를 담는 그릇 (ex. 홍길동, 100, 3.14, True)
		/*
		 * 자바에는 기본형 데이터가 있음. Primitive Type byte, short, int, long : 정수형 float, double :
		 * 실수형 char : 문자 1개 boolean : 논리형
		 */
		/*
		 * Object Type 실제 데이터는 따로 있고 변수명이 그를 참조하는 형태. 따라서 주소값을 가진다. =참조형 Reference형
		 * String : 문자열
		 */

		int num; // 변수 선언: 메모리 할당
		int arr[]; // 배열 선언 (Object Type)

		num = 100; // 변수 초기화

		int num2 = 200;
		System.out.println(num2);
		
		System.out.println("숫자: " + num2);
		// 전체가 string이 되게끔 보여짐
		
		float num3 = 3.14f;
		// float로 변환하려면 f붙이기
		
		double b = 3.14;
		int c = (int)b; // 강제 형변환
		System.out.println(c);
		
		double e = c; // 암묵적 형변환 - 자동으로 이루어짐
		System.out.println(e);
		
		long num4 = 100; // 기본리터럴 int에서 long으로 변환되고 있음
		// long num4 = 100L; - 형변환 없음. 기본리터럴의 type을 변환시킴
		System.out.println(num4);
		
		int num5 = 010; // 앞에 0이 있으면 8진수로 인식함. 
		System.out.println(num5);

	}

}
