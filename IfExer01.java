package kosa.basic;

import java.util.Scanner;

public class IfExer01 {

	public static void main(String[] args) {
		// if���� Ȱ���� ���� 3��
		// ������������� �˷��ֱ�
		// 3. mission2���� ����� ��������� ������ ����� ��������

		Scanner sc = new Scanner(System.in);

		System.out.print("���������� ���� �Է�: ");
		int num = sc.nextInt();
		System.out.print("������ ���� �Է�: ");
		int divisor = sc.nextInt();

		int quo = num / divisor;
		int rem = num % divisor;

		if (num % divisor == 0)
			System.out.println(quo + "�� ����������ϴ�. ");
		else
			System.out.println("����������� �ʽ��ϴ�. ���� " + quo + ", �������� " + rem + "�Դϴ�. ");

	}

}
