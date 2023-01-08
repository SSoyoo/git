package j07_반복;

public class For3 {

	public static void main(String[] args) {
		/*
		 * 문제
		 * str =abcdefghijk
		 */
	

		String str = "abcdefghijk";

//		for(int i =0; i<str.length(); i++) {
//
//		System.out.println(str.substring(i,i+1));
//
//		}
	
		for(int i = 0; i<str.length(); i++) {
			String substr = str.substring(i,i++);
			System.out.println(substr);
		}
}
}