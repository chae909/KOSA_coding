package kosa.basic;

public class ArrayExam02 {

	public static void main(String[] args) {

		int arr3[][] = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8, 9 } };

		for (int i = 0; i < arr3.length; i++) { // arr3�� ���̸� ���
			for (int n = 0; n < arr3[i].length; n++) { // �� ���� ���̸� ���
				System.out.print(arr3[i][n] + " ");
			}
			System.out.println();
		}
	}
}
