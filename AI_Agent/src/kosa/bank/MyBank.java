package kosa.bank;

public class MyBank {
	private Customer[] customers;
	private int customerNum=0;

	// 디폴트 생성자: 클래스 최초 로딩 단계에 고객을 저장할 배열을 만든다. 
	public MyBank() {
		customers = new Customer[10];
	}

	// addCusomer method
	// 아이디와 이름, 금액을 입력했을때 고객 객체를 생성
	// 배열 customers에 저장
	public void addCustomer(String id, String name, long balance) {
		customers[customerNum++] = new Customer(id, name, balance);
	}

	// getCustomer method
	// 아이디를 입력했을때 배열 customers 중 일치하는 고객 정보를 반환
	// 일치하는 고객을 찾지 못했을때는 null값 반환
	public Customer getCustomer(String id) {
		for (int i = 0; i < customerNum; i++) {
			if (id.equals(this.customers[i].getId())) {
				return this.customers[i];
			} 
		}
		System.out.println("고객을 찾지 못했습니다. ");
		return null;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	// getAllCustomers method
	// 생성된 모든 고객을 담는 allCust 객체 선언, 초기화, 반환
	public Customer[] getAllCustomers() {
		Customer[] allCust = new Customer[customerNum];
		for (int i = 0; i < customerNum; i++) {
	        allCust[i] = customers[i];  // customers 배열의 값들을 allCust 배열에 할당
		}
	    return allCust;
	}
}
