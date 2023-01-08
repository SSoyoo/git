package j06_조건;

public class Input2_2 {

	public static void main(String[] args) {
		/*
		 * (돈이 3000원이상이 있고 카드가 있다면) 택시를타고 
		 * (돈이 3000원 이하이거나 카드만 있다면)버스를타라
		 * 그렇지 않으면 걸어가라
		 */
		
		int money = 4000;
		boolean card = true;
		
		if(money>= 3000 && card) { 
			System.out.println("택시를 타라");}
		else if(money <= 3000 || card) {
			System.out.println("버스를 타라");
		}else{
			System.out.println("걸어가라!");
		}							
	}
}
