package sec01.exam01;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		
		System.out.println("오디오를 켭니다");

	}

	@Override
	public void turnOff() {
		
		System.out.println("오디오를 끕니다");

	}

	@Override
	public void setVolume(int vol) {
		// TODO Auto-generated method stub

	}

}
