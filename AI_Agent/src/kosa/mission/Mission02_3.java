package kosa.mission;

import java.util.Scanner;

public class Mission02_3 {

	// ������ ����� ����ϴ� �޼���
	// �Ķ���ʹ� ���� ������ �ִ� �迭
	public static void cal(int arr[]) {
		int total = 0;
		for (int i = 0; i < 3; i++) {
			total += arr[i];
		}

		int aver = total / arr.length;

		System.out.println("����: " + total + ", ���: " + aver);
	}

	// ������� ������ �Է¹޴� �޼���
	public static void input(String str, int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print(str + "������ �Է��Ͻÿ�: ");
		// "�� �Է��Ͻÿ�"�� �߰��ؼ� ���

		for (int i = 0; i < 3; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static void main(String[] args) {
		int scores[] = new int[3]; // ������ ������ scores �迭 ���� (������, ũ�� 3)

		for (int i = 0; i < 3; i++) {
			input("����", scores);
			input("����", scores);
			input("����", scores);
		}

		// ��곻�� ���
		cal(scores);
	}
}