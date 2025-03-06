package kosa.oop;

public class AccountMain2 {

	public static void main(String[] args) {
		
//		Account ca = new CheckingAccount("222-222", "홍길동", 5000, "222-222");
//		// -> 자식을 생성해서 데이터타입만 부모형으로 바꾼것!!
//		if (ca instanceof CheckingAccount) { // ca가 CheckingAccount로 형변환이 가능하다면~
//			CheckingAccount ca2 = (CheckingAccount) ca;
//			try {
//				ca2.pay("222-222", 3000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			ca2.printAccount();
//		}
		
//		ca2.printAccount();
		
		Account arr[] = {new Account("111-111", "박길동", 30000), 
				new CheckingAccount("222-222", "홍길동", 5000, "cn-222"), 
				new MinusAccount("333-333", "김길동", 5000, 10000)};
		
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
		
		MinusAccount ma = new MinusAccount("111-111", "홍길동", 5000, 10000);
		
		try {
			ma.withDraw(7000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ma.printAccount();
		
//		CheckingAccount ca = new CheckingAccount("111-111", "홍길동", 5000, "222-222");
//		try {
//			ca.pay("222-222", 1000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		ca.printAccount();
	}
}