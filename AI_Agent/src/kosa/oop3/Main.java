package kosa.oop3;

public class Main {

	public static void main(String[] args) {
//		Student role = new Student();
//		Teacher role = new Teacher();
		Programmer role = new Programmer();
		
		// �͸���Ŭ������ ������ �����ϴ� role �߰�
		Role driver = new Role() {
			public void doing() {
				System.out.println("������ ������");
			}
		};
		
		Person person1 = new Person("ä����", role);
		Person person2 = new Person("ä����", driver);
		Person person3 = new Person("ȫ�浿", new Role() {
			
			@Override
			public void doing() {
				System.out.println("�׸��׸�����");
				
			}
		});
		
		person1.doIt();
		person2.doIt();
	}
}