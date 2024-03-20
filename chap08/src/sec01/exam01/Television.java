package sec01.exam01;

public class Television implements RemoteControl {
	
	int volume;
	int volume2;

	@Override
	public void turnOn() {
		
		System.out.println("TV 를 켭니다");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("TV 를 끕니다");
		
	}

	@Override
	public void setVolume(int vol) {
		int a = 0;
		String b = null;
		try {
			
		} catch (Exception e) {
			
		}
		int c = 0;
		System.out.println(c);
		
	}
	
	@Override
	public void mute() {
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Television) {
			Television t = (Television)obj;
			if(this.volume == t.volume
					&& this.volume2 == t.volume2) {
				return true;
			}
		}
		return false;
	}

}
