package kosa.video;

public class Video {
	// 비디오 정보 필드
	private String no;
	private String title;
	private String actor;
	
	// 디폴트 연산자
	public Video() {}

	//생성자
	public Video(String no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}

	// 비디오 정보 출력
	public void show() {
		System.out.println("회원이 빌린 비디오 번호: " + no);
		System.out.println("회원이 빌린 비디오 제목: " + title);
		System.out.println("회원이 빌린 비디오 배우: " + actor);
	}
	
	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getActorName() {
		return actor;
	}

	public void setActorName(String actor) {
		this.actor = actor;
	}

}