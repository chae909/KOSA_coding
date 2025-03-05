package kosa.basic;

public class ForExam02 {

	public static void main(String[] args) {
		// 중첩 for문_전체구구단
		
//		for (int i=1; i <= 9; i++) {   // 각각의 단
//			for (int n=1; n <= 9; n++) { // 단의 내용
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
		
		// 퀴즈
		// 4x+5y=60
		// x, y를 모두 구하여라
		
		for (int x = 0; x <= 50; x++) {
            for (int y = 0; y <= 50; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println("x = " + x + ", y = " + y);
                }
            }
        }
	}
}
