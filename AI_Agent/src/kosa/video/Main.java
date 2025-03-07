package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "Ironman", "RDJ");
		Video v2 = new Video("2", "CaptainAmerica", "ChrisEvans");
		Video v3 = new Video("3", "Thor", "ChisHemsworth");
		
		GeneralMember gm1 = new GeneralMember("aaa", "채정윤", "서울시");
		GeneralMember gm2 = new GeneralMember("bbb", "채종민", "과천시");
		GeneralMember gm3 = new GeneralMember("ccc", "채혜원", "안양시");
		
		SpecialMember sm1 = new SpecialMember("ddd", "신숙영", "안양시", 10);
		SpecialMember sm2 = new SpecialMember("eee", "채현석", "안양시", 50);

		gm1.rent(v1);
		
		gm2.rent(v2);
		
		gm3.rent(v3);
		
		sm1.rent(v2);
		sm2.rent(v1);
		
		gm1.printMember();
		System.out.println("---------------------------------");
		gm2.printMember();
		System.out.println("---------------------------------");
		gm3.printMember();
		System.out.println("---------------------------------");
		sm1.printSMember();
		System.out.println("---------------------------------");
		sm2.printSMember();
		
		
	}

}