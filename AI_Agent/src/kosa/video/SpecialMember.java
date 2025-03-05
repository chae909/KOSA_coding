package kosa.video;

public class SpecialMember extends GeneralMember {

//	회원의 아이디 : bbb
//	회원의 이름 : 김철수
//	회원의 주소 : 서울
//	회원이 대여한 비디오 번호 : 2
//	회원이 대여한 비디오 제목 : 쿵더펜더2  
//	회원이 대여한 비디오 주인공 :지성민
//	회원의 보너스 포인터 적립 : 10

	// 보너스 포인트 정보

	private int bonusPoint;

	public SpecialMember() {
	}

	public SpecialMember(String id, String name, String address, int bonusPoint) {
		super(id, name, address);
		this.bonusPoint = bonusPoint;
	}

	public void printSMember() {
		printMember();
		System.out.println("회원의 보너스 포인터 적립: " + getBonusPoint());
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

}
