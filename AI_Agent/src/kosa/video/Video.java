package kosa.video;

public class Video {
	// ���� ���� �ʵ�
	private String no;
	private String title;
	private String actor;
	
	// ����Ʈ ������
	public Video() {}

	//������
	public Video(String no, String title, String actor) {
		super();
		this.no = no;
		this.title = title;
		this.actor = actor;
	}

	// ���� ���� ���
	public void show() {
		System.out.println("ȸ���� ���� ���� ��ȣ: " + no);
		System.out.println("ȸ���� ���� ���� ����: " + title);
		System.out.println("ȸ���� ���� ���� ���: " + actor);
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