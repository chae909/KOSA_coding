package kosa.mission;

import java.util.Scanner;

public class Mission02_2 {
	
	public static double aver(int total) {
		double aver = total / 3.0;
		return aver;
	}

	public static void main(String[] args) {
		// ����, ����, ���� -> Ű���� �Է¹޾� �迭�� �����غ���
		// ��� -> �޼��� ���� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ������ �Է��Ͻÿ�. : ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�. : ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�. : ");
		int math = sc.nextInt();
		// Ű���� �Է¹ޱ�
		
		int arr[] = {kor, eng, math};
		// �迭 ����, ����, �ʱ�ȭ ���ÿ�
		
		int total = arr[0] + arr[1] + arr[2];
		
		System.out.println("����: " + total);
		System.out.printf("���: %.2f%n", aver(total));
	}
}
