package kosa.oop;

public class Account {
	// Account 클래스로부터 Account 객체를 생성
	// 필드: 계좌번호, 계좌주, 잔액
	// 메소드: 입금하다, 출금하다

	// field
	String accountNo;
	String ownerName;
	int balance;
	
	// 디폴트 생산자
	// 파라미터가 없는것
	public Account() {}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// 입금 method
	public void deposit(int amount) {
		balance += amount;
	}

	// 출금 method
	public int withDraw(int amount)throws Exception {
		if (balance < amount) {
			throw new Exception("잔액부족");
		} else {
			balance -= amount;
			return amount;
		}	
	}
	public void printAccount() {
		System.out.println("계좌번호: " + accountNo );
		System.out.println("계좌주: " + ownerName );
		System.out.println("잔액: " + balance );
		}
}
