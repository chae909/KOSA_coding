package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		
//		Account ca = new CheckingAccount("222-222", "ȫ�浿", 5000, "222-222");
//		// -> �ڽ��� �����ؼ� ������Ÿ�Ը� �θ������� �ٲ۰�!!
//		if (ca instanceof CheckingAccount) { // ca�� CheckingAccount�� ����ȯ�� �����ϴٸ�~
//			CheckingAccount ca2 = (CheckingAccount) ca;
//			try {
//				ca2.pay("222-222", 3000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			ca2.printAccount();
//		}
		
//		ca2.printAccount();
		
		Account arr[] = {new Account("111-111", "�ڱ浿", 30000), 
				new CheckingAccount("222-222", "ȫ�浿", 5000, "cn-222"), 
				new MinusAccount("333-333", "��浿", 5000, 10000)};
		
		for (int i=0; i<arr.length; i++) {
			arr[i].printAccount();
			if (arr[i] instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount) arr[i];
				try {
					ca.pay("cn-222", 5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		MinusAccount ma = new MinusAccount("111-111", "ȫ�浿", 5000, 10000);
		
		try {
			ma.withDraw(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ma.printAccount();
		
//		CheckingAccount ca = new CheckingAccount("111-111", "ȫ�浿", 5000, "222-222");
//		try {
//			ca.pay("222-222", 1000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ca.printAccount();
	}
}