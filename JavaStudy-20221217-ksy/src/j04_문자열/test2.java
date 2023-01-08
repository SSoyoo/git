package j04_문자열;

public class test2 {

	public static void main(String[] args) {
		 String names ="최연호님, 김소유님, 서정근님, 장나겸님";
		 
		 
		 StringBuilder stringBuilder3 = new StringBuilder();
		
		stringBuilder3.append(names.substring(0,3));
		stringBuilder3.append(", ");
		
		stringBuilder3.append(names.substring(6,9));
		stringBuilder3.append(", ");
		
		stringBuilder3.append(names.substring(12, 15));
		stringBuilder3.append(", ");
		
		stringBuilder3.append(names.substring(18,21));
		
		System.out.println(stringBuilder3 + ": substing1");
		
		
		
		
		StringBuilder stringBuilder4 = new StringBuilder();
		
		int index = names.indexOf("님");
		
		stringBuilder4.append(names.substring(index-3,index));
		stringBuilder4.append(", ");
		
		index = names.indexOf("님", index+1);
		stringBuilder4.append(names.substring(index-3, index));
    stringBuilder4.append(", ");
    

		
		index = names.indexOf("님", index+1);
		stringBuilder4.append(names.substring(index-3, index));
    stringBuilder4.append(", ");
	
		
		index = names.indexOf("님", index+1);
		stringBuilder4.append(names.substring(index-3,index));
    
			
		
		
		System.out.println(stringBuilder4+ ": substing2");
	}

}
