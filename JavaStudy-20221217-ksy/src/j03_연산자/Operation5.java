package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		/*
		 * score = 85
		 * result = 문자열 
		 * 
		 * 1. score 가 0보다 작거나 100보다 크면 (계산불가)
		 * 2. 89보다 크면 (a학점)
		 * 3. 79보다 크면 b학점
		 * 4. 69보다 크면 c학점
		 * 5. 59보다 크면 d 학점
		 * 6. 나머지는 f학점
		 *결과  b학점
		 */
	

	int score = 89 ;
	
//	String result = score<0 || score>100 ? "계산불가"
//			:score > 89? "A학점"
//			:score > 79? "B학점"
//			:score> 69 ? "C학점"
//			:score> 59? "D학점"
//			:"F학점";
//								
//						 
					 

	String result = null;
	
	result = score<0 || score>100 ? "계산불가"
		:score > 89? "A학점"
		:score > 79? "B학점"
		:score > 69? "C학점"					
	    :score > 59? "D학점"
		:"F학점";
						
	    System.out.println("결과"+ result);
	
	}
}
