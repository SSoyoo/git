package j07_반복.랜덤;

import java.util.Random;

public class Random2_2 {

	public static void main(String[] args) {
		//랜덤으로 10개의 값을 뽑고 가장 큰 값을 출력하는 방법 
		// 기준을 0으로 잡고 1이 나왔다 치자 대소비교 첫번째수가 더 크니까 얘가 기준 
		// 1이 기준 또 가져왔는데 3이나왔다 치자 3이 기준
		//또 가다가 2가 나왔어 2가 작아 기준 안바뀜
		// 또 오겠지..그렇게 반복 
		Random random = new Random();
		
		int i =0;
		int temp = 0;
		while(i<10) {
			int rNum =random.nextInt(10);
			System.out.println("현재 temp" + temp);
			System.out.println("새로생성된값: "+rNum);
			System.out.println( );
			
			if (i == 0) {
				temp = rNum;
			}else {
				if(temp<rNum) {
					temp =rNum;
				}
			}
			i++;
		
		}
		System.out.println("최대값:" +temp);
		
	}

}
