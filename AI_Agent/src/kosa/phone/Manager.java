package kosa.phone;

import java.util.Scanner;

// 전화번호부 관리
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
		// 1. 일반 2. 동창 3. 직장
		// 1. PhoneInfo 2. Universe 3. Company
		System.out.println("1. 일반 2. 동창 3. 직장");
		System.out.print("등록할 전화번호의 카테고리 번호를 입력하세요 :  ");
		int menu = Integer.parseInt(DataInput.sc.nextLine());
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		System.out.print("전화번호: ");
		String number = DataInput.sc.nextLine();
		System.out.print("생년월일: ");
		String birth = DataInput.sc.nextLine();

		if (menu == 1) {
			// 객체 생성, 배열에 초기화
			arr[count++] = new PhoneInfo(name, number, birth);
			System.out.println("일반 카테고리에 전화번호가 등록됐습니다. ");
		}

		else if (menu == 2) {
			System.out.print("전공: ");
			String major = DataInput.sc.nextLine();
			System.out.print("학번: ");
			String year = DataInput.sc.nextLine();
			arr[count++] = new Universe(name, number, birth, major, year);
			System.out.println("동문 카테고리에 전화번호가 등록됐습니다. ");
		}

		else if (menu == 3) {
			System.out.print("부서: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("직급: ");
			String position = DataInput.sc.nextLine();
			arr[count++] = new Company(name, number, birth, dept, position);
			System.out.println("직장 카테고리에 전화번호가 등록됐습니다. ");
		}
	}

	// 회원목록 전체 출력
	public void listPhoneInfo() {
		// 1. 전체 2. 동창 3. 직장
		// 1. PhoneInfo 2. Universe 3. Company
		System.out.println("1. 전체 2. 동창 3. 직장");
		System.out.print("출력할 전화번호의 카테고리 번호를 입력하세요 :  ");
		int menu = Integer.parseInt(DataInput.sc.nextLine());
		System.out.println("** 목록 **");
		for (int i = 0; i < count; i++) {
			if (menu == 1) {
				if (arr[i] instanceof PhoneInfo) {
				arr[i].show();
				}
			}
			else if (menu == 2) {
				if (arr[i] instanceof Universe) {
					arr[i].show();
				}}
				else if (menu == 3) {
					if (arr[i] instanceof Company) {
						arr[i].show();
					}
			}}
	}

	// 회원 검색
	// 해당하는 이름과 일치하는 객체의 내용 출력
	// 없는 경우 출력
	public void searchPhoneInfo() {
		System.out.print("이름: ");
		String name = DataInput.sc.nextLine();
		int idx = -1; // 해당하는 값을 찾았을때는 idx = 1, 아닐때는 -1

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				idx = 1;
				arr[i].show();
			} else if (idx == -1) {
				System.out.println("일치하는 이름이 없습니다. ");
			}
		}
	}
}
