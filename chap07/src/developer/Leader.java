package developer;

public class Leader extends Developer {

	@Override
	public void intro() {
		System.out.println("리더 입니다");
	}
	
	@Override
	public void isGlasses() {
		this.glasses = true;
	}
	
	@Override
	public void isSick() {
		this.sick = "허리디스크 + 목디스크";
	}
	
	@Override
	public void isHood() {
		this.hood = true;
	}
	
}
