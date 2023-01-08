package j07_반복.랜덤;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int rNum =random.nextInt(10); //0에서 괄호 안의 숫자까지의 정수를 랜덤으로 
		System.out.println(rNum);
		
		int i =0;
		while(i<10) {
			int rNum2 =random.nextInt(10);
			System.out.println(rNum2);
			i++;
		}
		
	}

}
