package j03_연산자;

public class Operation4 {

	public static void main(String[] args) {
		
		/*
		 * 윤년
		 * 해당년도가 4의 배수고 100의 배수가 아니거나 400의 배수일 때 
		 */
		
		 int year = 1999;
		 
		 String result = year% 4 ==0 
				 &&(year % 100 !=0 || year % 400 ==0)? "윤년"
						 : "윤년아님";
		 System.out.println(result);
		
		 //결과값도 자료형에 따라서 작성해줘야함
	     //연산자 앞에서 끊어주고 두번째는 왜 또 저기서 끊어 ㅋㅋㅋ 어렵네 ? 앞에서는 참인거 앞에서 끊음..클린코드 
		 
		 
		 System.out.println(year>2000 ? "2000보다 큼"
				 :year>1000? "1000보다 큼"
				 :year>500? "500보다 큼"
				 :"500이하");
		 
		//삼항연산자는 중복이 가능함 
		 
		
		
		
		
		
		
		

	}

}
