package kosa.mission;

import java.util.Scanner;

public class Mission03_2 {

	public static void main(String[] args) {
		// ������ �������� ���ؼ� ��ü �ڸ��� �� ¦��, Ȧ���� ������ ������
		// 5�ڸ��� ex)12345
		// ¦���� ����: 2��
		// Ȧ���� ����: 3��

		Scanner sc = new Scanner(System.in);
		System.out.print("�ټ��ڸ� ���ڸ� �Է��Ͻÿ�: ");
		int num = sc.nextInt();
		
		int jjack = 0;
		int hol = 0;
		
		jjack += (num/10000%2 ==0) ? 1:0;
		jjack += (num/1000%10%2 ==0) ? 1:0;
		jjack += (num/100%10%2 ==0) ? 1:0;
		jjack += (num/10%10%2 ==0) ? 1:0;
		jjack += (num%2 ==0) ? 1:0;
		
		hol = 5 - jjack;
		
        System.out.println("¦���� ����: " + jjack + "��");
        System.out.println("Ȧ���� ����: " + hol + "��");
		
	}

}
