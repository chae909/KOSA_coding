package kosa.mission;

import java.util.Scanner;

public class Mission04 {

	public static void main(String[] args) {
		// �޴��� �����ؼ� �ش� �޴��� ���� ��ɹ��� �����غ���
		// 4�� �޴��� �����Ҷ����� ����ؼ� �ݺ��ǵ��� ���� -> return;
		// 1. �߰� 2. ��� 3. �˻� 4. ����

		Scanner sc = new Scanner(System.in);

		int num;

		
		
		
		// do~while���� �̿��ؼ� ����ڰ� 4���� �Է��Ҷ����� ����ؼ� �޴��� ��쵵��
//		do {
//			System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
//			System.out.print("������ ���ϴ� �޴��� ��ȣ�� �Է��ϼ���: ");
//			num = sc.nextInt(); // ����ڰ� �Է��ϴ� �޴��� ��ȣ
//			
//			System.out.println(num + "�� �޴��� �����ϼ̽��ϴ�. ");
//		} while (num != 4);

		
		
		
		/*
		do {
			System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
			System.out.print("������ ���ϴ� �޴��� ��ȣ�� �Է��ϼ���: ");
			num = sc.nextInt(); // ����ڰ� �Է��ϴ� �޴��� ��ȣ
			switch (num) {
			case 1:
				// �߰� ��� ó��
				System.out.println("�߰� ����� ���õǾ����ϴ�.");
				System.out.println();
				break;
			case 2:
				// ��� ��� ó��
				System.out.println("��� ����� ���õǾ����ϴ�.");
				System.out.println();
				break;
			case 3:
				// �˻� ��� ó��
				System.out.println("�˻� ����� ���õǾ����ϴ�.");
				System.out.println();
				break;
			case 4:
				// ����
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				break;
			}
		} while (num != 4);
*/
		
		
		
		
//		while (true) {
//			System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
//			System.out.print("�Է�: ");
//			String menu = sc.nextLine();
//			
//			switch (menu) {
//			case "1":
//				// �߰� ��� ó��
//				System.out.println("�߰� �޴�");
//				System.out.println();
//				break;
//			case "2":
//				// ��� ��� ó��
//				System.out.println("��� �޴�");
//				System.out.println();
//				break;
//			case "3":
//				// �˻� ��� ó��
//				System.out.println("�˻� �޴�");
//				System.out.println();
//				break;
//			case "4":
//				// ����
//				System.out.println("���α׷� ����");
//				System.out.println();
//				return;
//			}
//		}
		
		
		
		
		// do~while�� �ȿ� switch�� �־ ��ȣ��� ����� �ٸ��� ��������
		while (true) {
			System.out.println("1. �߰� 2. ��� 3. �˻� 4. ����");
			System.out.print("������ ���ϴ� �޴��� ��ȣ�� �Է��ϼ���: ");
			num = sc.nextInt(); // ����ڰ� �Է��ϴ� �޴��� ��ȣ
			
			switch (num) {
			case 1:
				// �߰� ��� ó��
				System.out.println("�߰� ����� ���õǾ����ϴ�.");
				System.out.println(); // �������� ���� ���� ��� �߰�
				break;
			case 2:
				// ��� ��� ó��
				System.out.println("��� ����� ���õǾ����ϴ�.");
				System.out.println();
				break;
			case 3:
				// �˻� ��� ó��
				System.out.println("�˻� ����� ���õǾ����ϴ�.");
				System.out.println();
				break;
			case 4:
				// ����
				System.out.println("���α׷��� �����մϴ�.");
				System.out.println();
				break;
			}
		}

	}
}

