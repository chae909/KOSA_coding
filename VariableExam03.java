package kosa.basic;

public class VariableExam03 {

	public static void main(String[] args) {
		int num;
		if (1 == 1) {
			num = 100;
		}
		System.out.println(num);

		// int <-> char 
		// 자유롭게 변환되는 특별한 케이스
		
		// 홀따옴표 쌍따옴표 구분
		char ch = 'A';
		String str = "A";
		System.out.println((int) ch); // 캐릭터 형을 인트형으로 변환

		for (int i = 65; i < 91; i++) {
			System.out.print((char)i + " ");
		}
		
		System.out.println();
		// String(Object) -> int(기본형)
		String num3 = "100";
		int num4 = Integer.parseInt(num3);
		int result = num4 + 100;
		System.out.println(result);

//		String num5 = "100안녕";
//		// NumberFormatException: 숫자형이 아닌 것이 들어갔을때 형변환을 하지 못해서 발생하는 예외
//		// 따라서 의심해야 할 부분은 Integer.parseInt에 들어간 값이 숫자가 아닐 가능성
//		int num6 = Integer.parseInt(num5);
//		int result2 = num6 + 100;
//		System.out.println(result);
		
		// int(기본형) -> String(Object)
		int num7 = 10;
		String num8 = String.valueOf(num7); //"10"
		String num9 = num7 + ""; //"10"
		
		// 정수형과 string과 연산하면 string 즉 문자열로 다 통일됨
		String str2 = 7+"7"+7;
		System.out.println(str2);
		
		boolean bool = false;
		
		System.out.println((10%3));
		
		//2의 배수이거나 3의 배수가 아닌 i를 출력하라
		for (int i=1; i<=100; i++) {
			if (!(i%2==0) | (i%3==0)) {
				System.out.print(i + ", ");
			}
		}
		
		// 복합 대입 연산자
		System.out.println();
		int n = 0;
		// n = n+1;
		n += 1;
		// 증감자 (얘도 1씩 증가)
		// n++;
		System.out.println(n);
		
		int x = 10;
		int y = 0;
		
		y = x++;
		// 어떤 연산을 먼저 하는가
		// 증감자는 가장 나중에 연산됨 (따라서 y값에는 증감자의 영향이 적용되지 않고, x에만 적용)
		// y = ++x 의 경우에는 y값에서 영향을 미침
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		// x: 11
		// y: 10
		
		// 삼항 연산자
		// if문을 대신하여 사용
		int b = 40;
		int c = 20;
		int max = (b>c) ? b:c;
		//위의 항이 참이면 b 선택, 거짓이면 c 선택
		System.out.println(max);
	}

}
// 변수가 정의된 위치가 중요함
