package kosa.mission;

import java.util.Scanner;

public class Mission01 {

	public static void main(String[] args) {
		// �̸�, ����, �ּҸ� Ű����κ��� �Է¹޾� ������ �ʱ�ȭ �� ����ϱ�
		// ��°�� > �̸�: ȫ�浿
		//				����: 24
		//				�ּ�: ����� ���ĵ� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� �Է�: ");
		String name = sc.nextLine();
		
		System.out.print("���� �Է�: ");
		int age = Integer.parseInt(sc.nextLine());
		
		System.out.print("�ּ� �Է�: ");
		String addr = sc.nextLine();
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + age);
		System.out.println("�ּ�: " + addr);

	}

}
