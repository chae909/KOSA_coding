package kosa.oop;

public class Member01 {
//	ȸ�� (�̸�, ����) (ȸ���� ���� ���)
//	ȸ�� ��ü ��� ���
//	private �ʵ�, set get method ���
//	������ �̿��Ͽ� �ʱ�ȭ
	
	private String name;
	private int age;
	
	// Member01 class ����Ʈ������
	public Member01() {}

	// ������
	public Member01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// ȸ���� ������ ����ϴ� �޼���
	public void printInfo() {
		System.out.println("ȸ�� �̸�: " + name + "\tȸ�� ����: " + age);
	}
	
	// �ʵ� get, set ����

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
