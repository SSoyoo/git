package j04_문자열;

public class test {

	public static void main(String[] args) {
		//문제2 '님' 부분만 지워서 이름말 출력
		
				String names ="최연호님, 김소유님, 서정근님, 장나겸님";
			
				StringBuilder stringBuilder2 = new StringBuilder();
				stringBuilder2.append(names);
				
				
				int index = names.indexOf("님");//3
				stringBuilder2.delete(index, index+3);
				
				index = stringBuilder2.indexOf("님");//님을 찾을건건데 stringBuilder2에서는 이미 님이 빠졌으니 그냥 찾기만 하면됨
				stringBuilder2.delete(index, index+3);
				
				index = stringBuilder2.indexOf("님");
				stringBuilder2.delete(index, index+3);
				
				index = stringBuilder2.indexOf("님");
				stringBuilder2.delete(index, index+3); // 내가 반복하고 싶은 부분은 여기란말이야?
				
				
				System.out.println(stringBuilder2.toString()+" : delete2");
				
				

	}

}
