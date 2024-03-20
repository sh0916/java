package sec01.exam01;

public interface RemoteControl {

	int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	String CODE_01 = "E0010";	// 전원 불량
	String CODE_01_MSG = "전원 불량";	// 전원 불량
	
	void turnOn();
	public abstract void turnOff();
	void setVolume(int vol);
	
	// default : 메소드를 구현할 수 있음
	// 자식은 override 할수있음
	// 안해도 됨
	// public 은 생략 가능
	public default void mute() {
		System.out.println("음소거");
	}
	
}
