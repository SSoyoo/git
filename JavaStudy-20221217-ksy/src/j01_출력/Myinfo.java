package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1='김';
		char name2='소';
		char name3='유';
		
		int birth = 0624;
		
		String address = "부산시 사하구";
// 		CTRL 스페이스바 자동완성			
//		//sysout자동완성 System.out.println();
		System.out.print("이름 :");
//		System.out.println(name1+name2+name3);
		System.out.println(""+name1+name2+name3);
		System.out.print("생일: ");
		System.out.println(birth);
		System.out.print("주소:");
		System.out.println(address);
	}

}
