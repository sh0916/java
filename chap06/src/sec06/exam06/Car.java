package sec06.exam06;

public class Car {

	private int speed;
	private boolean stop;
	private String name;
	
	// setter
	// 실행블럭안은 조건문이나 반복문도 할수있다
	public void setSpeed(int speed) {
		this.speed = speed;			
		return;
	}
	
	// getter
	// 값을 읽을수만 있음
	public int getSpeed() {
		return this.speed;
	}

	/** boolean 타입은 is로 시작해도된다
	 * @return the stop
	 */
	public boolean isStop() {
		return stop;
	}

	/**
	 * @param stop the stop to set
	 */
	public void setStop(boolean stop) {
		this.stop = stop;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
}
