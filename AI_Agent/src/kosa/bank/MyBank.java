package kosa.bank;

public class MyBank {
	private Customer[] customers;
	private int customerNum=0;

	// ����Ʈ ������: Ŭ���� ���� �ε� �ܰ迡 ���� ������ �迭�� �����. 
	public MyBank() {
		customers = new Customer[10];
	}

	// addCusomer method
	// ���̵�� �̸�, �ݾ��� �Է������� �� ��ü�� ����
	// �迭 customers�� ����
	public void addCustomer(String id, String name, long balance) {
		customers[customerNum++] = new Customer(id, name, balance);
	}

	// getCustomer method
	// ���̵� �Է������� �迭 customers �� ��ġ�ϴ� �� ������ ��ȯ
	// ��ġ�ϴ� ���� ã�� ���������� null�� ��ȯ
	public Customer getCustomer(String id) {
		for (int i = 0; i < customerNum; i++) {
			if (id.equals(this.customers[i].getId())) {
				return this.customers[i];
			} 
		}
		System.out.println("���� ã�� ���߽��ϴ�. ");
		return null;
	}

	public int getCustomerNum() {
		return customerNum;
	}

	// getAllCustomers method
	// ������ ��� ���� ��� allCust ��ü ����, �ʱ�ȭ, ��ȯ
	public Customer[] getAllCustomers() {
		Customer[] allCust = new Customer[customerNum];
		for (int i = 0; i < customerNum; i++) {
	        allCust[i] = customers[i];  // customers �迭�� ������ allCust �迭�� �Ҵ�
		}
	    return allCust;
	}
}
