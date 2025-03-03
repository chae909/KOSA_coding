package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// 메뉴를 선택해서 해당 메뉴에 대한 명령문을 실행해보자
		// 4번 메뉴를 선택할때까지 계속해서 반복되도록 하자 -> return;
		// 1. 추가 2. 출력 3. 검색 4. 종료

		Scanner sc = new Scanner(System.in);

		int num;

		
		
		
		// do~while문을 이용해서 사용자가 4번을 입력할때까지 계속해서 메뉴를 띄우도록
//		do {
//			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
//			System.out.print("위에서 원하는 메뉴의 번호를 입력하세요: ");
//			num = sc.nextInt(); // 사용자가 입력하는 메뉴의 번호
//			
//			System.out.println(num + "번 메뉴를 선택하셨습니다. ");
//		} while (num != 4);

		
		
		
		/*
		do {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			System.out.print("위에서 원하는 메뉴의 번호를 입력하세요: ");
			num = sc.nextInt(); // 사용자가 입력하는 메뉴의 번호
			switch (num) {
			case 1:
				// 추가 기능 처리
				System.out.println("추가 기능이 선택되었습니다.");
				System.out.println();
				break;
			case 2:
				// 출력 기능 처리
				System.out.println("출력 기능이 선택되었습니다.");
				System.out.println();
				break;
			case 3:
				// 검색 기능 처리
				System.out.println("검색 기능이 선택되었습니다.");
				System.out.println();
				break;
			case 4:
				// 종료
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break;
			}
		} while (num != 4);
*/
		
		
		
		
//		while (true) {
//			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
//			System.out.print("입력: ");
//			String menu = sc.nextLine();
//			
//			switch (menu) {
//			case "1":
//				// 추가 기능 처리
//				System.out.println("추가 메뉴");
//				System.out.println();
//				break;
//			case "2":
//				// 출력 기능 처리
//				System.out.println("출력 메뉴");
//				System.out.println();
//				break;
//			case "3":
//				// 검색 기능 처리
//				System.out.println("검색 메뉴");
//				System.out.println();
//				break;
//			case "4":
//				// 종료
//				System.out.println("프로그램 종료");
//				System.out.println();
//				return;
//			}
//		}
		
		
		
		
		// do~while문 안에 switch를 넣어서 번호대로 출력이 다르게 나오도록
		while (true) {
			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			System.out.print("위에서 원하는 메뉴의 번호를 입력하세요: ");
			num = sc.nextInt(); // 사용자가 입력하는 메뉴의 번호
			
			switch (num) {
			case 1:
				// 추가 기능 처리
				System.out.println("추가 기능이 선택되었습니다.");
				System.out.println(); // 가독성을 위해 한줄 띄움 추가
				break;
			case 2:
				// 출력 기능 처리
				System.out.println("출력 기능이 선택되었습니다.");
				System.out.println();
				break;
			case 3:
				// 검색 기능 처리
				System.out.println("검색 기능이 선택되었습니다.");
				System.out.println();
				break;
			case 4:
				// 종료
				System.out.println("프로그램을 종료합니다.");
				System.out.println();
				break;
			}
		}

	}
}

