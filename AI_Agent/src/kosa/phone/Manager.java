package kosa.phone;

import java.util.Scanner;

public class Manager {
	// 회원 객체들을 관리 (추가, 출력, 검색 ...)

	// 따라서 여러개의 PhoneInfo 객체를 선언
	private PhoneInfo arr[];
	private int count = 0;
//	private Scanner sc;

	public Manager() {
		arr = new PhoneInfo[10];
//		sc = new Scanner(System.in);
	}

	// 회원 객체 추가
	public void addPhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String number = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();

		// 객체 생성, 배열에 초기화
		arr[count++] = new PhoneInfo(name, number, birth);
		System.out.println("전화번호가 등록됐습니다. ");
	}

	// 회원목록 전체 출력
	public void listPhoneInfo() {
		System.out.println("** 전체목록 **");
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	// 회원 검색
	// 해당하는 이름과 일치하는 객체의 내용 출력
	// 없는 경우 출력
	public void searchPhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1; // 해당하는 값을 찾았을때는 idx = 1, 아닐때는 -1
		
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())){
				arr[i].show();
				idx = 1;
			} else if (idx == -1) {
				System.out.println("일치하는 이름이 없습니다. ");
			}
		}
	}
}
