package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; 
		
		account = new Account("111-111", "ȫ�浿", 50000);
		
		Account account2 = new Account("222-222", "�ڱ浿", 30000);

		
		account.deposit(5000);
		
		try {
			account.withDraw(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		account.printAccount();
		System.out.println("=================");
		account2.printAccount();
		
//		System.out.println("���¹�ȣ: " + account.accountNo );
//		System.out.println("������: " + account.ownerName );
//		System.out.println("�ܾ�: " + account.balance );
//		System.out.println("=================");
//		System.out.println("���¹�ȣ: " + account2.accountNo );
//		System.out.println("������: " + account2.ownerName );
//		System.out.println("�ܾ�: " + account2.balance );
		
		
	
	}
}
