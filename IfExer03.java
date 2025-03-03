package kosa.basic;

import java.util.Scanner;

public class IfExer03 {

	public static void main(String[] args) {
		// if문을 활용한 예제 3개
		// mission2에서 계산한 평균점수를 가지고 등급을 나누도록

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 성적 입력: ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		float aver = (float) total / 3;
		// 기본 리터럴이 소수점이면 자동으로 되므로 다음과 같은 방법도 가능하다.
		// float aver = (float)total / 3.0;
		// 하지만 aver의 자료형은 double이 된다는점!

		String level;

		if (aver >= 90)
			level = "A";
		else if (aver >= 80)
			level = "B";
		else if (aver >= 70)
			level = "C";
		else if (aver >= 60)
			level = "D";
		else
			level = "F";

		System.out.println("총점: " + total + "점");
		System.out.println("평균: " + aver + "점");
		System.out.println("학점: " + level);
	}

}
