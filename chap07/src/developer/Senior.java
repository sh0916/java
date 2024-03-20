package developer;

public class Senior extends Developer {

	@Override
	public void intro() {
		System.out.println("시니어 입니다");
	}
	
	@Override
	public void isGlasses() {
		this.glasses = true;
	}
	
	@Override
	public void isSick() {
		this.sick = "허리디스크";
	}
	
	@Override
	public void isHood() {
		this.hood = false;
	}
	
}
