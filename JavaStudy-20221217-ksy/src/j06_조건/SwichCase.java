package j06_조건;

public class SwichCase {

	public static void main(String[] args) {
		
//		switch("30") { // 30을 찾아가는 것 , 정수도 문자열도 가능 
//		
//		case "10":
//			System.out.println("10입니다");
//			break; // => 시작점이 30이기 때문에 굳이 10에서 멈춰지지 않음
//		case "20":
//		System.out.println("20입니다");
//
//		case "30":
//		System.out.println("30입니다");
//
//		case "40":
//		System.out.println("40입니다");
//		break; // => 40에서 멈춤 
//		case "60":
//		System.out.println("50입니다");

// 스위치 케이스는? 좀 취향타는 거. 시작점을 잡을 수 있어서 쓰는 것. 어디서 시작되는지 잡고 밑에거 다실행된다 하면 스위치를 쓴다		
		
		
		System.out.println("프로그램 시작");
		
		String select ="35";
		
		switch(select) { // 30을 찾아가는 것 , 정수도 문자열도 가능,  변수도가능  /똑같은 값을 찾아서 실행하는 것 범위가 아님 
		
		case "10":
			System.out.println("10입니다");
			
		case "20":
			System.out.println("20입니다");
			
		case "30":
			System.out.println("30입니다");
			
		case "40":
			System.out.println("40입니다");
		
		case "60":
			System.out.println("50입니다");
			
		default:
			System.out.println("프로그램 종료");
			// default 는 해당값이 없을 때도 무조건 실행 , 있을때도 실행 없을때도 실행
		}
	}

}
