package kosa.basic;

import java.util.Scanner;

public class MethodExam {
	
//	public static void print() {
//		System.out.println("Hello0!!!");
//		System.out.println("Hello1!!!");
//		System.out.println("Hello2!!!");
//	}
//	// �Լ�(method) ���� -> �ߺ��Ǵ� �ڵ� �ּ�ȭ
//
//	public static void main(String[] args) {
//		// ȣ��
//		print();
//
//	}
	
	// �޼��� ����
	// ����������, (static), ������(void), �޼����̸�(�Ķ����)
	public static void printCharacter(char ch, int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public static int add(int num1, int num2) {
		int sum = num1 + num2; // �������� sum
		return sum;
	}

	public static void main(String[] args) {
		// ȣ��
//		printCharacter('#', 10);
//		printCharacter('@', 10);
//		printCharacter('-', 10);
		int result = add(1,2); // ���ϰ��� �ֱ⶧���� ������ �Ҵ��� �� ����
		System.out.println(result);
		
		System.out.println("���: " + add(2,5));
	}
}
