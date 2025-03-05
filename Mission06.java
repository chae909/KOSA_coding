package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// 로그인 예제
		// 기존 m_id, m_pw 모두 일치하면 -> 로그인 성공 메세지
		// id 불일치 -> 해당 아이디가 존재하지 않습니다
		// pw 불일치 -> 해당 비밀번호가 일치하지 않습니다

		String m_id = "kosa";
		String m_pw = "1234";

		// id 입력
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ID 입력: ");
			String id = sc.nextLine();

			if (id.equals(m_id)) {
				break;
			} else {
				System.out.println("해당 아이디가 존재하지 않습니다");
			}
		}

		// pw 입력
		while (true) {
			System.out.print("PW 입력: ");
			String pw = sc.nextLine();

			if (pw.equals(m_pw)) {
				System.out.print("로그인 성공");
				break;
			} else {
				System.out.println("해당 비밀번호가 일치하지 않습니다");
			}
		}

	}

}
