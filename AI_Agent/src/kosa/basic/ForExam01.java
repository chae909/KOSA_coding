package kosa.basic;

public class ForExam01 {

	public static void main(String[] args) {

		int sum = 0;

		// 초기식; 조건식; 증감식
		for (int i = 1; i <= 10; i++) {
			sum += 1;
		}
		System.out.println("1~10까지 합" + sum);

		// 1~100까지 숫자 중 2의 배수와 3의 배수가 아닌 숫자만 출력하시오
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0 & i % 3 != 0)
				System.out.print(i + ", ");
		}
		
		System.out.println();
		
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0)
				continue; // pass하고 싶을때
			
			System.out.print(i + ", ");
		}
	}
}
