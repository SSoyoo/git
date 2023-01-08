package j08_메소드;

public class Method1 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);
		
		System.out.println(num1 + " + " +num2+ " = " + sum + "입니다");
	
	
	}
	//add 함수를 만들었음 
	public static int add(int n1 , int n2) { // 매개변수 
		int result = n1+n2;
		System.out.println("안녕하세요");// 이거랑 리턴값의 차이는?
		return result;
		
	}

}
