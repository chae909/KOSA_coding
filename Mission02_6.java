package kosa.mission;

import java.util.Scanner;

public class Mission02_6 {

	
	
	
	public static void main(String[] args) {
		int score[][] = {    //[2][3]
				{90, 80, 70},
				{50, 40, 30}
		};
		
		int korTotal =0;
		int engTotal =0;
		int matTotal =0;
		int total[] = {korTotal, engTotal, matTotal};
		
		System.out.println("��ȣ  ����\t����\t����\t����\t���");
		
		for (int i=0; i<score.length; i++) { 					     // 1����(�л���)
			int sum =0;
			int avg =0;
			
			System.out.print((i+1) + "\t");     						 // ��ȣ ���
			
			for (int j=0; j<score[i].length; j++) {      // 2����(����)
				sum += score[i][j];							   // �� �л��� ���� ���� �ջ�
				System.out.print(score[i][j] + "\t");      // �� �л��� ���� ���� ���
				
				total[j] += score[i][j]; 						// �� �л��� ������ ���񺰷� �ջ�
			}
			
			System.out.print(sum + "\t");   					     // ���� ���
			System.out.print(sum/(score[i].length));				 // ��� ��� �� ���
			
			System.out.println();										 // �� �л��� ���γ��� �ۼ��� �������� ����
		}
		
		System.out.println("=====================");  // �л��� �Է»��� ��
		
		// ���� ���
		for (int j = 0; j < total.length; j++) {
			System.out.print("\t" + total[j]);
		}
		System.out.println();
		
		// ��� ���
		for (int j = 0; j < total.length; j++) {
			System.out.print("\t" + total[j]/score.length);
			}
	
		// ���տ� ����� ���Ĺ����� �����Ǿ� ���´�!!!
	}
}