package kosa.basic;

import java.util.Scanner;

public class VariableExam02 {

	public static void main(String[] args) {
		
		System.out.println("ù��°");
		System.out.println("�ι�°");
		// ���ٷ� ����
		
		System.out.print("1, ");
		System.out.print("2, ");
		System.out.println();  // �ٶ��
		System.out.println("4, ");
		// ������ ����
		
		// Scanner ���
		// System.in ���� Ű���� �Է� ����
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		System.out.print("���� �Է�: ");
		String str = sc.nextLine();
		// �����߻�-Enter�� ���ڿ��� �ν��߱� �����̴� */
		
		/*
		�ַ��1
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("���� �Է�: ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
		*/
		
		// �ַ��2
		System.out.print("���� �Է�: ");
		int num = Integer.parseInt(sc.nextLine()); // 100(���ڿ��� ���������� ����ȯ)
		System.out.print("���� �Է�: ");
		String str = sc.nextLine();
		
		System.out.println(num);
		System.out.println(str);
	}

}
