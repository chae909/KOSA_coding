package kosa.mission;

import java.util.Scanner;

public class Mission03_1 {

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
		
		while (num > 0) {
            int digit = num % 10;  // 1. �����ڸ� ���� ����
            
            if (digit % 2 == 0) {   // 2. Ȧ ¦ ī��Ʈ
                jjack++;
            } else {
                hol++;
            }
            
            num /= 10;  // 3. ī��Ʈ�� ��ģ �����ڸ� ���ڸ� 10���� ����� ����
        }
		
        System.out.println("¦���� ����: " + jjack + "��");
        System.out.println("Ȧ���� ����: " + hol + "��");
		
	}

}
