package kosa.mission;

import java.util.Scanner;

public class Mission03_3 {

	public static void main(String[] args) {
		// 임의의 정수값에 대해서 전체 자리수 중 짝수, 홀수의 갯수를 구하자
		// 5자리수 ex)12345
		// 짝수의 갯수: 2개
		// 홀수의 갯수: 3개

		Scanner sc = new Scanner(System.in);
		System.out.print("다섯자리 숫자를 입력하시오: ");
		int num = sc.nextInt();
		
		int jjack = 0;
		int hol = 0;

		while (num > 0) {
            int digit = num % 10;  // 1. 일의자리 숫자 추출
            jjack += (digit % 2 == 0) ? 1:0;
            num /= 10;  // 3. 카운트를 마친 일의자리 숫자를 10으로 나누어서 제거
        }
		
		hol = 5 - jjack;
		
        System.out.println("짝수의 갯수: " + jjack + "개");
        System.out.println("홀수의 갯수: " + hol + "개");
		
	}

}
