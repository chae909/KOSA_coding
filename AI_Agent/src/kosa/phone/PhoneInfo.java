package kosa.phone;

public class PhoneInfo {
	private String name;
	private String number;
	private String birth;
	
	public PhoneInfo(){}
	
	public PhoneInfo(String name, String number, String birth) {
		this.name = name; // ��ü�� �ʵ带 ��Ÿ���� ǥ�ð� this�̴�!! (this. �� ���ؼ� ������ ��)
		this.number = number;
		this.birth = birth;
	}
	
	// �Ѹ��� ȸ���� ���� �ʵ带 ����ϴ� method
	public void show() {
		System.out.println("�̸�: " + name);
		System.out.println("��ȭ��ȣ: " + number);
		System.out.println("�������: " + birth);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

}
