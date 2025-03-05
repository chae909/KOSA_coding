package kosa.basic;

import java.util.Scanner;

public class DowhileExam {

	public static void main(String[] args) {
		// do~while

		Scanner sc = new Scanner(System.in);

//		int n = 0;
//		
//		do {
//			System.out.print("입력: ");
//			n = sc.nextInt();
//		} while (n<0);   // while문을 못벗어나게끔 한다 (양수의 값을 넣을때까지)
//		
//		System.out.println("입력결과: " + n);

		// 퀴즈> 임의의 난수 3개를 받아서 서로 중첩되지 않도록 출력

		int a, b, c;

		// do-while문을 이용해 3개의 난수가 모두 다를 때까지 반복
		do {
			// 난수 초기화
			a = (int) (Math.random() * 9) + 1;
			b = (int) (Math.random() * 9) + 1;
			c = (int) (Math.random() * 9) + 1;
		} while (a == b || b == c || c == a); // 3개의 값이 모두 다를 때까지 반복

		// 출력
		System.out.println(a + ", " + b + ", " + c);
	}
}
