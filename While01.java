package kosa.basic;

public class While01 {

	public static void main(String[] args) {
		// while 문
		// 1~10까지 합
		
		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1~10까지 합: " + sum);

	}

}
