package chap05;

public class RefExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// class 안에있는 함수를 method라고 부른다
		
				/*
				 * 스택영역(쌓인것)			힙영역
				 * stack					heap
				 * 
				 * int a = 10
				 * int b = 20
				 * String name(번지수1001) =>		이성현(번지수1001) 
				 * String school(번지수2003) =>	휴먼(번지수2003)
				 * 
				 * String str(번지수300) => "10"(번지수300)
				 * 
				 * 
				 * 스택영역은 원시타입만 기록된다(기본타입)
				 * 숫자타입은 변수와 값이 스택영역에 저장된다
				 * 문자타입은 변수는 스택영역 값은 힙영역으로 번지수와 같이 저장된다
				 * 예( a == str => 10 == 번지수300 와 같다 )
				 * 기본타입에서 == 은 스택영역값을 비교한다
				 * 참조타입에서 == 은 번지수를 비교한다(스택영역의 번지수를 비교)
				 * 
				 * String d = null
				 * null은 참조하는 주소가(번지수) 없는것이다
				 * 
				 * 원시타입은 값이없는경우 사용이 불가능하다
				 */
		
		
//		참조타입은 null값을 가질수있다
		
		
//		int a;	기본타입은 값이 선언되어있지않으면 사용이 불가능하다
//		int b = 10 + a;
//		System.out.println(a);
		
		String c = "이성현";	// String c = (번지수)    =    "이성현"(번지수)
		System.out.println(c.indexOf("성")); // => 1
		c = null;				// String c = null        =    "이성현"(번지수) null값을 주면 스택영역과 힙영역사이를 끊는다
//		System.out.println(c.indexOf("성")); // => c라는 문자타입에서 값을 찾기때문에 문법상의 오류는없지만
//											 // 안의 값이 null값 때문에 오류가난다
											 // null을 쓰면 가비지컬렉터가 힙영역을 청소해준다
		System.out.println("c :" + c);	//	=> null
		//	자바는 프로그램 실행도중에 발생하는 오류를 예외라고 부른다
		//	자바는 예외와 오류 두가지가 있다
		
		String strVar1 = "이성현";
		String strVar2 = "이성현";
		
		boolean isEqual = strVar1 == strVar2;
		System.out.println("isEqual : " + isEqual);	//	=> true
		//	String 문자타입은 strVar1(번지수?번지) strVar2(번지수?번지)
		//	String 한정	두개의 문자타입의 값이 같기때문에 같은번지수를 줄수도있다(아닐수도있음)
		
//		strVar1 == "이성현";	=> true
		
		// 기본타입이 아닌경우 위의 방법은 확실하지않기때문에 값을 비교하는경우 equals를 쓰는게 좋다
		boolean isEqual2 = strVar1.equals(strVar2);
		System.out.println("isEqual2 : " + isEqual2);	// => ture
		
		
//		배열선언하는 형식 => 배열은 참조타입이다
//		int[] intArray;	=> int타입 뒤에 오는 변수들은 배열이라는뜻
//		int intArray[]; => int타입인 intArray변수는 배열이라는 뜻
		
//		new 연산자로 배열생성
//		타입[] 변수 						= 					new 타입[길이]
//		(타입뒤에 오는건 배열이라는 뜻)				(배열의 크기를 정해주는것)
		
//		타입[] 변수 = null;	=> 타입뒤에오는 변수는 배열인데 값은 null이다
//		변수 = new 타입[길이];
		
		int[] intArray = null;	// intArray변수는 배열변수이다
		intArray = new int[5];	// intArray변수안에는 배열길이가 5인 int타입의 배열을 생성한다
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;
		intArray[4] = 50;
//		null을 주는이유는 선언만 해두고 나중에 값을 할당할수있게 하기위해서다
//		int[] intArray = intArray = new int[5]; 이것도 위의 방법과 동일하다
		
		int[] intArray2 = null;
		intArray2 = new int[] {10, 20, 30, 40, 50};	//	배열안의 값이 정해진경우 값을미리줘도된다
		
		int[] intArray3 = new int[] {10, 20, 30, 40, 50};	// 이런경우	
		int[] intArray4 = {10, 20, 30, 40, 50};	//	선언과 동시에 값을줄경우에는 new 타입을 생략할수있다
		
		System.out.println(intArray4.length);	//	배열의 길이를 확인하는 방법은	배열변수.length
//		length는 읽기전용이기 때문에 length로 값을 바꿀수는 없다
		
	
//		double number = (Math.random() * 45) + 1;	// Math.random() => 0보다크고 1보다작은 랜덤수

