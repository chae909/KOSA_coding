package kosa.basic;

import java.util.Scanner;

public class IfExer03 {

	public static void main(String[] args) {
		// if���� Ȱ���� ���� 3��
		// mission2���� ����� ��������� ������ ����� ��������

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		float aver = (float) total / 3;
		// �⺻ ���ͷ��� �Ҽ����̸� �ڵ����� �ǹǷ� ������ ���� ����� �����ϴ�.
		// float aver = (float)total / 3.0;
		// ������ aver�� �ڷ����� double�� �ȴٴ���!

		String level;

		if (aver >= 90)
			level = "A";
		else if (aver >= 80)
			level = "B";
		else if (aver >= 70)
			level = "C";
		else if (aver >= 60)
			level = "D";
		else
			level = "F";

		System.out.println("����: " + total + "��");
		System.out.println("���: " + aver + "��");
		System.out.println("����: " + level);
	}

}
