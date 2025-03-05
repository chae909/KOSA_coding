package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
		Account account; 
		
		account = new Account("111-111", "È«±æµ¿", 50000);
		
		Account account2 = new Account("222-222", "¹Ú±æµ¿", 30000);

		
		account.deposit(5000);
		
		try {
			account.withDraw(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		account.printAccount();
		System.out.println("=================");
		account2.printAccount();
		
//		System.out.println("°èÁÂ¹øÈ£: " + account.accountNo );
//		System.out.println("°èÁÂÁÖ: " + account.ownerName );
//		System.out.println("ÀÜ¾×: " + account.balance );
//		System.out.println("=================");
//		System.out.println("°èÁÂ¹øÈ£: " + account2.accountNo );
//		System.out.println("°èÁÂÁÖ: " + account2.ownerName );
//		System.out.println("ÀÜ¾×: " + account2.balance );
		
		
	
	}
}
