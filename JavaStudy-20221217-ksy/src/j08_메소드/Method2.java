package j08_메소드;

public class Method2 {
	
	//메소드 종류
	
	// 반환도 없고 매개변수도 없는 메소드
	
	public static void test1() {
		System.out.println("test1 메소드 호출");
		
	//void 리턴값이 없으면 void
	}

	//반환이 없고 매개변수가 하나인 메소드
	
	public static void test2(int num) {
		System.out.println("num : "
				+ ""+ num);
		System.out.println("test2 메소드 호출");
		
	}
	
	//반환이 없고 매개변수가 두개인 메소드
	
	public static void test3(int num, int num2) {
		//int num을 위에서 썻지만 사용되는 범위가 다름! 
		System.out.println("num: " + num);
		System.out.println("num2: " + num2);
		System.out.println("test3 메소드 호출");
		
	}
	
	//반환은 있고 매개변수는 없는 메소드
	
	public static int test4() {
		System.out.println("test4메소드 호출");
		return 100;
		
	}
	
	
	//반환도 있고 매개변수도 있는 메소드 
	
	public static String test5(String name , int index) {
		System.out.println("name :" + name); //1
		System.out.println("index:" + index );//2
		return name + index;//3
		
	}
	
	public static void main(String[] args) {
		test1();// 불러오는 걸 호출이라고 한다!
		test2(100); // 매개변수 받는다고 작성해 놓고 괄호안에 매개변수를 안 넣어주면 오류발생! 
		
		System.out.println();
		test3(1111,2222);
		System.out.println();
		
		int a = test4(); // test4 메소드호출까지 출력
		System.out.println(a); //리턴값 100출력 
		System.out.println(test4()); // test4출력, 100도 출력
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		
		
		String result = test5("김소유",3); //1,2
		System.out.println("--------------------------------");
		System.out.println(result); //3
		System.out.println("--------------------------------");
		System.out.println(test5("김소유",1)); //1.2.3
	}

}
