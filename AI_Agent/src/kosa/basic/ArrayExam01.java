package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
//		// 1. 배열 선언, 생성 분리
//		int arr[]; //배열 선언(주소값을 담을 배열변수)
//		arr = new int[5]; //배열 생성(메모리 할당)
//		System.out.println(arr); //값을 넣지 않았을때는 주소값이 출력됨
//		
//		//2. 배열 선언, 생성 함께
//		int arr2[] = new int[5];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		System.out.println(arr2[0]);
//		
//		//3. 배열 선언, 생성, 초기화 함께
//		int arr3[] = {1,2,3,4,5};
//		
//		//배열에 있는 내용 출력
//		//for 초기식: 0
//		//for 조건식: 배열의 크기보다 -1
//		for (int i=0 ; i < arr3.length ; i++) {
//			System.out.println("arr["+i+"]=" + arr3[i]);
//		}
//			
//		// 향상된 for문
//		// 뒤쪽: 해당 배열
//		// 앞쪽: 배열 앞의 첫번째, 두번째, ... 배열의 마지막 요소까지 가져와줌
//		for (int n : arr3) {
//			System.out.print(n + ", ");
			
		
		//키보드로부터 문자열을 입력 받아 배열에 추가한 후 전체를 출력하자
		//"q"을 입력할때까지 계속해서 입력 받아 배열에 추가하도록 한다. 
		// ex) 입력: 홍길동
		// ex) 입력: 김길동
		// ex) 입력: q
		// ex) 출력: 홍길동, 김길동
			
		Scanner sc = new Scanner(System.in);

//		String arr[] = new String[10]; // 문자열이 들어갈수 있는 10칸짜리 배열 선언과 생성 동시
//		int index = 0; // 현재 입력된 이름의 개수
//
//		// 가족 구성원의 이름이 들어오면 이를 배열에 저장해야함
//		// q를 누를때까지 반복
//
//		while (true) {
//			System.out.print("가족구성원 이름 입력(종료하려면 q) : "); // 키보드로 입력받고
//			String name = sc.nextLine(); // name이라는 변수에 초기화 (무한루프)
//
//			if (name.equals("q"))
//				break; // 만약 q를 입력받았다면 무한반복 루프 탈출
//
//			arr[index] = name;
//            index++;
//            
//		}
//		System.out.print("입력된 가족 구성원: ");
//		for (int i = 0; i < index; i++) { // 입력된 개수만큼 출력
//			System.out.print(arr[i]+ " ");
		
		String sArr[] = new String[10];
		int count = 0;
		
		while (true) {
			System.out.print("입력: ");
			String str = sc.nextLine();
			
			if (str.contentEquals("q")) break;
			
			sArr[count++] = str; 
		}
		
		for (int i = 0; i<count; i++) {
				System.out.println(sArr[i] + " ");
		}

	}

}
