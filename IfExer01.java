package kosa.basic;

import java.util.Scanner;

public class IfExer01 {

	public static void main(String[] args) {
		// if문을 활용한 예제 3개
		// 나누어떨어지는지 알려주기
		// 3. mission2에서 계산한 평균점수를 가지고 등급을 나누도록

		Scanner sc = new Scanner(System.in);

		System.out.print("나누어지는 숫자 입력: ");
		int num = sc.nextInt();
		System.out.print("나누는 숫자 입력: ");
		int divisor = sc.nextInt();

		int quo = num / divisor;
		int rem = num % divisor;

		if (num % divisor == 0)
			System.out.println(quo + "로 나누어떨어집니다. ");
		else
			System.out.println("나누어떨어지지 않습니다. 몫은 " + quo + ", 나머지는 " + rem + "입니다. ");

	}

}
