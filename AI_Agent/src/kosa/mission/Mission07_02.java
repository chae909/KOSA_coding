package kosa.mission;

import java.util.Random;
import java.util.Scanner;

public class Mission07_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int re = r.nextInt(100)+1;
		System.out.println(re);
		
		int n = 0;
		int count = 0;
		
		while(true) {
			do {
				System.out.println("1~100의 정수를 입력하세요: ");
				n = sc.nextInt();
			}while(n>100 || n<1);
			
			count++;
			
			if(re == n) {
				System.out.println("정답");
				break;
			}else if (re < n) {
				System.out.println("down");
			}else if (re > n) {
				System.out.println("up");
			}
		}

	}

}
