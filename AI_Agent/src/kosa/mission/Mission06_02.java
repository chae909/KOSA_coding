package kosa.mission;

import java.util.Scanner;

public class Mission06_02 {

	public static void main(String[] args) {
		
		String m_id = "kosa";
		String m_pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = sc.nextLine();
		System.out.print("비밀번호: ");
		String pass = sc.nextLine();
		
		// trim()은 앞뒤의 공백문자를 제거해준다
		if (id.trim().equals(m_id) && pass.trim().equals(m_pw)) {
			System.out.println("로그인 성공");
		} else {
			if (!id.equals(m_id)) {
				System.out.println("해당 아이디가 존재하지 않습니다.");
			} else {
				System.out.println("해당 비밀번호가 일치하지 않습니다.");
			}
		}
	}
}
