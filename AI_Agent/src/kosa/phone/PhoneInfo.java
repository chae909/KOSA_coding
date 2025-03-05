package kosa.phone;

public class PhoneInfo {
	private String name;
	private String number;
	private String birth;
	
	public PhoneInfo(){}
	
	public PhoneInfo(String name, String number, String birth) {
		this.name = name; // 객체의 필드를 나타내는 표시가 this이다!! (this. 을 통해서 접근한 것)
		this.number = number;
		this.birth = birth;
	}
	
	// 한명의 회원에 대한 필드를 출력하는 method
	public void show() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + number);
		System.out.println("생년월일: " + birth);
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
