package kosa.oop2;

public class MyService {
	private Dao dao;
	
	public MyService() {}

	// dao가 반드시 주입돼야함
	public MyService(Dao dao) { // data타입이 그냥 Dao여도 괜찮다!
		super();
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
}