package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		
		System.out.println("첫번째");
		System.out.println("두번째");
		// 한줄로 나열
		
		System.out.print("1, ");
		System.out.print("2, ");
		System.out.println();  // 줄띄움
		System.out.println("4, ");
		// 옆으로 나열
		
		// Scanner 사용
		// System.in 으로 키보드 입력 받음
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		System.out.print("문자 입력: ");
		String str = sc.nextLine();
		// 오류발생-Enter을 문자열로 인식했기 때문이다 */
		
		/*
		솔루션1
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("문자 입력: ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
		*/
		
		// 솔루션2
		System.out.print("정수 입력: ");
		int num = Integer.parseInt(sc.nextLine()); // 100(문자열을 정수형으로 형변환)
		System.out.print("문자 입력: ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
	}

}
