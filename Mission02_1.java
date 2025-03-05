package kosa.mission;

import java.util.Scanner;

public class Mission02_1 {
	
	// 총점을 구하는 메서드
	public static int total(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	
	// 평균을 구하는 메서드
	public static double aver(int total) {
		double aver = total / 3.0;
		return aver;
	}

	public static void main(String[] args) {
		// 성적관리 구현
		// 국어, 영어, 수학 점수를 키보드로 입력받고
		// 총점과 평균을 출력 (평균은 실수형)

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 성적 입력: ");
		int kor = sc.nextInt();
		System.out.print("영어 성적 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 성적 입력: ");
		int math = sc.nextInt();

//		int total = kor + eng + math;
//		float aver = (float)total / 3;
//		// 기본 리터럴이 소수점이면 자동으로 되므로 다음과 같은 방법도 가능하다. 
//		// float aver = (float)total / 3.0;
//		// 하지만 aver의 자료형은 double이 된다는점!
		
		int val = total(kor, eng, math);
		
		System.out.println("총점: " + val + "점");
		System.out.printf("평균: %.2f%n", aver(val), "점");

	}

}
