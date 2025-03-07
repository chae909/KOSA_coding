package kosa.cart;

public class NoteBook implements Product {
	private String nbNo;
	private String nbName;
	private int nbPrice;
	private int nbDc;
	
	public NoteBook(String nbNo, String nbName, int nbPrice, int nbDc) {
		super();
		this.nbNo = nbNo;
		this.nbName = nbName;
		this.nbPrice = nbPrice;
		this.nbDc = nbDc;
	}

	@Override
	public double discountApply() {
		return nbPrice * (1 - nbDc / 100.0);

	}

	@Override
	public void show() {
		System.out.println("��Ʈ�� ��ȣ: " +  nbNo);
		System.out.println("��Ʈ�� �̸�: " +  nbName);
		System.out.println("��Ʈ�� ����: " +  nbPrice);
		System.out.println("��Ʈ�� ���η�: " +  nbDc);
	}

	public String getNbNo() {
		return nbNo;
	}

	public void setNbNo(String nbNo) {
		this.nbNo = nbNo;
	}

	public String getNbName() {
		return nbName;
	}

	public void setNbName(String nbName) {
		this.nbName = nbName;
	}

	public int getNbPrice() {
		return nbPrice;
	}

	public void setNbPrice(int nbPrice) {
		this.nbPrice = nbPrice;
	}

	public int getNbDc() {
		return nbDc;
	}

	public void setNbDc(int nbDc) {
		this.nbDc = nbDc;
	}
}
