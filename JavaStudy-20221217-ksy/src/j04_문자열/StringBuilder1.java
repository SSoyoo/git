package j04_문자열;

public class StringBuilder1 {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println(stringBuilder);

	
	
	stringBuilder.append("이름 : ");
	stringBuilder.append("김소유");
	stringBuilder.delete(1, 2); // 인덱스 위츠를 알려줬고 1부터시작해서 2전까지 지워라 
	
	System.out.println(stringBuilder.toString());
	
	
	
	}

}
