package kosa.oop2;

public class MyService {
	private Dao dao;
	
	public MyService() {}

	// dao�� �ݵ�� ���Եž���
	public MyService(Dao dao) { // dataŸ���� �׳� Dao���� ������!
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
}