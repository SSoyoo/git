package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		/*
		 * 문제 반복입력회수 10회
		 * n변수에 저장
		 * 
		 * i =1
		 * i =2
		 * i =3
		 * i =4
		 * i =5
		 * i =6
		 * i =7
		 * i =8
		 * i =9
		 * i =10
		 * 
		 * -------------------
		 * 
		 * 반대로 출력되도록 
		 */
	
		// 10을 입력하면 10번반복 5 입력하면 5번반복 
		
		Scanner scanner = new Scanner(System.in);
		
		int n =0;
		System.out.println("반복횟수: ");
		
		n = scanner.nextInt();
		int i = 0;
		while(i<n) {
			System.out.println(i+1);
			i++;
		}
		
		i=0;
		
		while(i<n) {
			System.out.println(n-1);
			i++;
		}
	
	
	}
		
		
		

		
	}


