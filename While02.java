package kosa.basic;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ����� ����ұ��?: ");
		int num = sc.nextInt();
		
		int i = 1;
		
		while (i <= 9) {
            System.out.println(num + "*" + i + "=" + (num * i));
            ++i;
        }
	}

}
