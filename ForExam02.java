package kosa.basic;

public class ForExam02 {

	public static void main(String[] args) {
		// ��ø for��_��ü������
		
//		for (int i=1; i <= 9; i++) {   // ������ ��
//			for (int n=1; n <= 9; n++) { // ���� ����
//				System.out.print(n + "*" + i + "=" + (n*i));
//				System.out.println();
//			}
//			System.out.println();
//		} 
		
//		for (int i=1; i<=3; i++) {
//			for (int j=1; j<=2; j++) {
//				System.out.println("i: " + i + ", j: " + j);
//			}
//		}
		
		// ����
		// 4x+5y=60
		// x, y�� ��� ���Ͽ���
		
		for (int x = 0; x <= 50; x++) {
            for (int y = 0; y <= 50; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("x = " + x + ", y = " + y);
                }
            }
        }
	}
}
