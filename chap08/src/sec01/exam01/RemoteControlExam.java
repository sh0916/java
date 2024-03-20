package sec01.exam01;

public class RemoteControlExam {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl rc1 = television;
		rc1.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOff();
		
		SmartTv smartTV = new SmartTv();

		search(smartTV, "naver");
		on(smartTV);
		
		System.out.println(television.volume);
		setVol(television);
		System.out.println("after : " + television.volume);	// 10
		
		television =  setVol2(television);
		System.out.println("after2 : " + television.volume);
		
		on(television);
		
	}
	
	static void search(Searchable s, String url) {
		
		System.out.println("검색을 대신 합니다");
		s.search(url);
		
	}
	
	static void on(RemoteControl rc) {
		
		System.out.println("2 : 켜는 것 대신 해줌");
		rc.turnOn();
		
	}
	
	static void on(Television rc) {
		
		System.out.println("1 : 켜는 것 대신 해줌");
		rc.turnOn();
		
	}
	
	static void setVol(Television tv) {
		
		tv.volume = 10;
		
	}
	
	static Television setVol2(Television tv) {
		
		Television tv2 = new Television();
		tv2.volume = tv.volume;
		
		tv2.volume = 100;
		return tv2;
		
	}

}
