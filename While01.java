package kosa.basic;

public class While01 {

	public static void main(String[] args) {
		// while ��
		// 1~10���� ��
		
		int sum = 0;
		int i = 1;
		
		while (i <= 10) {
			sum += i;
			i++;
		}
		
		System.out.println("1~10���� ��: " + sum);

	}

}
