package kosa.basic;

import java.util.Scanner;

public class DowhileExam {

	public static void main(String[] args) {
		// do~while

		Scanner sc = new Scanner(System.in);

//		int n = 0;
//		
//		do {
//			System.out.print("�Է�: ");
//			n = sc.nextInt();
//		} while (n<0);   // while���� ������Բ� �Ѵ� (����� ���� ����������)
//		
//		System.out.println("�Է°��: " + n);

		// ����> ������ ���� 3���� �޾Ƽ� ���� ��ø���� �ʵ��� ���

		int a, b, c;

		// do-while���� �̿��� 3���� ������ ��� �ٸ� ������ �ݺ�
		do {
			// ���� �ʱ�ȭ
			a = (int) (Math.random() * 9) + 1;
			b = (int) (Math.random() * 9) + 1;
			c = (int) (Math.random() * 9) + 1;
		} while (a == b || b == c || c == a); // 3���� ���� ��� �ٸ� ������ �ݺ�

		// ���
		System.out.println(a + ", " + b + ", " + c);
	}
}
