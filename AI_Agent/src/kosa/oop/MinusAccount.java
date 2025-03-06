package kosa.oop;

public class MinusAccount extends Account {
	
	private int creditLine; // ���̳ʽ� �ѵ� ����
	
	public MinusAccount() {}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}
	
	// �������̵�
	@Override
	public int withDraw(int amount) throws Exception {
		if (getBalance() + creditLine < amount) {
			throw new Exception("�ܾ׺���");
		} 
		int balance = getBalance();
		setBalance(balance-amount);
		return amount;
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("���̳ʽ� �ѵ�: " + creditLine);
	}

	public void setCreditLine(int creditLine) {
		this.creditLine = creditLine;
	}
	
	public int getCreditLine() {
		return creditLine;
	}
}
