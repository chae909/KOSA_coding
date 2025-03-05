package kosa.oop;

public class MemberMain01 {

	public static void main(String[] args) {
//회원 (이름, 나이) (회원의 정보 출력)
//회원 전체 목록 출력
//private 필드, set get method 사용
//생성자 이용하여 초기화
		
		Member01 members[] = {
				new Member01("채정윤", 22),
				new Member01("채종민", 27),
				new Member01("채정윤", 29)
		};
		
		for (Member01 mem:members) {
			mem.printInfo();
		}
	}
}