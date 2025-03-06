package kosa.phone;

import java.util.Scanner;

// ��ȭ��ȣ�� ����
public class Manager {
	// ȸ�� ��ü���� ���� (�߰�, ���, �˻� ...)

	// ���� �������� PhoneInfo ��ü�� ����
	private PhoneInfo arr[];
	private int count = 0;
//	private Scanner sc;

	public Manager() {
		arr = new PhoneInfo[10];
//		sc = new Scanner(System.in);
	}

	// ȸ�� ��ü �߰�
	public void addPhoneInfo() {
		// 1. �Ϲ� 2. ��â 3. ����
		// 1. PhoneInfo 2. Universe 3. Company
		System.out.println("1. �Ϲ� 2. ��â 3. ����");
		System.out.print("����� ��ȭ��ȣ�� ī�װ� ��ȣ�� �Է��ϼ��� :  ");
		int menu = Integer.parseInt(DataInput.sc.nextLine());
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String number = DataInput.sc.nextLine();
		System.out.print("�������: ");
		String birth = DataInput.sc.nextLine();

		if (menu == 1) {
			// ��ü ����, �迭�� �ʱ�ȭ
			arr[count++] = new PhoneInfo(name, number, birth);
			System.out.println("�Ϲ� ī�װ��� ��ȭ��ȣ�� ��ϵƽ��ϴ�. ");
		}

		else if (menu == 2) {
			System.out.print("����: ");
			String major = DataInput.sc.nextLine();
			System.out.print("�й�: ");
			String year = DataInput.sc.nextLine();
			arr[count++] = new Universe(name, number, birth, major, year);
			System.out.println("���� ī�װ��� ��ȭ��ȣ�� ��ϵƽ��ϴ�. ");
		}

		else if (menu == 3) {
			System.out.print("�μ�: ");
			String dept = DataInput.sc.nextLine();
			System.out.print("����: ");
			String position = DataInput.sc.nextLine();
			arr[count++] = new Company(name, number, birth, dept, position);
			System.out.println("���� ī�װ��� ��ȭ��ȣ�� ��ϵƽ��ϴ�. ");
		}
	}

	// ȸ����� ��ü ���
	public void listPhoneInfo() {
		// 1. ��ü 2. ��â 3. ����
		// 1. PhoneInfo 2. Universe 3. Company
		System.out.println("1. ��ü 2. ��â 3. ����");
		System.out.print("����� ��ȭ��ȣ�� ī�װ� ��ȣ�� �Է��ϼ��� :  ");
		int menu = Integer.parseInt(DataInput.sc.nextLine());
		System.out.println("** ��� **");
		for (int i = 0; i < count; i++) {
			if (menu == 1) {
				if (arr[i] instanceof PhoneInfo) {
				arr[i].show();
				}
			}
			else if (menu == 2) {
				if (arr[i] instanceof Universe) {
					arr[i].show();
				}}
				else if (menu == 3) {
					if (arr[i] instanceof Company) {
						arr[i].show();
					}
			}}
	}

	// ȸ�� �˻�
	// �ش��ϴ� �̸��� ��ġ�ϴ� ��ü�� ���� ���
	// ���� ��� ���
	public void searchPhoneInfo() {
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1; // �ش��ϴ� ���� ã�������� idx = 1, �ƴҶ��� -1

		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())) {
				idx = 1;
				arr[i].show();
			} else if (idx == -1) {
				System.out.println("��ġ�ϴ� �̸��� �����ϴ�. ");
			}
		}
	}
}
