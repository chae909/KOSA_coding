package kosa.mission;

import java.util.Scanner;

public class Mission02_4 {
	
	public static void average(int arr[]) {
		arr[4] = arr[3] / 3;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String subject[] = {"����", "����", "����"}; // ������� ���� �迭
		int scores[] = new int[5]; // ���ο� �迭
		
		for (int i=0; i<3; i++) {
			System.out.print(subject[i] + "�Է�: "); // ����� �迭 ������� "~�Է�: "���
			scores[i] = sc.nextInt(); // scores 0~2��° ĭ���� ������� ������ �־���
			scores[3] += scores[i]; // ���� ��� -> scores 3��° ĭ�� �������� ��� ������
		}
		
		average(scores); // ��� ���
		
		// ��� layout (\t�� �ϸ� tap��ŭ �������)
		System.out.println("���� \t���� \t ���� \t ���� \t���");
		for (int n : scores) {
			System.out.print(n + "\t");
		}
	}
}
