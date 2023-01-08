package j06_조건;

public class If1 {

	public static void main(String[] args) {
		
		
		boolean money = false;
		
		if(money) {
			System.out.println("택시를 타고가라");
		}
		if(!money) {
			System.out.println("걸어가라");
		}
		
		
		
		boolean money2 = false; // 수행할 문장이 하나면 중괄호 생략가능 
		if(money2) System.out.println("택시를 타고가라");
			System.out.println("잔돈을 받아라"); // 얘는 독립적으로 사용되서 그냥 출력되어버림
		
		if(!money2) 
			System.out.println("걸어가라");
		
		
		
		boolean money3 = false;
		
		if(money3) {
			System.out.println("택시를 타고가라");
		}else {
			System.out.println("걸어가라");// 돈이 있다 아닌걸 다 실행시킴 

		}
		
		//ctrl + shift + f 자동정렬

		
/*
 * if 문의 기본구조 
 * if(조건문){
 * 			<수행할문장>;
 * 			<수행할문장2>;
 * 			<수행할문장3>; 
 * 				...
 * }else {
 * 	 		<수행할문장A>;
 * 	 		<수행할문장B>;
 * 	 		<수행할문장C>;
 * 				...

 * }		
 
 */
		
			
	}

}
