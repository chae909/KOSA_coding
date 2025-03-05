package kosa.mission;

import java.util.Scanner;

public class Mission07_01 {

	// ���� Exception ����
	public static void outRange(int a) throws Exception {
		if (a > 100 || a < 0) {
			throw new Exception("���� �̿��� ���� �Է��߽��ϴ�. ");
		}
	}

	public static void main(String[] args) {
		// UpDown����
		// ����(����) 1�� ����: 1~100
		// Ű����κ��� ���� �Է¹��� (1~100)
		// ������ ����� ���� �Է¹޾����� Exception
		// �Է��� ���ڿ� ������ ��
		// ���� -> "�����մϴ�. ~������ ����", ���α׷� ����
		// ���� -> "Up" or "Down" ���

		// ����(����) 1�� ����: 1~100
		int ans = (int) (Math.random() * 100) + 1;

		// ������� �õ�Ƚ��
		int count = 0;

		while (true) {
			try {
				// Ű����κ��� ���� �Է¹��� (1~100)
				System.out.print("���� �Է�: ");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				++count;

				outRange(num); // ������ ����� ���� �Է¹޾����� Exception

				if (num == ans) {
					System.out.print("�����մϴ�. " + count + "������ ����");
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
				System.out.println("���� �̿��� ���Դϴ�. 1~100�� ���ڸ� �Է����ּ��� ");
				e.printStackTrace();
			} finally { // ������ ����
				System.out.println(".");
			}

		}

	}
}
