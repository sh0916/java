package developer;

public class Developer {
	
	String name;		// 이름
	String language;	// 선호하는 언어
	String os;			// 선호하는 운영체제
	boolean glasses;	// 안경쓰는지
	String sick;		// 아픈곳
	boolean hood;		// 후드티 선호하는지
	String peace;		// 비둘기가 날때 어딜 돌릴지
	
	public void intro() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	
	public void isGlasses() {
		
	}

	
	public void isSick() {
		
	}

	
	public void isHood() {
		
	}

	
	public String getPeace() {
		return peace;
	}
	
	public void setPeace(String peace) {
		this.peace = peace;
	}
	
	public String inform() {
		String info = "이름 : " + name + "\n"
				+ "선호하는 언어 : " + language + "\n"
				+ "선호하는 운영체제 : " + os + "\n"
				+ "안경쓰는지 : " + glasses + "\n"
				+ "아픈곳 : " + sick + "\n"
				+ "후드티 선호하는지 : " + hood + "\n"
				+ "비둘기가 날때 어딜 돌릴지 : " + peace;
		return info;
	}
	

}
