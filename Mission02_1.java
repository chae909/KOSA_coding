package kosa.mission;

import java.util.Scanner;

public class Mission02_1 {
	
	// ������ ���ϴ� �޼���
	public static int total(int kor, int eng, int math) {
		int total = kor + eng + math;
		return total;
	}
	
	// ����� ���ϴ� �޼���
	public static double aver(int total) {
		double aver = total / 3.0;
		return aver;
	}

	public static void main(String[] args) {
		// �������� ����
		// ����, ����, ���� ������ Ű����� �Է¹ް�
		// ������ ����� ��� (����� �Ǽ���)

		Scanner sc = new Scanner(System.in);

		System.out.print("���� ���� �Է�: ");
		int kor = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int eng = sc.nextInt();
		System.out.print("���� ���� �Է�: ");
		int math = sc.nextInt();

//		int total = kor + eng + math;
//		float aver = (float)total / 3;
//		// �⺻ ���ͷ��� �Ҽ����̸� �ڵ����� �ǹǷ� ������ ���� ����� �����ϴ�. 
//		// float aver = (float)total / 3.0;
//		// ������ aver�� �ڷ����� double�� �ȴٴ���!
		
		int val = total(kor, eng, math);
		
		System.out.println("����: " + val + "��");
		System.out.printf("���: %.2f%n", aver(val), "��");

	}

}
