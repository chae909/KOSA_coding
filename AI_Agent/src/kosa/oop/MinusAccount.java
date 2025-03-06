package kosa.oop;

public class MinusAccount extends Account {
	
	private int creditLine; // 마이너스 한도 지정
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// 오버라이딩
	@Override
	public int withDraw(int amount) throws Exception {
		if (getBalance() + creditLine < amount) {
			throw new Exception("잔액부족");
		} 
		int balance = getBalance();
		setBalance(balance-amount);
		return amount;
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("마이너스 한도: " + creditLine);
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	public int getCreditLine() {
		return creditLine;
	}
}
