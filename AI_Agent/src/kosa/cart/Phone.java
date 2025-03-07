package kosa.cart;

public class Phone implements Product {
	private String phoneNo;
	private String phoneName;
	private int phonePrice;
	private int phoneDc;

	public Phone(String phoneNo, String phoneName, int phonePrice, int phoneDc) {
		super();
		this.phoneNo = phoneNo;
		this.phoneName = phoneName;
		this.phonePrice = phonePrice;
		this.phoneDc = phoneDc;
	}

	@Override
	public double discountApply() {
        return phonePrice * (1 - phonePrice / 100);

	}

	@Override
	public void show() {
		System.out.println("�� ��ȣ: " +  phoneNo);
		System.out.println("�� �̸�: " +  phoneName);
		System.out.println("�� ����: " +  phonePrice);
		System.out.println("�� ���η�: " +  phoneDc);

	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public int getPhonePrice() {
		return phonePrice;
	}

	public void setPhonePrice(int phonePrice) {
		this.phonePrice = phonePrice;
	}

	public int getPhoneDc() {
		return phoneDc;
	}

	public void setPhoneDc(int phoneDc) {
		this.phoneDc = phoneDc;
	}
}