//		Integer.parseInt => 문자타입만 정수타입으로 바꿀수있다
		
		int[] lotto = null;	//	정수타입의 배열인 lotto를 null값으로 선언
		lotto = new int[6];	//	lotto배열변수의 길이는 정수6개의 배열길이를 갖는다
		System.out.print("로또번호");
		for(int i = 0; i < lotto.length; i++) {	// lotto배열변수 길이만큼 반복문시작
			lotto[i] = (int)((Math.random() * 45) + 1);	// 배열값마다 45까지의 실수값을 랜덤으로 뽑아서 int타입으로 강제로바꿔준다
			System.out.printf(" %1$d번째 : %2$d " , i + 1, lotto[i]);	// 출력
		}
		System.out.println();
		
		//	다차원 배열
		int[][] lottos = new int[5][6];	// int타입의 배열을 int타입의 배열로 관리한다
										// 새로운 int타입의 배열안에 int타입의 배열을 넣는다
		lottos[0] = lotto;
//		lottos[1] = lotto2;	// new int[6]
		
		//	lotto2의 첫번째것
//		int lo1 = lotto2[0];
//		int lo1 = lottos[1][0];
		
		System.out.println(lottos.length);	//	=> 5개 lottos는 6개개수의배열을 가지고있는 배열변수가 5개인것이다
		System.out.println(lottos[0].length);	//	=> 6개 lottos의 1번째 배열의 길이기때문에 6개다
		
		int[] arr = new int[5];
		System.out.println("arr[1] : " + arr[1]);	//	=> 0 기본타입은 기본값이 0이 들어간다
		
		String[] arr2 = new String[3];	//	참조타입은 안에 값이 선언되어 있지않아도 사용할수있다
		System.out.println("arr2[0] : " + arr2[0]);	//	=> null 참조타일은 기본값이 null 값이 들어간다
		
		boolean[] arr3 = new boolean[6];
		System.out.println("arr3[2] : " + arr3[2]);	// => false boolean은 기본값이 false 값이 들어간다
		
		
		int[] arrInt1 = {1, 2, 3, 4, 5};
		int[] arrInt2 = arrInt1;
//		arrInt1을 arrInt2에 넣었기때문에 두개의 번지수는 같다
		
		System.out.println("arrInt2[1] : " + arrInt2[1]);	//	=> 2
		arrInt1[1] = 22;
		System.out.println("arrInt2[1] : " + arrInt2[1]);	//	=> 22
/*
 * 		stack					heap
 * 		arrInt1 (번지수 예100)	100  1	arrInt1[0] 번지수가 100번지면 100 + (0 * 4)	int배열값이 크기가 4바이트기때문
 * 		arrInt2	(번지수 예100)	104  2	arrInt1[1] 번지수가 100번지면 100 + (1 * 4)
 * 								108  3
 * 									 4
 * 									 5
 * 	arrInt2 안에 arrInt1을 참조했기때문에 두개의 번지수는 같다
 *	그래서 arrInt1의 값을 바꾸면 arrInt2의 값도 바뀐다
 */
//		해쉬코드의 값이 나오면 하나더 들어가야 내가 원하는 값을 얻을수 있다는 뜻이다
		System.out.println("arrInt1 : " + arrInt1);	//	해쉬코드의 값이나온다
		System.out.println("arrInt2 " + arrInt2);	//	arrInt1의 번지수와 같기때문에 해쉬코드의 값도 같다
		
		String[] arrStr = {"a", "b"};
		System.out.println("arrStr : " + arrStr);	// String 타입의 해쉬코드
		
		
//		앞에 new를 붙히면 새롭게 만든다는 뜻이다
		int[] newArr1 = new int[3];
		newArr1[0] = 1;
		newArr1[1] = 2;
		newArr1[2] = 3;
//		newArr1과 newArr2는 들어있는 값만 같을뿐 두개의 번지수는 다르다
//		stack영역이 아닌 heap영역의 값을 넣은것이기 때문에 번지수는 다르다
		int[] newArr2 = new int[3];
		newArr2[0] = newArr1[0];	//	newArr2[0]안에 newArr1[0]의 값을 넣어준것이기 때문에
		
		newArr1[0] = 10;	// newwArr1의 값을 바꿔도 2의 값은 바뀌지않는다
		System.out.println("newArr2[0] : " + newArr2[0]);	//	=> 1
		
		
//		향상된 반복문
//		처음값부터 끝값까지 하나씩 꺼내서 : 앞의 변수에 넣는다
//			넣어줄변수 : 넣어줄값
		for(int item : newArr1) {
			System.out.println("item : " + item);
		}
		
		
		//	얕은복사 shallow copy, thin clone, call by reference
		//	깊은복사 deep copy, deep clone, call by value
		
