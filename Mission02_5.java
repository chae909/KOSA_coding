package kosa.mission;

import java.util.Scanner;

public class Mission02_5 {

//	public static void average(int arr[]) {
//		arr[4] = arr[3] / 3;
//	}
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		String subject[] = { "����", "����", "����" }; // ������� ���� �迭
//		int scores[] = new int[5]; // ���ο� �迭
//
//		for (int i = 0; i < 3; i++) {
//			System.out.print(subject[i] + "�Է�: "); // ����� �迭 ������� "~�Է�: "���
//			scores[i] = sc.nextInt(); // scores 0~2��° ĭ���� ������� ������ �־���
//			scores[3] += scores[i]; // ���� ��� -> scores 3��° ĭ�� �������� ��� ������
//		}
//
//		average(scores); // ��� ���
//
//		// ��� layout (\t�� �ϸ� tap��ŭ �������)
//		System.out.println("���� \t���� \t ���� \t ���� \t���");
//		for (int n : scores) {
//			System.out.print(n + "\t");
//		}
//	}
	
	// �����������α׷����� �������� ���������� �����غ���
	// 1�� ���� ����: ����, ����, ����, ����, ��� -> int arr[] = new int[5];
	// 10�� -> int arr[][] = new int[10][5]
	// ��ȣ 	���� 	���� 	���� 	���� 	���
	// 1 		90		90		70 	240 	80
	// 2 		50 	40 	30 	120 	40
	// =====================
	// 			140	120	100   (���� ����)
	// 			70 	60 	50     (���� ���)	
	
	
	public static void main(String[] args) {
		int score[][] = {    //[2][3]
				{90, 80, 70},
				{50, 40, 30}
		};
		
		int korTotal =0;
		int engTotal =0;
		int matTotal =0;
		
		System.out.println("��ȣ  ����\t����\t����\t����\t���");
		
		for (int i=0; i<score.length; i++) {    // 1����(�л���)
			int sum =0;
			int avg =0;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			matTotal += score[i][2];
			
			System.out.print((i+1) + "\t");      // ��ȣ ���
			
			for (int j=0; j<score[i].length; j++) {      // 2����(����)
				sum += score[i][j];							   // �� �л��� ���� ���� �ջ�
				System.out.print(score[i][j] + "\t");      // �� �л��� ���� ���� ���
			}
			
			System.out.print(sum + "\t");   					     // ���� ���
			System.out.print(sum/(score[i].length));				 // ��� ��� �� ���
			
			System.out.println();										 // �� �л��� ���γ��� �ۼ��� �������� ����			
		}
		System.out.println("=====================");  // �л��� �Է»��� ��
		
		System.out.print("\t" + korTotal);
		System.out.print("\t" + engTotal);
		System.out.print("\t" + matTotal);
		System.out.println();
		
		System.out.print("\t" + korTotal/score.length);
		System.out.print("\t" + engTotal/score.length);
		System.out.print("\t" + matTotal/score.length);
		
//		int korTotal =0;
//		int engTotal =0;
//		int matTotal =0;
//		int total[] = {korTotal, engTotal, matTotal};
//
//		
//        for (int i = 0; i < score.length; i++) { // �� �л���
//            for (int j = 0; j < score[i].length; j++) { // ���� ������
//                total[j] += score[i][j]; // ���� �ջ�
//            }
//        }
//        
//        // ���� ���
//        for (int j = 0; j < total.length; j++) {
//            System.out.print("\t" + total[j]);
//        }
		

		
		
	}

}
