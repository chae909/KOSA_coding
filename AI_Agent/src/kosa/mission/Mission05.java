package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// 문자열 비교
		// 문자열.equals("문자열")
		
		// 두 정수와 연산자 문자열을 입력 받습니다.
		// 사칙연산 계산기를 만들어보자.
		// ex) 정수1: 50
		// 		정수2: 20
		//		연산자: + (String)
		// 		결과: 70
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1: ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수2: ");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.print("연산자: ");
		String cal = sc.nextLine();
		
		
//		switch (cal) {
//		case "+":
//			System.out.println(n1 + n2);
//			break;
//		case "-":
//			System.out.println(n1 - n2);
//			break;
//		case "*":
//			System.out.println(n1 * n2);
//			break;
//		case "/":
//			System.out.println(n1 / n2);
//			break;
//		}
		
		
		
		double result = 0;
		
//		switch (cal) {
//		case "+":
//			result = n1 + n2;
//			break;
//		case "-":
//			result = n1 - n2;
//			break;
//		case "*":
//			result = n1 * n2;
//			break;
//		case "/":
//			result = n1 / (double)n2;
//			break;
//		}
		
		
		
		if (cal.equals("+")) {
			result = n1 + n2;
		} else if (cal.equals("-")) {
			result = n1 - n2;
		} else if (cal.equals("*")) {
			result = n1 * n2;
		} else {
			result = n1 / (double)n2;
		}
		
		
		
		System.out.println("결과: " + result);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("결과: " + df.format(result));
	}
}
