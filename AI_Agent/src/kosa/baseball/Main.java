package kosa.baseball;

public class Main {

	public static void main(String[] args) {
        Number number = new Number();
        Check check = new Check();
        int count = 0;

        while (true) {
            count++;
            number.input();
            check.checkStrike(number.getAns(), number.getNum1(), number.getNum2(), number.getNum3());

            if (check.getStrikeCount() == 3) {
                System.out.println(count + "번째만에 정답");
                break;
            }
        }
    }
    
}
