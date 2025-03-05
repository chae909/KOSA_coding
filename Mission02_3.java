package kosa.mission;

import java.util.Scanner;

public class Mission02_3 {

	// 총점과 평균을 계산하는 메서드
	// 파라미터는 점수 정보가 있는 배열
	public static void cal(int arr[]) {
		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += arr[i];
		}

		int aver = total / arr.length;

		System.out.println("총점: " + total + ", 평균: " + aver);
	}

	// 사용자의 정보를 입력받는 메서드
	public static void input(String str, int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + "성적을 입력하시오: ");
		// "을 입력하시오"를 추가해서 출력

		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		int scores[] = new int[3]; // 점수를 저장할 scores 배열 생성 (정수형, 크기 3)

		for (int i = 0; i < 3; i++) {
			input("국어", scores);
			input("영어", scores);
			input("수학", scores);
		}

		// 계산내용 출력
		cal(scores);
	}
}