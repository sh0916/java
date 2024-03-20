package developer;

public class Junior extends Developer {
	
	@Override
	public void intro() {
		System.out.println("주니어 입니다");
	}
	
	@Override
	public void isGlasses() {
		this.glasses = false;
	}
	
	@Override
	public void isSick() {
		this.sick = "건강";
	}
	
	@Override
	public void isHood() {
		this.hood = false;
	}
	
}
