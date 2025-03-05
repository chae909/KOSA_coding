package kosa.mission;

import java.util.Scanner;

public class Mission02_6 {

	
	
	
	public static void main(String[] args) {
		int score[][] = {    //[2][3]
				{90, 80, 70},
				{50, 40, 30}
		};
		
		int korTotal =0;
		int engTotal =0;
		int matTotal =0;
		int total[] = {korTotal, engTotal, matTotal};
		
		System.out.println("번호  국어\t영어\t수학\t총점\t평균");
		
		for (int i=0; i<score.length; i++) { 					     // 1차원(학생별)
			int sum =0;
			int avg =0;
			
			System.out.print((i+1) + "\t");     						 // 번호 출력
			
			for (int j=0; j<score[i].length; j++) {      // 2차원(과목별)
				sum += score[i][j];							   // 각 학생의 과목별 점수 합산
				System.out.print(score[i][j] + "\t");      // 각 학생의 과목별 점수 출력
				
				total[j] += score[i][j]; 						// 각 학생의 점수를 과목별로 합산
			}
			
			System.out.print(sum + "\t");   					     // 총점 출력
			System.out.print(sum/(score[i].length));				 // 평균 계산 및 출력
			
			System.out.println();										 // 각 학생의 세부내용 작성이 끝났으면 대행
		}
		
		System.out.println("=====================");  // 학생별 입력사항 끝
		
		// 총합 출력
		for (int j = 0; j < total.length; j++) {
			System.out.print("\t" + total[j]);
		}
		System.out.println();
		
		// 평균 출력
		for (int j = 0; j < total.length; j++) {
			System.out.print("\t" + total[j]/score.length);
			}
	
		// 총합에 평균을 합쳐버리면 교차되어 나온다!!!
	}
}