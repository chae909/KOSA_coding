package kosa.mission;

import java.util.Scanner;

public class Mission06 {

	public static void main(String[] args) {
		// �α��� ����
		// ���� m_id, m_pw ��� ��ġ�ϸ� -> �α��� ���� �޼���
		// id ����ġ -> �ش� ���̵� �������� �ʽ��ϴ�
		// pw ����ġ -> �ش� ��й�ȣ�� ��ġ���� �ʽ��ϴ�

		String m_id = "kosa";
		String m_pw = "1234";

		// id �Է�
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("ID �Է�: ");
			String id = sc.nextLine();

			if (id.equals(m_id)) {
				break;
			} else {
				System.out.println("�ش� ���̵� �������� �ʽ��ϴ�");
			}
		}

		// pw �Է�
		while (true) {
			System.out.print("PW �Է�: ");
			String pw = sc.nextLine();

			if (pw.equals(m_pw)) {
				System.out.print("�α��� ����");
				break;
			} else {
				System.out.println("�ش� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
			}
		}

	}

}
