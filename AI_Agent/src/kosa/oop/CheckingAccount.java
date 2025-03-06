package kosa.oop;

public class CheckingAccount extends Account {
	private String cardNo;

	public CheckingAccount() {
	}

	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount) throws Exception {
		if (!this.cardNo.equals(cardNo) || getBalance() < amount) {
			throw new Exception("����Ҵ�");
		}
		return withDraw(amount);
	}

	@Override
	public void printAccount() {
		super.printAccount();
		System.out.println("ī���ȣ: " + cardNo);
	}
}