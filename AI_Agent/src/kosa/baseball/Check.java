package kosa.baseball;

public class Check {
    private int strikeCount;
    private int ballCount = 0;
    private int[] userNums;

	public Check() {}
	
    public Check(int strikeCount, int ballCount, int[] userNums) {
		super();
		this.strikeCount = strikeCount;
		this.ballCount = ballCount;
		this.userNums = userNums;
	}

	// ����� ������� ���ڸ� ���Ͽ� ����� ���
    public void checkStrike(int[] ans, int num1, int num2, int num3) {
        int[] userNums = {num1, num2, num3};
        // ��Ʈ����ũ �� �� ����
        for (int i = 0; i < 3; i++) {
            if (ans[i] == userNums[i]) {
                strikeCount++;
            } 
            else {  // ��Ʈ����ũ�� �ƴϸ� �� üũ
                ballCount++;
            }
        }
            
        System.out.println(strikeCount + "S " + ballCount + "B");
        

        if (strikeCount == 3) {
            System.out.println("�����Դϴ�! ���� ����.");
        } else {
        	strikeCount = 0;
            ballCount = 0;
        }
    }

    
    
    
    
    
    
    
    
	public int getStrikeCount() {
		return strikeCount;
	}

	public void setStrikeCount(int strikeCount) {
		this.strikeCount = strikeCount;
	}

	public int getBallCount() {
		return ballCount;
	}

	public void setBallCount(int ballCount) {
		this.ballCount = ballCount;
	}

	public int[] getUserNums() {
		return userNums;
	}

	public void setUserNums(int[] userNums) {
		this.userNums = userNums;
	}
}
