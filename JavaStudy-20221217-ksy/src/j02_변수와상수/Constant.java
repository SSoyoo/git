package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		final int MAX_NUMBER=100;// 바꾸면 안되는 상수는 앞에 final을 쓴다 
		final int MIN_NUMBER=0;
		
		int number =  10;
		number=11; 
		
		//maxNumber=200; => 오류발생, 앞에 파이널을 썼으니까! 상수는 파이널을 적으면 재할당이 안된다 
	
		System.out.println("최대값:"+MAX_NUMBER);
		System.out.println("최소값:"+MIN_NUMBER);
		System.out.println("현재값"+number);
	}

}
