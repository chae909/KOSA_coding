package kosa.basic;

import java.util.Scanner;

public class MethodExam {
	
//	public static void print() {
//		System.out.println("Hello0!!!");
//		System.out.println("Hello1!!!");
//		System.out.println("Hello2!!!");
//	}
//	// 함수(method) 생성 -> 중복되는 코드 최소화
//
//	public static void main(String[] args) {
//		// 호출
//		print();
//
//	}
	
	// 메서드 정의
	// 접근제어자, (static), 리턴형(void), 메서드이름(파라미터)
	public static void printCharacter(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2; // 지역변수 sum
		return sum;
	}

	public static void main(String[] args) {
		// 호출
//		printCharacter('#', 10);
//		printCharacter('@', 10);
//		printCharacter('-', 10);
		int result = add(1,2); // 리턴값이 있기때문에 변수에 할당할 수 있음
		System.out.println(result);
		
		System.out.println("결과: " + add(2,5));
	}
}
