package kosa.bank;

public class Account {
	private String id;
	private long balance;
	
	public Account() {}

	public Account(String id, long balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		this.balance += amount;
	}
	
	public boolean withdraw(long amount) {
		if (this.balance < amount) {
			return false;
		} else
			this.balance -= amount;
		return true;
	}

	public String getId() {
		return id;
	}

	public long getBalance() {
		return balance;
	}
}
