package kosa.video;

public class SpecialMember extends GeneralMember {

//	ȸ���� ���̵� : bbb
//	ȸ���� �̸� : ��ö��
//	ȸ���� �ּ� : ����
//	ȸ���� �뿩�� ���� ��ȣ : 2
//	ȸ���� �뿩�� ���� ���� : �������2  
//	ȸ���� �뿩�� ���� ���ΰ� :������
//	ȸ���� ���ʽ� ������ ���� : 10

	// ���ʽ� ����Ʈ ����

	private int bonusPoint;

	public SpecialMember() {
	}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	public void printSMember() {
		printMember();
		System.out.println("ȸ���� ���ʽ� ������ ����: " + getBonusPoint());
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
