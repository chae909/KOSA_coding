package kosa.baseball;

import java.util.Scanner;

public class Number {
    private int ans[] = new int[3];
    private int num1;
    private int num2;
    private int num3;
    Scanner sc = new Scanner(System.in);

    // number ��ü�� ���������� �ٷ� ������ ����
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

	// ��ġ�� �ʴ� ���� 3���� �����Ͽ� ans �迭�� ����
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

    // ����ڿ��Լ� ���� 3���� �Է¹޾� num �迭�� ����
    public void input(){
        System.out.print("���� ��ġ���ʴ� ���� 3���� �Է��ϼ���: ");
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