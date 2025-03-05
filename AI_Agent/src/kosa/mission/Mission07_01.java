package kosa.mission;

import java.util.Scanner;

public class Mission07_01 {

	// 범위 Exception 생성
	public static void outRange(int a) throws Exception {
		if (a > 100 || a < 0) {
			throw new Exception("범위 이외의 값을 입력했습니다. ");
		}
	}

	public static void main(String[] args) {
		// UpDown게임
		// 난수(정답) 1개 생성: 1~100
		// 키보드로부터 정수 입력받음 (1~100)
		// 범위에 벗어나는 값을 입력받았을때 Exception
		// 입력한 숫자와 난수를 비교
		// 정답 -> "축하합니다. ~번만에 성공", 프로그램 종료
		// 오답 -> "Up" or "Down" 출력

		// 난수(정답) 1개 생성: 1~100
		int ans = (int) (Math.random() * 100) + 1;

		// 사용자의 시도횟수
		int count = 0;

		while (true) {
			try {
				// 키보드로부터 정수 입력받음 (1~100)
				System.out.print("숫자 입력: ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				++count;

				outRange(num); // 범위에 벗어나는 값을 입력받았을때 Exception

				if (num == ans) {
					System.out.print("축하합니다. " + count + "번만에 성공");
					break;
				} else {
					if (num > ans) {
						System.out.print("Down");
					} else {
						System.out.print("Up");
					}
				}
			}

			catch (Exception e) {
				System.out.println("범위 이외의 값입니다. 1~100의 숫자를 입력해주세요 ");
				e.printStackTrace();
			} finally { // 무조건 실행
				System.out.println(".");
			}

		}

	}
}
