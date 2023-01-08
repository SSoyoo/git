package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.println("\"안녕\"하세요");
		System.out.println("안녕\t하세요");
		
		String address ="부산시 사하구 하단동";
	//	int index = address. => 기본자료형이 아니라서 쩜찍으면 이것저것 나옴
		//int num=8;
	//	num. 얘는 기본 자료형이라서 쩜찍어도 안나옴
		
		int index = address.indexOf("시");
		System.out.println(index);
		
		String address2 = "부산시 동래구 사직동";
		int index3 = address2.indexOf("동");
		System.out.println(index3);
				
		//근데 뒤에있는 동은? 인덱스오브는 젤 앞에서만 찾아줌 
		
		int index4 = address2.lastIndexOf("동");
		System.out.println(index4);
//		뒤에서부터 찾느다
	
		
		String subAddress = address2.substring(0, 3);
		System.out.println(subAddress);
		
		String subAddress2 = address2.substring(0, 4);
		System.out.println(subAddress2);
		
		
		String subAddress3 = address2.substring(4);
		System.out.println(subAddress3); // 동래구 사직동 4부터 끝까지 출력 
		
		
// indexOf란 문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
// substring은 해당 문자열에서 범위를 지정해서 문자열을 잘라줌		

		
/*문제
 * "부산광역시 서구 부민동"에서 인덱스옵, 라스트인덱스오브 사용해서 "부산광역시 서구"까지 출려 ㄱ 
 */
		
		
	String address3 = "부산광역시 서구 부민동";
	int index5 =address3.indexOf("부");
	int index6 =address3.lastIndexOf("부");
	String subaddress4= address3.substring(index5,index6);
	System.out.println(subaddress4);
//		

	
// 해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능 
		
		String replaceAddress = address3.replace(' ', '-');
		System.out.println(replaceAddress);
		
		String replaceAddress2 = address3.replaceAll("서","-");
		System.out.println(replaceAddress2);

		
		String phoneNumber = "010/3300/4608, 010/1234/5678";
		//문제 010 =>011로ㅡ /를 -으로 ,를 /로 
		
//		
//		String replacePhoneNumber1 = phoneNumber.replaceAll("010", "011");
//		System.out.println(replacePhoneNumber1);
		
//		String replacePhoneNumber2 = replacePhoneNumber1.replace('/', '-');
//		System.out.println(replacePhoneNumber2);
//		
//		String replacePhoneNumber3 = replacePhoneNumber2.replace(',', '/');
//		System.out.println(replacePhoneNumber3);
//		변수를 계속 만드는게 아니라!! 재할당? 을 해준다... 하나로 쓸수있으면 하나로쓴다 
		
//		phoneNumber = phoneNumber.replaceAll("010", "011");
//		phoneNumber = phoneNumber.replace('/', '-');
//		phoneNumber.replace(',', '/');
//		
//		System.out.println(phoneNumber);
//		
//		
		
		
		String rePhone = phoneNumber.replaceAll("010","011");
		System.out.println(rePhone);
		rePhone.replaceAll(",", "/");
		System.out.println(rePhone);
		
		
		String rePhone2 = phoneNumber.replaceAll("010", "011")
				.replaceAll("/", "-")
				.replaceAll(",", "/");
		
		System.out.println(rePhone2);
		//계속 점을 찍으면 된다!
		
	}

}








