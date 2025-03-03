package kosa.basic;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// 구구단 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 몇단을 출력할까요?: ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while (i <= 9) {
            System.out.println(num + "*" + i + "=" + (num * i));
            ++i;
        }
	}

}
