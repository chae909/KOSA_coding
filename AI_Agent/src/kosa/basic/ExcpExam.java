package kosa.basic;

public class ExcpExam {

	public static void noEquals(int a, int b) throws Exception {
		if (a == b) {
			throw new Exception("���� �� �ȵ�!");

		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("1"); // ���� O
			noEquals(10, 10); // ���ܰ� �߻������Ƿ� catch�� ����
			System.out.println("2"); // ���� X
		} catch (Exception e) {
			System.out.println("3");
			e.printStackTrace();
		} finally { // ������ ����
			System.out.println("4");
		}
		System.out.println("5");
	}

}
