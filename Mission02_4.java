package kosa.mission;

import java.util.Scanner;

public class Mission02_4 {
	
	public static void average(int arr[]) {
		arr[4] = arr[3] / 3;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String subject[] = {"국어", "영어", "수학"}; // 과목명을 담은 배열
		int scores[] = new int[5]; // 새로운 배열
		
		for (int i=0; i<3; i++) {
			System.out.print(subject[i] + "입력: "); // 과목명 배열 순서대로 "~입력: "출력
			scores[i] = sc.nextInt(); // scores 0~2번째 칸에는 순서대로 점수를 넣어줌
			scores[3] += scores[i]; // 총점 계산 -> scores 3번째 칸에 점수들을 계속 더해줌
		}
		
		average(scores); // 평균 계산
		
		// 출력 layout (\t를 하면 tap만큼 띄워진다)
		System.out.println("국어 \t영어 \t 수학 \t 총점 \t평균");
		for (int n : scores) {
			System.out.print(n + "\t");
		}
	}
}
