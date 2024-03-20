package sec01.exam01;

public class SmartTv implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		
		System.out.println(url + "에서 검색 중...");

	}

	@Override
	public void turnOn() {
		
		System.out.println("스마트 Tv 를 켭니다");

	}

	@Override
	public void turnOff() {
		
		System.out.println("스마트 TV 를 끕니다");

	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub

	}

}
