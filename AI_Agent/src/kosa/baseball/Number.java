package kosa.baseball;

import java.util.Scanner;

public class Number {
    private int ans[] = new int[3];
    private int num1;
    private int num2;
    private int num3;
    Scanner sc = new Scanner(System.in);

    // number 객체가 생성됐을때 바로 정답을 생성
    public Number(){
        random();
    };

    public Number(int[] ans, int num1, int num2, int num3) {
		super();
		this.ans = ans;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	// 겹치지 않는 난수 3개를 생성하여 ans 배열에 저장
    public void random(){
        for(int i = 0; i < 3; i++){
            ans[i] = (int)(Math.random() * 9) + 1;
            for(int j = 0; j < i; j++){
                if(ans[i] == ans[j]){
                    i--;
                    break;
                }
            }
            System.out.println(ans[i]);
        }
    }

    // 사용자에게서 숫자 3개를 입력받아 num 배열에 저장
    public void input(){
        System.out.print("서로 겹치지않는 숫자 3개를 입력하세요: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();
    }

    
    
    
    
    
    
    
    
    
    
    
    
    public int[] getAns() {
        return ans;
    }
    public int getNum2() {
        return num2;
    }
    public int getNum3() {
        return num3;
    }
    public void setNum3(int num3) {
        this.num3 = num3;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public void setAns(int[] ans) {
        this.ans = ans;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
}