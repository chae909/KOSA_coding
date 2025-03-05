package kosa.video;

public class GeneralMember {
	// 회원 필드
	private String id;
	private String name;
	private String address;
	// 빌린 비디오들
	private Video rentalVideo;

	// 디폴트 연산자
	public GeneralMember() {}

	// 생성자 (일반회원에 대한 정보)
	public GeneralMember(String id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	// 회원정보만 출력
	public void printMember() {
		System.out.println("회원 아이디: " + id);
		System.out.println("회원 이름: " + name);
		System.out.println("회원 주소: " + address);
		rentalVideo.show();
	}
	
	// 빌리는 메서드
	public void rent(Video video) {
		this.rentalVideo = video;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Video getRentalVideo() {
		return rentalVideo;
	}

	public void setRentalVideo(Video rentalVideo) {
		this.rentalVideo = rentalVideo;
	}


}
