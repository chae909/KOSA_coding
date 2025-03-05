package kosa.oop;

public class Account {
	// Account Ŭ�����κ��� Account ��ü�� ����
	// �ʵ�: ���¹�ȣ, ������, �ܾ�
	// �޼ҵ�: �Ա��ϴ�, ����ϴ�

	// field
	String accountNo;
	String ownerName;
	int balance;
	
	// ����Ʈ ������
	// �Ķ���Ͱ� ���°�
	public Account() {}

	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	// �Ա� method
	public void deposit(int amount) {
		balance += amount;
	}

	// ��� method
	public int withDraw(int amount)throws Exception {
		if (balance < amount) {
			throw new Exception("�ܾ׺���");
		} else {
			balance -= amount;
			return amount;
		}	
	}
	public void printAccount() {
		System.out.println("���¹�ȣ: " + accountNo );
		System.out.println("������: " + ownerName );
		System.out.println("�ܾ�: " + balance );
		}
}
