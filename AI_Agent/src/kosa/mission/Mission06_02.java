package kosa.mission;

import java.util.Scanner;

public class Mission06_02 {

	public static void main(String[] args) {
		
		String m_id = "kosa";
		String m_pw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵�: ");
		String id = sc.nextLine();
		System.out.print("��й�ȣ: ");
		String pass = sc.nextLine();
		
		// trim()�� �յ��� ���鹮�ڸ� �������ش�
		if (id.trim().equals(m_id) && pass.trim().equals(m_pw)) {
			System.out.println("�α��� ����");
		} else {
			if (!id.equals(m_id)) {
				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�.");
			} else {
				System.out.println("�ش� ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			}
		}
	}
}
