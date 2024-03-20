package quiz;

/*
 * 계좌 개설
 * 
 * 계좌번호, 잔액, 사용여부 (은행명, 예금주, 히스토리)
 * 예금기능, 출금기능, 잔액조회기능 (이체기능)
 */

public class Account {
	// 필드(멤버)변수
	String accNo;			// 계좌번호
	long balance = 0;		// 잔액
	boolean isUse = false;	// 계좌 사용 가능 여부
	
	Account(String accNo) {
		this.accNo = accNo;
		this.balance = 1000;
	}

	// 예금기능
	// 잔액에 원하는 금액을 더한뒤 저장
	/*
	 * 메소드명 : in
	 * 전달인자 : int 일정 금액
	 * return 	: 없음
	 */
	
	void in(long balance) {
		
		// 입금액이 0보다 클때
		if(balance > 0) {
			this.balance += balance;
			System.out.println(balance + "원이 입금되었습니다");
		} else {
			System.out.println("입금액을 확인해주세요. 입금액:" + balance);
		}
	}
	
	// 출금기능
	// 잔액에서 원하는 금액을 빼고 저장
	/*
	 * 메소드명 : out
	 * 전달인자 : int 출금할 금액
	 * return   : 없음
	 */
	
	void out(long balance) {
		
		// 출금액이 잔액보다 작고
		// 출금액이 0보다 클때
		if(this.balance >= balance && balance > 0) {
			this.balance -= balance;
			System.out.println(balance + "원이 출금되었습니다");
		} else {
			System.out.println("출금액을 확인해주세요. 출금액:" + balance);
		}
	}
	
	// 잔액조회기능
	// 잔액금액을 출력한다
	/*
	 * 메소드명 : print
	 * 전달인자 : 없음
	 * return   : long 잔액
	 */
	
	long print() {
		System.out.println("잔액 : " + this.balance);
		return this.balance;
	}
	
	void printAccInfo() {
		System.out.println("계좌번호 : " + this.accNo);
	}
	
	
}
