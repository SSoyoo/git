package j06_조건;

public class If2 {

	public static void main(String[] args) {
		
		int score = 100;
		String result = null;
		
		if(score <0 || score > 100) { // else 쓰고 그 안에 이프 이렇게 안쓸거임 합쳐서 엘스이프가 나왔음
			
			System.out.println("점수는 0~100점 사이어야 합니다");
			result = "계산불가";
		}else {
			if(score >89) {
				System.out.println("90점대 입니다.");
				result= "A";
			}else if(score >79) { // 아 이래서 엘스이프가 나온거구나, 없앨거 없애서 만든거 ! 
			 System.out.println("80점대 입니다.");
			 result= "B";
			}else if(score >69) {
			 System.out.println("70점대 입니다.");
			 result= "C";
			}else if(score >59) {
			 System.out.println("60점대 입니다.");
			 result= "D?";
			}else {
				System.out.println("0~50점 사이입니다");	
			    result= "F"; //맨마직건 엘스로 끝냅시당 
						
			}
					
					
		}
		
		System.out.println("출력 :" +result);	
		
	}
	
		
      
	}
