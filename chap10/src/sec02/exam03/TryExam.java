package sec02.exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryExam {

	public static void main(String[] args) {
		
		String strAge = "20a";
		
		int age = 0;
		
		try {
			
			age = Integer.parseInt(strAge);
		} catch (Exception e) {

			System.out.println("예외 발생");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			
			System.out.println(age -1);
		}

		ThrowsExam te = new ThrowsExam();
		try {
			
			te.getAge();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
//		te.test();
		
		try {
			
			te.customException(3);
		} catch (HumanException e) {
			
//			e.printStackTrace();
			
			// 예외 메세지를 통해서 if 처럼 사용하는 방법
			String msg = e.getMessage();
			
			if(msg.equals("E05")) {
				
				System.out.println("5 이상을 입력하세요");
			} else if(msg.equals("E10")) {
				
				System.out.println("10 미만을 입력하세요");
			}
		}
		
		FileInputStream fis = null;
		try {
			
			fis = new FileInputStream("c:\\text.txt");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} finally {
			
			if(fis != null) {
				
				try {
					
					fis.close();
				} catch (IOException e) {
					
					e.printStackTrace();
				}
			}
		}
		
		// try-with-resources
		// close 를 자동 실행해줌
		// 단, 부모중에 한번은 interface Closeable 이 필요함
		// 즉, Closeable 이 있는 경우에 사용가능
		try(
				
			FileInputStream fis2 = new FileInputStream("c:\\text.txt");
		){
		
			System.out.println();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
