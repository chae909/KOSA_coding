package kosa.basic;

public class ForExam01 {

	public static void main(String[] args) {

		int sum = 0;

		// �ʱ��; ���ǽ�; ������
		for (int i = 1; i <= 10; i++) {
			sum += 1;
		}
		System.out.println("1~10���� ��" + sum);

		// 1~100���� ���� �� 2�� ����� 3�� ����� �ƴ� ���ڸ� ����Ͻÿ�
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 & i % 3 != 0)
				System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue; // pass�ϰ� ������
			
			System.out.print(i + ", ");
		}
	}
}
