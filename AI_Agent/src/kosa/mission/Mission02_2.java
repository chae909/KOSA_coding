package kosa.mission;

import java.util.Scanner;

public class Mission02_2 {
	
	public static double aver(int total) {
		double aver = total / 3.0;
		return aver;
	}

	public static void main(String[] args) {
		// 국어, 영어, 수학 -> 키보드 입력받아 배열로 구현해보자
		// 평균 -> 메서드 정의 구현
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 성적을 입력하시오. : ");
		int kor = sc.nextInt();
		System.out.print("영어 성적을 입력하시오. : ");
		int eng = sc.nextInt();
		System.out.print("수학 성적을 입력하시오. : ");
		int math = sc.nextInt();
		// 키보드 입력받기
		
		int arr[] = {kor, eng, math};
		// 배열 선언, 생성, 초기화 동시에
		
		int total = arr[0] + arr[1] + arr[2];
		
		System.out.println("총점: " + total);
		System.out.printf("평균: %.2f%n", aver(total));
	}
}
