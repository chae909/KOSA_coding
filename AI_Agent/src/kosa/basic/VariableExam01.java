package kosa.basic;

public class VariableExam01 {

	public static void main(String[] args) {
		// ������ �����͸� ��� �׸� (ex. ȫ�浿, 100, 3.14, True)
		/*
		 * �ڹٿ��� �⺻�� �����Ͱ� ����. Primitive Type byte, short, int, long : ������ float, double :
		 * �Ǽ��� char : ���� 1�� boolean : ����
		 */
		/*
		 * Object Type ���� �����ʹ� ���� �ְ� �������� �׸� �����ϴ� ����. ���� �ּҰ��� ������. =������ Reference��
		 * String : ���ڿ�
		 */

		int num; // ���� ����: �޸� �Ҵ�
		int arr[]; // �迭 ���� (Object Type)

		num = 100; // ���� �ʱ�ȭ

		int num2 = 200;
		System.out.println(num2);
		
		System.out.println("����: " + num2);
		// ��ü�� string�� �ǰԲ� ������
		
		float num3 = 3.14f;
		// float�� ��ȯ�Ϸ��� f���̱�
		
		double b = 3.14;
		int c = (int)b; // ���� ����ȯ
		System.out.println(c);
		
		double e = c; // �Ϲ��� ����ȯ - �ڵ����� �̷����
		System.out.println(e);
		
		long num4 = 100; // �⺻���ͷ� int���� long���� ��ȯ�ǰ� ����
		// long num4 = 100L; - ����ȯ ����. �⺻���ͷ��� type�� ��ȯ��Ŵ
		System.out.println(num4);
		
		int num5 = 010; // �տ� 0�� ������ 8������ �ν���. 
		System.out.println(num5);

	}

}
