package kosa.basic;

import java.util.Scanner;

public class IfExer02 {
	// if문을 활용한 예제 3개
	// 평균보다 키가 큰지 알려줌

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("키 입력: ");
		double h = Integer.parseInt(sc.nextLine());
		System.out.print("성별 입력: ");
		String sex = sc.nextLine();

		double womenH = 160.0;
		double menH = 173.5;

		if (sex.equals("여"))
			if (h > womenH)
				System.out.println("여자 평균보다 큽니다. ");
			else if (h == womenH)
				System.out.println("여자 평균입니다. ");
			else
				System.out.println("여자 평균보다 작습니다. ");
		else 
			if (h > menH)
			System.out.println("남자 평균보다 큽니다. ");
			else if (h == menH)
			System.out.println("남자 평균입니다. ");
			else
			System.out.println("남자 평균보다 작습니다. ");

	}

}
