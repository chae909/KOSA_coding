package kosa.mission;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mission05 {

	public static void main(String[] args) {
		// ���ڿ� ��
		// ���ڿ�.equals("���ڿ�")
		
		// �� ������ ������ ���ڿ��� �Է� �޽��ϴ�.
		// ��Ģ���� ���⸦ ������.
		// ex) ����1: 50
		// 		����2: 20
		//		������: + (String)
		// 		���: 70
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1: ");
		int n1 = Integer.parseInt(sc.nextLine());
		System.out.print("����2: ");
		int n2 = Integer.parseInt(sc.nextLine());
		System.out.print("������: ");
		String cal = sc.nextLine();
		
		
//		switch (cal) {
//		case "+":
//			System.out.println(n1 + n2);
//			break;
//		case "-":
//			System.out.println(n1 - n2);
//			break;
//		case "*":
//			System.out.println(n1 * n2);
//			break;
//		case "/":
//			System.out.println(n1 / n2);
//			break;
//		}
		
		
		
		double result = 0;
		
//		switch (cal) {
//		case "+":
//			result = n1 + n2;
//			break;
//		case "-":
//			result = n1 - n2;
//			break;
//		case "*":
//			result = n1 * n2;
//			break;
//		case "/":
//			result = n1 / (double)n2;
//			break;
//		}
		
		
		
		if (cal.equals("+")) {
			result = n1 + n2;
		} else if (cal.equals("-")) {
			result = n1 - n2;
		} else if (cal.equals("*")) {
			result = n1 * n2;
		} else {
			result = n1 / (double)n2;
		}
		
		
		
		System.out.println("���: " + result);
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("���: " + df.format(result));
	}
}
