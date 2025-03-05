package kosa.video;

public class Main {

	public static void main(String[] args) {
		Video v1 = new Video("1", "Ironman", "RDJ");
		Video v2 = new Video("2", "CaptainAmerica", "ChrisEvans");
		Video v3 = new Video("3", "Thor", "ChisHemsworth");
		
		GeneralMember gm1 = new GeneralMember("aaa", "ä����", "�����");
		GeneralMember gm2 = new GeneralMember("bbb", "ä����", "��õ��");
		GeneralMember gm3 = new GeneralMember("ccc", "ä����", "�Ⱦ��");
		
		SpecialMember sm1 = new SpecialMember("ddd", "�ż���", "�Ⱦ��", 10);
		SpecialMember sm2 = new SpecialMember("eee", "ä����", "�Ⱦ��", 50);

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