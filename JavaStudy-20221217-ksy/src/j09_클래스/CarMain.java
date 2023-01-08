package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 문제! 
		 * 변수
		 * 
		 * 		company
		 * 		model
		 *  	color
		 *  
		 *  메소드 
		 *  	showCarInfo()
		 *  		회사명 : 000
		 *  		모델명 : 000
		 *  		색상   : 000
		 *  
		 *  
		 *  총3대
		 *  현대자동차
		 *  소나타
		 *  화이트
		 *  
		 *  기아
		 *  k5
		 *  블랙
		 *  
		 *  현대자동차 
		 *  아반떼
		 *  그레이 
		 */
		
		Car c1 = new Car(); // 기본생성자를 생략, pubilc car() 가 생략 
		Car c2 = new Car();
		Car c3 = new Car();
		
		//매개변수로 현대 소나타 화이트 이렇게 할 수는 없나? 그게 생성자인가?

		
		c1.company = "현대자동차";
		c1.model ="소나타";
		c1.color ="화이트";
		
		c2.company = "기아";
		c2.model ="K5";
		c2.color ="블랙";
		
		c3.company = "현대자동차";
		c3.model ="아반떼";
		c3.color ="그레이";
		
		
		c1.showCarInfo();
		c2.showCarInfo();
		c3.showCarInfo();
	
		
	//	new Car(); // 이게 호출이 되어있는데 생략되어있던 것 
		
		
		
	}

	
	
	
	
	
	
}
