package kosa.phone;

import java.util.Scanner;

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
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String number = DataInput.sc.nextLine();
		System.out.print("�������: ");
		String birth = DataInput.sc.nextLine();

		// ��ü ����, �迭�� �ʱ�ȭ
		arr[count++] = new PhoneInfo(name, number, birth);
		System.out.println("��ȭ��ȣ�� ��ϵƽ��ϴ�. ");
	}

	// ȸ����� ��ü ���
	public void listPhoneInfo() {
		System.out.println("** ��ü��� **");
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	// ȸ�� �˻�
	// �ش��ϴ� �̸��� ��ġ�ϴ� ��ü�� ���� ���
	// ���� ��� ���
	public void searchPhoneInfo() {
		System.out.print("�̸�: ");
		String name = DataInput.sc.nextLine();
		int idx = -1; // �ش��ϴ� ���� ã�������� idx = 1, �ƴҶ��� -1
		
		for (int i = 0; i < count; i++) {
			if (name.equals(arr[i].getName())){
				arr[i].show();
				idx = 1;
			} else if (idx == -1) {
				System.out.println("��ġ�ϴ� �̸��� �����ϴ�. ");
			}
		}
	}
}
