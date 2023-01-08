package j07_반복;

public class DoubleWhile2 {

	public static void main(String[] args) {
		/*
		 * 중첩반복문제
		 * 
		 * 1교시
		 * 		1분 //탭한번
		 * 		2분
		 * 		...
		 * 		50분
		 * 
		 * 		10분쉬는 시간
		 * 		1분	
		 * 		2분
		 * 		...	
		 * 		10분	
		 * 2교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 
		 * 		10분쉬는 시간
		 * 		1분	
		 * 		2분
		 * 		...	
		 * 		10분	
		 * 3교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 
		 * 		10분쉬는 시간
		 * 		1분	
		 * 		2분
		 * 		...	
		 * 		10분	
		 * 4교시
		 * 		1분
		 * 		2분
		 * 		...
		 * 		50분
		 * 
		 * 		10분쉬는 시간
		 * 		1분	
		 * 		2분
		 * 		...	
		 * 		10분	
		 */
		
		// 교시 4번 그안에 50분 반복 그리고 10분 반복 더 
//			int i = 0;
//			while(i<4) {
//				System.out.println((i+1)+"교시");
//				int j = 0;
//				while(j<50) {
//					System.out.println("\t"+(j+1)+"분");
//					j++;
//					
//					
//				}System.out.println("\t10분 쉬는시간");
//				int k = 0;
//				while(k<10) {
//					System.out.println("\t"+(k+1)+"분");
//					k++;
//				}
//				
//				i++;
//			}
		
		
			
		int i =0 ;
		//4번돌고임
		while(i<4) {
			System.out.println(i+1 +"교시"); //
			
			int j =0; // 이뒤로부터 분, 초기화 한번
			while(j <60) {
				int time =0;
				if(j <50) {
					time =j +1;
					System.out.println("\t"+time+"분"); //여기서 이제 분 쭉쭉
				}else{
					if(j==50) { //여기에 50이 걸리면 10분 쉬는 시간도 같이 출력이 됨
						System.out.println("\t10분 쉬는시간");
					}// 위에서 안걸리는 것들이 걸림
					time = j-50+1; // 다시 시작
					System.out.println("\t"+time+"분");
				}
				j++;
			}i++;
				
      	}
  } 
		
}
		
		
		


