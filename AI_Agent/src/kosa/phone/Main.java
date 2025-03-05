package kosa.phone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 회원에 대한 정보를 추가, 삭제
		
//		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		
		while(true) {
			// 매니저 객체 생성 
			// (Main에서 넣을 값이 없기 때문에 디폴트 연산자로 충분)
			System.out.println("1. 추가 2. 출력 3. 검색 4. 종료");
			System.out.print("메뉴입력: ");
			String menu = DataInput.sc.nextLine();
			
			// switch문을 간략하게 하기 위해 새로운 method 생성
			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				System.out.println("프로그램 종료");
				return; // return사용도 문제 없다
			}
		}
	}
}
