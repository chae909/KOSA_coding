package kosa.basic;

import java.util.Scanner;

public class ArrayExam01 {

	public static void main(String[] args) {
//		// 1. �迭 ����, ���� �и�
//		int arr[]; //�迭 ����(�ּҰ��� ���� �迭����)
//		arr = new int[5]; //�迭 ����(�޸� �Ҵ�)
//		System.out.println(arr); //���� ���� �ʾ������� �ּҰ��� ��µ�
//		
//		//2. �迭 ����, ���� �Բ�
//		int arr2[] = new int[5];
//		arr2[0] = 10;
//		arr2[1] = 20;
//		System.out.println(arr2[0]);
//		
//		//3. �迭 ����, ����, �ʱ�ȭ �Բ�
//		int arr3[] = {1,2,3,4,5};
//		
//		//�迭�� �ִ� ���� ���
//		//for �ʱ��: 0
//		//for ���ǽ�: �迭�� ũ�⺸�� -1
//		for (int i=0 ; i < arr3.length ; i++) {
//			System.out.println("arr["+i+"]=" + arr3[i]);
//		}
//			
//		// ���� for��
//		// ����: �ش� �迭
//		// ����: �迭 ���� ù��°, �ι�°, ... �迭�� ������ ��ұ��� ��������
//		for (int n : arr3) {
//			System.out.print(n + ", ");
			
		
		//Ű����κ��� ���ڿ��� �Է� �޾� �迭�� �߰��� �� ��ü�� �������
		//"q"�� �Է��Ҷ����� ����ؼ� �Է� �޾� �迭�� �߰��ϵ��� �Ѵ�. 
		// ex) �Է�: ȫ�浿
		// ex) �Է�: ��浿
		// ex) �Է�: q
		// ex) ���: ȫ�浿, ��浿
			
		Scanner sc = new Scanner(System.in);

//		String arr[] = new String[10]; // ���ڿ��� ���� �ִ� 10ĭ¥�� �迭 ����� ���� ����
//		int index = 0; // ���� �Էµ� �̸��� ����
//
//		// ���� �������� �̸��� ������ �̸� �迭�� �����ؾ���
//		// q�� ���������� �ݺ�
//
//		while (true) {
//			System.out.print("���������� �̸� �Է�(�����Ϸ��� q) : "); // Ű����� �Է¹ް�
//			String name = sc.nextLine(); // name�̶�� ������ �ʱ�ȭ (���ѷ���)
//
//			if (name.equals("q"))
//				break; // ���� q�� �Է¹޾Ҵٸ� ���ѹݺ� ���� Ż��
//
//			arr[index] = name;
//            index++;
//            
//		}
//		System.out.print("�Էµ� ���� ������: ");
//		for (int i = 0; i < index; i++) { // �Էµ� ������ŭ ���
//			System.out.print(arr[i]+ " ");
		
		String sArr[] = new String[10];
		int count = 0;
		
		while (true) {
			System.out.print("�Է�: ");
			String str = sc.nextLine();
			
			if (str.contentEquals("q")) break;
			
			sArr[count++] = str; 
		}
		
		for (int i = 0; i<count; i++) {
				System.out.println(sArr[i] + " ");
		}

	}

}
