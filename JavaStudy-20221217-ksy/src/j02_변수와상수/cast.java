package j02_변수와상수;

public class cast {

	public static void main(String[] args) {
		char a = 'A';
		int b = a;
		
		double c = b; 
		
		System.out.println(b);
		System.out.println(c);
//		업캐스팅 : 명시하지 않아도 된다

	
//	int d = c; 
	
	int d = (int)c;
	char e = (char)d;
	
	System.out.println(d);
	System.out.println(e);
//	다운캐스팅 : 소괄호를 붙여서 다운캐스팅 해주는 것
//	다운캐스팅은 반드시 명시해줘야 함 
	
   }
}