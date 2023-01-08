package j03_연산자;

public class Operaition2 {

	public static void main(String[] args) {
//		관계연산자
		
		System.out.println(10>5);
		
		boolean result = 10>5;
		System.out.println(result);
		
		boolean result2 = 10 == 5;
		System.out.println(result2);
		
		boolean result3 = 10 != 5; //같지않니? = 안같음 = 트루
		System.out.println(result3);
		
		boolean result4 = 10< 5;
		System.out.println(result4);
		
// 		System.out.println(result + result2);  트루와 폴스는 더할수없다 , boolean끼리는 산술연산 불가      
		System.out.println(""+result+result2); // 굳이 더하고 싶으면...>문자열로 만들어서 같이 출력이 되게 하는거구나 
		
	/*
	 * 논리연산:  boolean끼리연산하는 것 
	 * AND연산(&&) - 곱 : 둘다 맞아야합니다
	 * true && true => true
	 * true && false => false
	 * false && false => false

	 * 예를들어서 회원가입할 때 , 예를들어 공백이 하나라도 있으면 안됨, 비밀번호 숫자영문자기호 하나라도 없으면(폴스)안됨
	 * 
	 * OR연산(||) - 합
	 * 
	 * true || true => true
	 * true || false => true
	 * false || false => false 
	 * 
	 * 
	 * NOT연산(!) - 부정 
	 * !true => false 
	 * !false => true
	 * 
	 * !(true && false) =>true
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
		
		
		System.out.println(!true);
		System.out.println(2000%4 == 0 && 2000%100 != 0); //false
		System.out.println(2000%4 == 0 && 2000%100 != 0 && 2000%5 == 0);//false 세개도 할 수 있당 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
