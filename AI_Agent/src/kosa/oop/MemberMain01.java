package kosa.oop;

public class MemberMain01 {

	public static void main(String[] args) {
//ȸ�� (�̸�, ����) (ȸ���� ���� ���)
//ȸ�� ��ü ��� ���
//private �ʵ�, set get method ���
//������ �̿��Ͽ� �ʱ�ȭ
		
		Member01 members[] = {
				new Member01("ä����", 22),
				new Member01("ä����", 27),
				new Member01("ä����", 29)
		};
		
		for (Member01 mem:members) {
			mem.printInfo();
		}
	}
}