package kosa.basic;

import java.util.Scanner;

public class IfExer02 {
	// if���� Ȱ���� ���� 3��
	// ��պ��� Ű�� ū�� �˷���

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Ű �Է�: ");
		double h = Integer.parseInt(sc.nextLine());
		System.out.print("���� �Է�: ");
		String sex = sc.nextLine();

		double womenH = 160.0;
		double menH = 173.5;

		if (sex.equals("��"))
			if (h > womenH)
				System.out.println("���� ��պ��� Ů�ϴ�. ");
			else if (h == womenH)
				System.out.println("���� ����Դϴ�. ");
			else
				System.out.println("���� ��պ��� �۽��ϴ�. ");
		else 
			if (h > menH)
			System.out.println("���� ��պ��� Ů�ϴ�. ");
			else if (h == menH)
			System.out.println("���� ����Դϴ�. ");
			else
			System.out.println("���� ��պ��� �۽��ϴ�. ");

	}

}
