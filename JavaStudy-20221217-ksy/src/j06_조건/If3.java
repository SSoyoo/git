package j06_조건;

public class If3 {

	public static void main(String[] args) {
		
		int x = 9;
		int y= -13;
		String result = null; 
		
//1. xy둘다 양수면, 1사분면 
//2 x만 음수면 2사분면 
//3 y만음수면 3사분면
// 그 외에는 4사분면	
		
		if(x>0 && y>0) {
			result = "1사분면";
		}else if(x<0 && y>0) {
			result = "2사분면";
		}else if(x<0 && y<0) {
			result= "3사분면";
		}else {
			result = "4사분면";
		}


		System.out.println("x :" +x);
		System.out.println("y :"+ y);
		System.out.println("결과: "+result);

	}

}




//컨트롤 알트 아래방향키 = 그대로 복사됨ㅋㅋ		