package kosa.basic;

import java.util.Scanner;

public class SwitchExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 햄버거 2. 콜라 3. 피자 4. 치킨");
		System.out.print("메뉴선택: ");
		int menu = sc.nextInt();
		
		// 케이스가 정해져있는 경우에만 switch를 사용한다. 
		
		switch (menu) {
		case 1:
			System.out.println("햄버거 선택");
			break;
		case 2:
			System.out.println("콜라 선택");
			break;
		case 3:
			System.out.println("피자 선택");
			break;
		case 4:
			System.out.println("치킨 선택");
			break;

		default:
			System.out.println("메뉴를 다시 골라주세요. ");
			break;
		}

	}

}
