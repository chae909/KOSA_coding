package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		int num;
		if (1 == 1) {
			num = 100;
		}
		System.out.println(num);

		// int <-> char 
		// �����Ӱ� ��ȯ�Ǵ� Ư���� ���̽�
		
		// Ȧ����ǥ �ֵ���ǥ ����
		char ch = 'A';
		String str = "A";
		System.out.println((int) ch); // ĳ���� ���� ��Ʈ������ ��ȯ

		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		// String(Object) -> int(�⺻��)
		String num3 = "100";
		int num4 = Integer.parseInt(num3);
		int result = num4 + 100;
		System.out.println(result);

//		String num5 = "100�ȳ�";
//		// NumberFormatException: �������� �ƴ� ���� ������ ����ȯ�� ���� ���ؼ� �߻��ϴ� ����
//		// ���� �ǽ��ؾ� �� �κ��� Integer.parseInt�� �� ���� ���ڰ� �ƴ� ���ɼ�
//		int num6 = Integer.parseInt(num5);
//		int result2 = num6 + 100;
//		System.out.println(result);
		
		// int(�⺻��) -> String(Object)
		int num7 = 10;
		String num8 = String.valueOf(num7); //"10"
		String num9 = num7 + ""; //"10"
		
		// �������� string�� �����ϸ� string �� ���ڿ��� �� ���ϵ�
		String str2 = 7+"7"+7;
		System.out.println(str2);
		
		boolean bool = false;
		
		System.out.println((10%3));
		
		//2�� ����̰ų� 3�� ����� �ƴ� i�� ����϶�
		for (int i=1; i<=100; i++) {
			if (!(i%2==0) | (i%3==0)) {
				System.out.print(i + ", ");
			}
		}
		
		// ���� ���� ������
		System.out.println();
		int n = 0;
		// n = n+1;
		n += 1;
		// ������ (�굵 1�� ����)
		// n++;
		System.out.println(n);
		
		int x = 10;
		int y = 0;
		
		y = x++;
		// � ������ ���� �ϴ°�
		// �����ڴ� ���� ���߿� ����� (���� y������ �������� ������ ������� �ʰ�, x���� ����)
		// y = ++x �� ��쿡�� y������ ������ ��ħ
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		// x: 11
		// y: 10
		
		// ���� ������
		// if���� ����Ͽ� ���
		int b = 40;
		int c = 20;
		int max = (b>c) ? b:c;
		//���� ���� ���̸� b ����, �����̸� c ����
		System.out.println(max);
	}

}
// ������ ���ǵ� ��ġ�� �߿���
