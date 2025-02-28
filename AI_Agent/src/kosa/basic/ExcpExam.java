package kosa.basic;

public class ExcpExam {

	public static void noEquals(int a, int b) throws Exception {
		if (a == b) {
			throw new Exception("같은 값 안돼!");

		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("1"); // 실행 O
			noEquals(10, 10); // 예외가 발생했으므로 catch로 간다
			System.out.println("2"); // 실행 X
		} catch (Exception e) {
			System.out.println("3");
			e.printStackTrace();
		} finally { // 무조건 실행
			System.out.println("4");
		}
		System.out.println("5");
	}

}
