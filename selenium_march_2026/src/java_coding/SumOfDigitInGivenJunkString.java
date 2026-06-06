package java_coding;

public class SumOfDigitInGivenJunkString {
	
	
	
	public static void main(String[] args) {
		
		String input="va#@123$%fdgte^%90^%423*&jkfhfb(*1";
		
		char [] ch=input.toCharArray();
		int sum=0;
		for(int i=0; i<ch.length;i++) {
			
			char c= ch[i];
			if(Character.isDigit(c))
			{
				sum+=Character.getNumericValue(c);
			}	
			
		}
		System.out.println(sum);
	}

}