//		int[] child = new int[3];
		int[][] parent = new int[5][3];
		
		//	parent 크기만큼(즉 5) 반복
		for(int i = 0; i < parent.length; i++) {
			
			//	child 크기만큼(즉 3) 반복
			int[] child = new int[3];
			for(int j = 0; j < child.length; j++) {
				// child 초기값 세팅
				// 0, 1, 2	1번째
				// 1, 2, 3	2번째
				child[j] = i + j;
			}
			//	세팅한 child를 parent에 순서대로 넣기
			parent[i] = child;
			System.out.println("child[0] : " + child[0]);
		}
		for(int i = 0; i < parent.length; i++) {
			for(int j = 0; j < parent[i].length; j++) {
				System.out.println(parent[i][j] + ",");
			}
			System.out.println();
		}
		
		int[][] dim2 = {
				{1, 2},
				{1, 3, 5}
				};
		
		
		/*
		 * quiz4
		 * 0. 0부터 5까지 저장하는 배열생성
		 * 1. 50부터 555까지 저장하는 배열 만들어서 출력
		 * 2. 로또 6개 저장 (중복가능)
		 * 3. LoL대회에 팀명은 1번부터 5번까지인 5팀이 참가했음 
		 * 꼴지팀부터 순서대로 나열했더니 다음과 같았다
		 * [2, 4, 5, 1]	승리한팀 빼고
		 * 그렇다면 승리한 팀은?
		 * 4. 로또 6개 저장 (중복불가능)
		 * 5. 영화 상영 목록을 팝업으로 표시하려고 합니다
		 * 가장긴 영화이름을 기준으로 표의 너비를 결정함
		 * {"범죄도시3", "엘리멘탈", "가디언즈 오브 갤럭시", "미션임파서블", "콘크리트 유토피아"}
		 * (java에서 String의 길이는 변수.length())
		 * 가장 긴 이름의 길이를 출력
		 */
		
		// 0
		int[] quiz0 = new int[6];
		
		//	1
		int[] quiz1 = new int[555 - 50];
		for(int i = 50; i < 555; i++) {
			quiz1[i - 50] = i;
		}
		System.out.println(quiz1[500]);
		
		// 2
		System.out.println("quiz3번 로또번호");
		int[] quiz3 = new int[6];
		for(int i = 0; i < quiz3.length; i++) {
			quiz3[i] = (int)(Math.random() * 45) + 1;
			System.out.printf(" %1$d번째 : %2$d ", i + 1, quiz3[i]);
		}
		System.out.println();
		
		// 3
		int[] team = {1, 2, 3, 4, 5};
		int[] teamWin = new int[5];
		int[] teamLose = {2, 4, 5, 1};
		int[] win = new int[1];
		
		for(int i = 0; i < team.length; i++) {
			
			for(int j = 0; j < teamLose.length; j++) {
				
				if(team[i] == teamLose[j]) {
					teamWin[i] = team[i];
				} 
			}
		}
		for(int i = 0; i < teamWin.length; i++) {
			if(teamWin[i] == 0) {
				win[0] = teamWin[i];
			}
		}
		System.out.println(win[0]);
		
		
		
		// 4
		System.out.println("quiz4번 로또번호");
		int[] quiz4 = new int[6];
		for(int i = 0; i < quiz4.length; i++) {
			
			int ran = (int)(Math.random() * 45) + 1;

			for(int j = 0; j < quiz4.length; j++) {
				
//				System.out.println("ran"+ran);
				if(quiz4[j] != ran) {
					quiz4[i] = ran;
//					System.out.println("quiz4:"+quiz4[j]);
				} 
				
			}
				System.out.printf(" %1$d번째 : %2$d ", i + 1, quiz4[i]);
				
		}
		System.out.println();
		
		// 5
//		String[] movie = {"범죄도시3", "엘리멘탈", "가디언즈 오브 갤럭시", "미션임파서블", "콘크리트 유토피아"};
//		int[][] movielen;
//		int[] movieshort = new int[5];
//		
//		for(int i = 0; i < movie.length; i++) {
//			
//			for(int j = 0; j < movie.length; j++) {
//				movielen = new int[i][j];
//				
//				if(movie[i].length() > movie[j].length()) {
//					movielen[i][j] = movie[i].length();
//					System.out.println(movielen[i].length);
//				}
//			}
//		}
		
		

		/*
		 * 심화
		 * 0. 임의의 크기의 배열이 랜덤값으로 저장되어있고
		 * 같은 크기, 같은 순서, 같은 값을 가지는 두번째 배열 만들기
		 * 
		 * 1. 50개짜리 배열에는 랜덤값이 저장되어있다
		 * 맨 앞에 0번지에 0을 넣고 한칸씩 뒤로 밀기(마지막값은 사라짐)
		 * 
		 * 2. 1번 문제의 마지막 값을 0번지에 넣고 한칸씩 뒤로밀기
		 * 
		 * 3. 5개짜리 배열에 55, 47, 31, 29, 15가 들어가있음
		 * 이걸 이용해서 마지막에 0이 추가된 6개짜리 배열만들기
		 */
		
		
		
	}

}
