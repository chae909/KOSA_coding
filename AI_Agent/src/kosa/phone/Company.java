package kosa.phone;

public class Company extends PhoneInfo {
	private String dept;
	private String position;
	
	public Company() {}

	public Company(String name, String number, String birth, String dept, String position) {
		super(name, number, birth);
		this.dept = dept;
		this.position = position;
	}

	@Override
	public void show() {
		super.show();
		System.out.println("�μ�: " + dept);
		System.out.println("����: " + position);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
}
