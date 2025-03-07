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

	// 정답과 사용자의 숫자를 비교하여 결과를 출력
    public void checkStrike(int[] ans, int num1, int num2, int num3) {
        int[] userNums = {num1, num2, num3};
        // 스트라이크 및 볼 판정
        for (int i = 0; i < 3; i++) {
            if (ans[i] == userNums[i]) {
                strikeCount++;
            } 
            else {  // 스트라이크가 아니면 볼 체크
                ballCount++;
            }
        }
            
        System.out.println(strikeCount + "S " + ballCount + "B");
        

        if (strikeCount == 3) {
            System.out.println("정답입니다! 게임 종료.");
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
