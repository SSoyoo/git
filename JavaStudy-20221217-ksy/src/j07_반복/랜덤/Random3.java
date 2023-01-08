package j07_반복.랜덤;

import java.util.Random;

public class Random3 {

	public static void main(String[] args) {
		/*
		 * 문제!
		 * a,b,c 값비교 
		 * a,b,c 값의 가장 큰 값을  max에 넣어라
		 * 반복은 20회 일어나고, 범위는 50이다 
		 * ?
		 *
		 */
		
		Random random = new Random();
		
		//int a = random.nextInt(50); //1~49중에 뭐가 나왔겠지 //그리고 얘를 20개 출력해야해
//		int b = random.nextInt(50); // 이거도
//		int c = random.nextInt(50); // 이거도 
//		a의 랜덤숫자 20개를 만들었고, 
//b도 20개만들고
//c도 20개 만들고 		

		int i =0;
		int a =0;
		int b =0;
		int c =0;
		int max =0;		
		
		while(i < 20) {
			a = random.nextInt(50);
			b =random.nextInt(50);
			c =random.nextInt(50);
				
			if(a>b) {
				if(max<a) {
					max = a;
				}
					
			}else {
				if(max<b) {
					max =b;
				}
				
				
			}
			if(max<c) {
				max = c;
			}
			}
		i++;
		
		
	}
}