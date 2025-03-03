package kosa.mission;

import java.util.Scanner;

public class Mission02_5 {

//	public static void average(int arr[]) {
//		arr[4] = arr[3] / 3;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		String subject[] = { "국어", "영어", "수학" }; // 과목명을 담은 배열
//		int scores[] = new int[5]; // 새로운 배열
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(subject[i] + "입력: "); // 과목명 배열 순서대로 "~입력: "출력
//			scores[i] = sc.nextInt(); // scores 0~2번째 칸에는 순서대로 점수를 넣어줌
//			scores[3] += scores[i]; // 총점 계산 -> scores 3번째 칸에 점수들을 계속 더해줌
//		}
//
//		average(scores); // 평균 계산
//
//		// 출력 layout (\t를 하면 tap만큼 띄워진다)
//		System.out.println("국어 \t영어 \t 수학 \t 총점 \t평균");
//		for (int n : scores) {
//			System.out.print(n + "\t");
//		}
//	}
	
	// 성적관리프로그램에서 여러명의 성적관리를 구현해보자
	// 1명에 대한 성적: 국어, 영어, 수학, 총점, 평균 -> int arr[] = new int[5];
	// 10명 -> int arr[][] = new int[10][5]
	// 번호 	국어 	영어 	수학 	총점 	평균
	// 1 		90		90		70 	240 	80
	// 2 		50 	40 	30 	120 	40
	// =====================
	// 			140	120	100   (과목별 총점)
	// 			70 	60 	50     (과목별 평균)	
	
	
	public static void main(String[] args) {
		int score[][] = {    //[2][3]
				{90, 80, 70},
				{50, 40, 30}
		};
		
		int korTotal =0;
		int engTotal =0;
		int matTotal =0;
		
		System.out.println("번호  국어\t영어\t수학\t총점\t평균");
		
		for (int i=0; i<score.length; i++) {    // 1차원(학생별)
			int sum =0;
			int avg =0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1) + "\t");      // 번호 출력
			
			for (int j=0; j<score[i].length; j++) {      // 2차원(과목별)
				sum += score[i][j];							   // 각 학생의 과목별 점수 합산
				System.out.print(score[i][j] + "\t");      // 각 학생의 과목별 점수 출력
			}
			
			System.out.print(sum + "\t");   					     // 총점 출력
			System.out.print(sum/(score[i].length));				 // 평균 계산 및 출력
			
			System.out.println();										 // 각 학생의 세부내용 작성이 끝났으면 대행			
		}
		System.out.println("=====================");  // 학생별 입력사항 끝
		
		System.out.print("\t" + korTotal);
		System.out.print("\t" + engTotal);
		System.out.print("\t" + matTotal);
		System.out.println();
		
		System.out.print("\t" + korTotal/score.length);
		System.out.print("\t" + engTotal/score.length);
		System.out.print("\t" + matTotal/score.length);
		
//		int korTotal =0;
//		int engTotal =0;
//		int matTotal =0;
//		int total[] = {korTotal, engTotal, matTotal};
//
//		
//        for (int i = 0; i < score.length; i++) { // 각 학생의
//            for (int j = 0; j < score[i].length; j++) { // 과목별 점수들
//                total[j] += score[i][j]; // 점수 합산
//            }
//        }
//        
//        // 총합 출력
//        for (int j = 0; j < total.length; j++) {
//            System.out.print("\t" + total[j]);
//        }
		

		
		
	}

}
