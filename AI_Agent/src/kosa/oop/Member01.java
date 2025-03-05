package kosa.oop;

public class Member01 {
//	회원 (이름, 나이) (회원의 정보 출력)
//	회원 전체 목록 출력
//	private 필드, set get method 사용
//	생성자 이용하여 초기화
	
	private String name;
	private int age;
	
	// Member01 class 디폴트생성자
	public Member01() {}

	// 생성자
	public Member01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 회원의 정보를 출력하는 메서드
	public void printInfo() {
		System.out.println("회원 이름: " + name + "\t회원 나이: " + age);
	}
	
	// 필드 get, set 모음

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
