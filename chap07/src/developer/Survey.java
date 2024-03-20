package developer;

import java.util.Scanner;

public class Survey {

	Scanner scan = new Scanner(System.in);
	
	public void survey(Developer dev) {
		dev.intro();
		
		System.out.println("이름 입력");
		String answer = scan.next();
		dev.setName(answer);
		
		System.out.println("선호하는 언어");
		answer = scan.next();
		dev.setLanguage(answer);
		
		System.out.println("선호하는 os");
		answer = scan.next();
		dev.setOs(answer);
		
		dev.isGlasses();
		dev.isSick();
		dev.isHood();
		
		System.out.println("비둘기가 날때 어딜 돌릴지");
		answer = scan.next();
		dev.setPeace(answer);
		String info = dev.inform();
		System.out.println(info);
	}
	
}
